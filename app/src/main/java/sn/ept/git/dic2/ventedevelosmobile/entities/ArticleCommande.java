package sn.ept.git.dic2.ventedevelosmobile.entities;

import java.io.Serializable;
import java.util.HashMap;

public class ArticleCommande implements Serializable {

    public HashMap<String, Integer> articleCommandePK;
    public Integer quantite;
    public Integer prixDepart;
    public Integer remise;
    public HashMap<String, Object> produit;
    public HashMap<String, Object> commande;

}