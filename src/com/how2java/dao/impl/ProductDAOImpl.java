package com.how2java.dao.impl;

import com.how2java.dao.ProductDAO;
import com.how2java.pojo.Product;
import org.springframework.orm.hibernate3.HibernateTemplate;

import java.util.List;

public class ProductDAOImpl extends HibernateTemplate implements ProductDAO {
    @Override
    public List<Product> list() {
        return find("from Product");
    }

    @Override
    public void add(Product p) {
        save(p);


    }

    @Override
    public Product get(int id) {
        return get(Product.class, id);
    }

    @Override
    public void update(Product product) {
        super.update(product);
    }

    @Override
    public void delete(Product product) {
        super.delete(product);
    }
}
