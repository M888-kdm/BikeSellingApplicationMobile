package sn.ept.git.dic2.ventedevelosmobile.daos;

import androidx.room.Dao;
import androidx.room.Query;

import java.util.List;

import sn.ept.git.dic2.ventedevelosmobile.entities.Stock;

@Dao
public interface StockDAO extends BaseDAO<Stock>{

    @Query("SELECT * FROM stock WHERE magasin_id = :magasinId and produit_id = :produitId")
    Stock findById(Integer magasinId, Integer produitId);

    @Query("SELECT * FROM stock")
    List<Stock> findAll();

}
