package sn.ept.git.dic2.ventedevelosmobile.daos;

import androidx.room.Dao;
import androidx.room.Query;

import java.util.List;

import sn.ept.git.dic2.ventedevelosmobile.entities.Employe;

@Dao
public interface EmployeDAO extends BaseDAO<Employe>{

    @Query("SELECT * FROM employe WHERE id = :id")
    Employe findById(Integer id);

    @Query("SELECT * FROM employe")
    List<Employe> findAll();

}
