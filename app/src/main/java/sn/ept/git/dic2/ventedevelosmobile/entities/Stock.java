package sn.ept.git.dic2.ventedevelosmobile.entities;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

import java.util.HashMap;

public class Stock {
    public HashMap<String, Integer> stockPK;
    public int quantite;
    public HashMap<String, Object> produit;
    public HashMap<String, Object> magasin;
}
