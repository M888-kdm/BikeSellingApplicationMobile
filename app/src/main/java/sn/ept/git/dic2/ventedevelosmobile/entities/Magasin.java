package sn.ept.git.dic2.ventedevelosmobile.entities;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Magasin {

    @PrimaryKey(autoGenerate = true)
    private Integer id;
    private String nom;
    private String codeZip;
    private String anneeModel;
    private String adresse;
    private String ville;
    private String etat;

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

    public String getCodeZip() {
        return codeZip;
    }

    public void setCodeZip(String codeZip) {
        this.codeZip = codeZip;
    }

    public String getAnneeModel() {
        return anneeModel;
    }

    public void setAnneeModel(String anneeModel) {
        this.anneeModel = anneeModel;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }
}
