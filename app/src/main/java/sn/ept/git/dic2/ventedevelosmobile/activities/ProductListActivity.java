package sn.ept.git.dic2.ventedevelosmobile.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.List;

import sn.ept.git.dic2.ventedevelosmobile.R;
import sn.ept.git.dic2.ventedevelosmobile.database.AppDatabase;
import sn.ept.git.dic2.ventedevelosmobile.entities.Produit;

public class ProductListActivity extends AppCompatActivity {

    private List<Produit> produits;
    protected static AppDatabase database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        database = AppDatabase.getInstance(getApplicationContext());
        Log.i("Moussa", database.produitDAO().findAll().toString());
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_list);
    }



}