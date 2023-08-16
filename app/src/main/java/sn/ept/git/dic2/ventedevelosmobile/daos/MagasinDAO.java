package sn.ept.git.dic2.ventedevelosmobile.daos;

import androidx.room.Dao;
import androidx.room.Query;

import java.util.List;

import sn.ept.git.dic2.ventedevelosmobile.entities.Magasin;

@Dao
public interface MagasinDAO extends BaseDAO<Magasin>{

    @Query("SELECT * FROM magasin WHERE id = :id")
    Magasin findById(Integer id);

    @Query("SELECT * FROM magasin")
    List<Magasin> findAll();

}
