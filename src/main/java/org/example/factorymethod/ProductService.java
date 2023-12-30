package org.example.factorymethod;

import java.util.Objects;

public class ProductService extends AbstractService<Product>
{

    private DAO<Product> dao;
    @Override
    public DAO<Product> getDAO() {
        if (Objects.isNull(dao))
        {
            dao = new ProductDAO();
        }
        return dao;

    }
}
