package org.example.factorymethod;

import java.util.List;

public interface DAO<E> {

    public E findyById(Object id);

    public void save (E entity);

    public void delete (Object id);

    public List<E> findAll();
}
