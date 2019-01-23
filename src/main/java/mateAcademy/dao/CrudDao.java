package mateAcademy.dao;

import java.io.Serializable;

public interface CrudDao<T, ID extends Serializable> {

    T create(T entity);

    T findById(ID id);

    void update(T entity);

    void delete(T entity);
}
