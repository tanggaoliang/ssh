package com.how2java.service;

import com.how2java.pojo.Product;

import java.util.List;

public interface ProductService {
    List<Product> list();

    void add(Product product);

    Product get(int id);

    void update(Product product);

    void delete(Product product);
}
