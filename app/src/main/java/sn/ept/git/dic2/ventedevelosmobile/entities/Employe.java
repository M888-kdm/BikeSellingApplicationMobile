package sn.ept.git.dic2.ventedevelosmobile.entities;

import androidx.core.app.Person;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

import java.util.HashMap;

public class Employe extends Client {

    public Integer id;
    public HashMap<String, Object> magasin;
    public HashMap<String, Object> manager;

}
