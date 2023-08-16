package sn.ept.git.dic2.ventedevelosmobile.entities;
//
//import androidx.annotation.NonNull;
//import androidx.room.ColumnInfo;
//import androidx.room.Entity;
//import androidx.room.ForeignKey;
//import androidx.room.Index;
//
//import java.math.BigDecimal;
//
//import androidx.room.Entity;
//import androidx.room.ForeignKey;
//import androidx.room.Index;
//import androidx.room.PrimaryKey;
//
//@Entity(
//        tableName = "article_commande",
//        primaryKeys = {"NUMERO_COMMANDE", "LIGNE"},
//        foreignKeys = {
//                @ForeignKey(
//                        entity = Commande.class,
//                        parentColumns = "NUMERO",
//                        childColumns = "NUMERO_COMMANDE",
//                        onDelete = ForeignKey.CASCADE,
//                        onUpdate = ForeignKey.CASCADE
//                ),
//                @ForeignKey(
//                        entity = Produit.class,
//                        parentColumns = "ID",
//                        childColumns = "PRODUIT_ID",
//                        onDelete = ForeignKey.CASCADE,
//                        onUpdate = ForeignKey.CASCADE
//                )
//        },
//        indices = {
//                @Index("PRODUIT_ID")
//        }
//)
//public class ArticleCommande {
//    @NonNull
//    public int NUMERO_COMMANDE;
//    @NonNull
//    public int LIGNE;
//    @NonNull
//    public int PRODUIT_ID;
//    @NonNull
//    public int QUANTITE;
//    @NonNull
//    public double PRIX_DEPART;
//    @NonNull
//    public double REMISE;
//
//    public int getNUMERO_COMMANDE() {
//        return NUMERO_COMMANDE;
//    }
//
//    public void setNUMERO_COMMANDE(int NUMERO_COMMANDE) {
//        this.NUMERO_COMMANDE = NUMERO_COMMANDE;
//    }
//
//    public int getLIGNE() {
//        return LIGNE;
//    }
//
//    public void setLIGNE(int LIGNE) {
//        this.LIGNE = LIGNE;
//    }
//
//    public int getPRODUIT_ID() {
//        return PRODUIT_ID;
//    }
//
//    public void setPRODUIT_ID(int PRODUIT_ID) {
//        this.PRODUIT_ID = PRODUIT_ID;
//    }
//
//    public int getQUANTITE() {
//        return QUANTITE;
//    }
//
//    public void setQUANTITE(int QUANTITE) {
//        this.QUANTITE = QUANTITE;
//    }
//
//    @NonNull
//    public Double getPRIX_DEPART() {
//        return PRIX_DEPART;
//    }
//
//    public void setPRIX_DEPART(@NonNull Double PRIX_DEPART) {
//        this.PRIX_DEPART = PRIX_DEPART;
//    }
//
//    @NonNull
//    public Double getREMISE() {
//        return REMISE;
//    }
//
//    public void setREMISE(@NonNull Double REMISE) {
//        this.REMISE = REMISE;
//    }
//}
//
public class ArticleCommande {

}