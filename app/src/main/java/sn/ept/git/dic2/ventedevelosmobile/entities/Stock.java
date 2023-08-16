package sn.ept.git.dic2.ventedevelosmobile.entities;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(primaryKeys = {"magasin_id", "PRODUIT_ID"}, foreignKeys = {
        @ForeignKey(entity = Magasin.class, parentColumns = "id", childColumns = "magasin_id"),
        @ForeignKey(entity = Produit.class, parentColumns = "ID", childColumns = "PRODUIT_ID")
})
public class Stock {

    private Integer quantite;
    @ColumnInfo(name = "magasin_id")
    @NonNull
    private Integer magasinId;
    @ColumnInfo(name = "PRODUIT_ID")
    @NonNull
    private Integer produitId;

    public Integer getQuantite() {
        return quantite;
    }

    public void setQuantite(Integer quantite) {
        this.quantite = quantite;
    }

    public Integer getMagasinId() {
        return magasinId;
    }

    public void setMagasinId(Integer magasinId) {
        this.magasinId = magasinId;
    }

    public Integer getProduitId() {
        return produitId;
    }

    public void setProduitId(Integer produitId) {
        this.produitId = produitId;
    }
}
