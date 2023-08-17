package sn.ept.git.dic2.ventedevelosmobile.services;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import sn.ept.git.dic2.ventedevelosmobile.entities.Produit;

public interface ProduitService {

    @GET("produit")
    Call<List<Produit>> findAll();

}
