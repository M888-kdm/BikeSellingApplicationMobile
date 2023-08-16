package sn.ept.git.dic2.ventedevelosmobile.entities;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

import java.math.BigDecimal;

@Entity(tableName = "produit", foreignKeys = {
        @ForeignKey(entity = Marque.class, parentColumns = "id", childColumns = "marque_id"),
        @ForeignKey(entity = Categorie.class, parentColumns = "id", childColumns = "categorie_id")
})
public class Produit {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "ID")
    private Integer id;

    @ColumnInfo(name = "nom")
    private String nom;

    @ColumnInfo(name = "prixDepart")
    private Double prixDepart;

    @ColumnInfo(name = "anneeModel")
    private short anneeModel;

    @ColumnInfo(name = "marque_id")
    private Integer marqueId;

    @ColumnInfo(name = "categorie_id")
    private Integer categorieId;

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

    public Double getPrixDepart() {
        return prixDepart;
    }

    public void setPrixDepart(Double prixDepart) {
        this.prixDepart = prixDepart;
    }

    public short getAnneeModel() {
        return anneeModel;
    }

    public void setAnneeModel(short anneeModel) {
        this.anneeModel = anneeModel;
    }

    public Integer getMarqueId() {
        return marqueId;
    }

    public void setMarqueId(Integer marqueId) {
        this.marqueId = marqueId;
    }

    public Integer getCategorieId() {
        return categorieId;
    }

    public void setCategorieId(Integer categorieId) {
        this.categorieId = categorieId;
    }
}
