package sn.ept.git.dic2.ventedevelosmobile.entities;

import androidx.core.app.Person;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(foreignKeys = {
        @ForeignKey(entity = Magasin.class, parentColumns = "id", childColumns = "magasin_id")
})
public class Employe extends Personne {

    @PrimaryKey(autoGenerate = true)
    private Integer id;

    @ColumnInfo(name = "magasin_id")
    private Integer magasinId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMagasinId() {
        return magasinId;
    }

    public void setMagasinId(Integer magasinId) {
        this.magasinId = magasinId;
    }
}
