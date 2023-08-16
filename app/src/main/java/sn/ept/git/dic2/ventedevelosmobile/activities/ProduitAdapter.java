package sn.ept.git.dic2.ventedevelosmobile.activities;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.List;

import sn.ept.git.dic2.ventedevelosmobile.R;
import sn.ept.git.dic2.ventedevelosmobile.daos.CategorieDAO;
import sn.ept.git.dic2.ventedevelosmobile.daos.MarqueDAO;
import sn.ept.git.dic2.ventedevelosmobile.entities.Categorie;
import sn.ept.git.dic2.ventedevelosmobile.entities.Marque;
import sn.ept.git.dic2.ventedevelosmobile.entities.Produit;

public class ProduitAdapter extends RecyclerView.Adapter<ProduitAdapter.ProduitViewHolder> {

    private List<Produit> produitList;

    public ProduitAdapter(List<Produit> produitList) {
        this.produitList = produitList;
    }

    @NonNull
    @Override
    public ProduitViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.produit_layout, parent, false);
        return new ProduitViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProduitViewHolder holder, int position) {
        Produit produit = produitList.get(position);
        holder.nom.setText(produit.getNom());
        holder.anneeModel.setText(produit.getAnneeModel());
        holder.prixDepart.setText(produit.getPrixDepart().toString());

        MarqueDAO marqueDAO = ProductListActivity.database.marqueDAO();
        CategorieDAO categorieDAO = ProductListActivity.database.categorieDAO();

        Marque marque = marqueDAO.findById(produit.getId());
        Categorie categorie = categorieDAO.findById(produit.getCategorieId());

        holder.marque.setText(marque.getNom());
        holder.categorie.setText(categorie.getNom());
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