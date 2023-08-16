package sn.ept.git.dic2.ventedevelosmobile.entities;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

import java.time.LocalDate;
import java.util.Date;

@Entity(foreignKeys = {
        @ForeignKey(entity = Client.class, parentColumns = "id", childColumns = "client_id"),
        @ForeignKey(entity = Employe.class, parentColumns = "id", childColumns = "vendeur_id"),
        @ForeignKey(entity = Magasin.class, parentColumns = "id", childColumns = "magasin_id")
})
public class Commande {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "NUMERO")
    private Integer numero;
    @ColumnInfo(name = "date_livraison")
    private LocalDate dateLivraison;
    @ColumnInfo(name = "date_commande")
    private LocalDate dateCommande;
    @ColumnInfo(name = "date_livraison_voulue")
    private LocalDate dateLivraisonVoulue;
    @ColumnInfo(name = "client_id")
    private Integer clientId;
    @ColumnInfo(name = "vendeur_id")
    private Integer vendeurId;
    @ColumnInfo(name = "magasin_id")
    private Integer magasinId;

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public LocalDate getDateLivraison() {
        return dateLivraison;
    }

    public void setDateLivraison(LocalDate dateLivraison) {
        this.dateLivraison = dateLivraison;
    }

    public LocalDate getDateCommande() {
        return dateCommande;
    }

    public void setDateCommande(LocalDate dateCommande) {
        this.dateCommande = dateCommande;
    }

    public LocalDate getDateLivraisonVoulue() {
        return dateLivraisonVoulue;
    }

    public void setDateLivraisonVoulue(LocalDate dateLivraisonVoulue) {
        this.dateLivraisonVoulue = dateLivraisonVoulue;
    }

    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    public Integer getVendeurId() {
        return vendeurId;
    }

    public void setVendeurId(Integer vendeurId) {
        this.vendeurId = vendeurId;
    }

    public Integer getMagasinId() {
        return magasinId;
    }

    public void setMagasinId(Integer magasinId) {
        this.magasinId = magasinId;
    }
}
