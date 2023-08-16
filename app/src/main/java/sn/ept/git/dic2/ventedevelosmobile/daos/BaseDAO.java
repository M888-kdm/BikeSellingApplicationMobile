package sn.ept.git.dic2.ventedevelosmobile.daos;

import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

public interface BaseDAO<T> {
    @Insert
    public void insert(T entity);

    @Update
    public void update(T entity);

    @Delete
    public void delete(T entity);
}
