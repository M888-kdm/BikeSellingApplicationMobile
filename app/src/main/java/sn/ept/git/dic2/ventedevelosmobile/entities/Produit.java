package sn.ept.git.dic2.ventedevelosmobile.entities;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

import java.math.BigDecimal;
import java.util.HashMap;

public class Produit {

    public Integer id;
    public String nom;
    public short anneeModel;
    public HashMap<String, Object> categorie;
    public HashMap<String, Object> marque;
    public BigDecimal prixDepart;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public short getAnneeModel() {
        return anneeModel;
    }

    public void setAnneeModel(short anneeModel) {
        this.anneeModel = anneeModel;
    }

    public HashMap<String, Object> getCategorie() {
        return categorie;
    }

    public void setCategorie(HashMap<String, Object> categorie) {
        this.categorie = categorie;
    }

    public HashMap<String, Object> getMarque() {
        return marque;
    }

    public void setMarque(HashMap<String, Object> marque) {
        this.marque = marque;
    }

    public BigDecimal getPrixDepart() {
        return prixDepart;
    }

    public void setPrixDepart(BigDecimal prixDepart) {
        this.prixDepart = prixDepart;
    }
}
