package mateAcademy.dao;

import java.io.Serializable;

public interface GrudDao<T, ID extends Serializable> {

    T made(T entity);

    T findById(ID id);

    void update(T entity);

    void delete(T entity);

}
