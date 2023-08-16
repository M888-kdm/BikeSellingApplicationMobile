package sn.ept.git.dic2.ventedevelosmobile.daos;

import androidx.room.Dao;
import androidx.room.Query;

import java.util.List;

import sn.ept.git.dic2.ventedevelosmobile.entities.Marque;

@Dao
public interface MarqueDAO extends BaseDAO<Marque>{

    @Query("SELECT * FROM marque WHERE id = :id")
    Marque findById(Integer id);

    @Query("SELECT * FROM marque")
    List<Marque> findAll();

}
