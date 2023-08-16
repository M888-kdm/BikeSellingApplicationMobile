package sn.ept.git.dic2.ventedevelosmobile.entities;

public class Personne {

    protected String prenom;
    protected String nom;
    protected String codeZip;
    protected String anneeModel;
    protected String adresse;
    protected String ville;
    protected String etat;

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
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
