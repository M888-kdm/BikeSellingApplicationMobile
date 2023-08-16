package sn.ept.git.dic2.ventedevelosmobile.daos;

import androidx.room.Dao;
import androidx.room.Query;

import java.util.List;

import sn.ept.git.dic2.ventedevelosmobile.entities.Commande;

@Dao
public interface CommandeDAO extends BaseDAO<Commande>{

    @Query("SELECT * FROM commande WHERE numero = :numero")
    Commande findById(Integer numero);

    @Query("SELECT * FROM commande")
    List<Commande> findAll();

}
