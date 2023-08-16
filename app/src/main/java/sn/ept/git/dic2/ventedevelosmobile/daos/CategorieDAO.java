package sn.ept.git.dic2.ventedevelosmobile.daos;

import androidx.room.Dao;
import androidx.room.Query;

import java.util.List;

import sn.ept.git.dic2.ventedevelosmobile.entities.Categorie;

@Dao
public interface CategorieDAO extends BaseDAO<Categorie>{

    @Query("SELECT * FROM categorie WHERE id = :id")
    Categorie findById(Integer id);

    @Query("SELECT * FROM categorie")
    List<Categorie> findAll();

}
