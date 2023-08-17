package sn.ept.git.dic2.ventedevelosmobile.entities;

import androidx.room.Entity;

@Entity
public class Client extends Personne{

    public Integer id;
    public String nom;
    public String dtype;
    public String prenom;
    public String etat;
    public String ville;
    public String codeZip;
    public String adresse;
    public String email;
    public String telephone;

}
