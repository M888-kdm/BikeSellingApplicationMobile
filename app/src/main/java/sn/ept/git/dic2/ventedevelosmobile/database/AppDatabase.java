//package sn.ept.git.dic2.ventedevelosmobile.database;
//
//import android.content.Context;
//
//import androidx.room.Database;
//import androidx.room.Room;
//import androidx.room.RoomDatabase;
//import androidx.room.TypeConverters;
//
//import sn.ept.git.dic2.ventedevelosmobile.converters.LocalDateConverter;
//import sn.ept.git.dic2.ventedevelosmobile.daos.*;
//import sn.ept.git.dic2.ventedevelosmobile.entities.*;
//
//@Database(entities = {ArticleCommande.class, Categorie.class, Client.class, Commande.class,
//                        Employe.class, Magasin.class, Marque.class, Produit.class, Stock.class},
//            version = 1)
////@TypeConverters(LocalDateConverter.class)
//@TypeConverters({LocalDateConverter.class})
//public abstract class AppDatabase extends RoomDatabase {
//
//    public abstract ArticleCommandeDAO articleCommandeDAO();
//    public abstract CategorieDAO categorieDAO();
//    public abstract ClientDAO clientDAO();
//    public abstract CommandeDAO commandeDAO();
//    public abstract EmployeDAO employeDAO();
//    public abstract MagasinDAO magasinDAO();
//    public abstract MarqueDAO marqueDAO();
//    public abstract ProduitDAO produitDAO();
//    public abstract StockDAO stockDAO();
//
//    private static AppDatabase instance;
//    public static AppDatabase getInstance(Context context) {
//        if (instance == null) {
//            instance = Room.databaseBuilder(context.getApplicationContext(),
//                            AppDatabase.class, "app")
//                    .createFromAsset("database1.db")
//                    .fallbackToDestructiveMigration()
//                    .build();
//        }
//        return instance;
//    }
//
//}
