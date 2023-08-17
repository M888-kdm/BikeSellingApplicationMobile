package sn.ept.git.dic2.ventedevelosmobile.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import sn.ept.git.dic2.ventedevelosmobile.R;
import sn.ept.git.dic2.ventedevelosmobile.entities.Produit;
import sn.ept.git.dic2.ventedevelosmobile.retrofit.RetrofitClientInstance;
import sn.ept.git.dic2.ventedevelosmobile.services.ProduitService;

public class ProductListActivity<Entity> extends AppCompatActivity {
    private ProduitAdapter produitAdapter;
    private RecyclerView recyclerView;
    private List<Produit> produits;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_list);

        ProduitService service = RetrofitClientInstance.getRetrofitInstance()
                                    .create(ProduitService.class);
        Call<List<Produit>> call = service.findAll();
        call.enqueue(new Callback<List<Produit>>() {
            @Override
            public void onResponse(Call<List<Produit>> call, Response<List<Produit>> response) {
                if(response.code() == 200){
                    generateDataList(response.body());
                }
                else if(response.code() == 404){
                    Log.e("Products", "NOT FOUND");
                }
                else if(response.code() == 500){
                    Log.e("Products", "INTERNAL SERVER ERROR ");
                }
            }
            @Override
            public void onFailure(Call<List<Produit>> call, Throwable t) {
                Log.e("Error", "Something went wrong...");
            }
        });
    }

    private void generateDataList(List<Produit> produits){
        recyclerView = findViewById(R.id.produitRecyclerView);
        produitAdapter = new ProduitAdapter(this, produits);
        RecyclerView.LayoutManager layoutManager =
                new LinearLayoutManager(ProductListActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(produitAdapter);
    }

}