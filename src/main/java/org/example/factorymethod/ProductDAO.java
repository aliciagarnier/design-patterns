package org.example.factorymethod;

import java.util.List;

public class ProductDAO implements DAO<Product> {
    @Override
    public Product findyById(Object id) {
        return null;
    }

    @Override
    public void save(Product entity) {

    }

    @Override
    public void delete(Object id) {

    }

    @Override
    public List<Product> findAll() {
        return null;
    }
}
