package sn.ept.git.dic2.ventedevelosmobile.entities;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

import java.time.LocalDate;
import java.util.Date;
import java.util.HashMap;

public class Commande {
    public Integer numero;
    public short statut;

    public String dateCommande;

    public String dateLivraisonVoulue;

    public String dateLivraison;

    public HashMap<String, Object> clientId;
    public HashMap<String, Object> vendeurId;
    public HashMap<String, Object> magasinId;
}
