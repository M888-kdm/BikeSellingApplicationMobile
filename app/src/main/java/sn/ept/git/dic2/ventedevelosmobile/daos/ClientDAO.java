package sn.ept.git.dic2.ventedevelosmobile.daos;

import androidx.room.Dao;
import androidx.room.Query;

import java.util.List;

import sn.ept.git.dic2.ventedevelosmobile.entities.Client;

@Dao
public interface ClientDAO extends BaseDAO<Client>{

    @Query("SELECT * FROM client WHERE id = :id")
    Client findById(Integer id);

    @Query("SELECT * FROM client")
    List<Client> findAll();

}
