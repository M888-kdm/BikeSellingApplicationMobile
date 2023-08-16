package sn.ept.git.dic2.ventedevelosmobile.daos;

import androidx.room.Dao;
import androidx.room.Query;

import java.util.List;

import sn.ept.git.dic2.ventedevelosmobile.entities.Produit;

@Dao
public interface ProduitDAO extends BaseDAO<Produit>{

    @Query("SELECT * FROM produit WHERE id = :id")
    Produit findById(Integer id);

    @Query("SELECT * FROM produit")
    List<Produit> findAll();

}
