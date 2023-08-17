package sn.ept.git.dic2.ventedevelosmobile.activities;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import sn.ept.git.dic2.ventedevelosmobile.R;
import sn.ept.git.dic2.ventedevelosmobile.entities.Produit;

public class ProduitAdapter extends RecyclerView.Adapter<ProduitAdapter.ProduitViewHolder> {

    private Context context;
    private List<Produit> produitList;
    private List<String> fields;

    public ProduitAdapter(Context context, List<Produit> produitList) {
        this.context = context;
        this.produitList = produitList;
    }

    @NonNull
    @Override
    public ProduitViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.produit_layout, parent, false);
        return new ProduitViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProduitViewHolder holder, int position) {
        Produit produit = produitList.get(position);
        holder.nom.setText(produit.getNom());
        holder.anneeModel.setText(Integer.toString(produit.getAnneeModel()));
        holder.prixDepart.setText(produit.getPrixDepart().toString());
        holder.marque.setText(produit.getMarque().get("nom").toString());
        holder.categorie.setText(produit.getCategorie().get("nom").toString());
    }

    @Override
    public int getItemCount() {
        return produitList.size();
    }

    public static class ProduitViewHolder extends RecyclerView.ViewHolder {
        TextView nom;
        TextView prixDepart;
        TextView anneeModel;
        TextView marque;
        TextView categorie;

        public ProduitViewHolder(@NonNull View itemView) {
            super(itemView);
            nom = itemView.findViewById(R.id.nom);
            prixDepart = itemView.findViewById(R.id.prixDepart);
            anneeModel = itemView.findViewById(R.id.anneeModel);
            marque = itemView.findViewById(R.id.marque);
            categorie = itemView.findViewById(R.id.categorie);
        }

        public TextView getNom() {
            return nom;
        }

        public void setNom(TextView nom) {
            this.nom = nom;
        }

        public TextView getPrixDepart() {
            return prixDepart;
        }

        public void setPrixDepart(TextView prixDepart) {
            this.prixDepart = prixDepart;
        }

        public TextView getAnneeModel() {
            return anneeModel;
        }

        public void setAnneeModel(TextView anneeModel) {
            this.anneeModel = anneeModel;
        }

        public TextView getMarque() {
            return marque;
        }

        public void setMarque(TextView marque) {
            this.marque = marque;
        }

        public TextView getCategorie() {
            return categorie;
        }

        public void setCategorie(TextView categorie) {
            this.categorie = categorie;
        }
    }
}