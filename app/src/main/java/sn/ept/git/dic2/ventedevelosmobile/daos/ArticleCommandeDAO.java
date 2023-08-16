package sn.ept.git.dic2.ventedevelosmobile.daos;

import androidx.room.Dao;
import androidx.room.Query;

import java.util.List;

import sn.ept.git.dic2.ventedevelosmobile.entities.ArticleCommande;

@Dao
public interface ArticleCommandeDAO extends BaseDAO<ArticleCommande>{

    @Query("SELECT * FROM article_commande WHERE numero_commande = :commandeId and ligne = :ligne")
    ArticleCommande findById(Integer commandeId, Integer ligne);

    @Query("SELECT * FROM article_commande")
    List<ArticleCommande> findAll();

}
