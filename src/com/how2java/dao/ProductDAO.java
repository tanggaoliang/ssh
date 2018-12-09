package com.how2java.dao;

import com.how2java.pojo.Product;

import java.util.List;

public interface ProductDAO {
    List<Product> list();

    void add(Product p);

    Product get(int id);

    void update(Product product);

    void delete(Product product);
}
