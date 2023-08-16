package sn.ept.git.dic2.ventedevelosmobile.entities;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Client extends Personne{

    @PrimaryKey(autoGenerate = true)
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
