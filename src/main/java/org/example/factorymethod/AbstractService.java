package org.example.factorymethod;


public abstract class AbstractService<E> {
    public abstract DAO<E> getDAO();

}
