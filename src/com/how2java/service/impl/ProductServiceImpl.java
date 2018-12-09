package com.how2java.service.impl;

import com.how2java.dao.ProductDAO;
import com.how2java.pojo.Product;
import com.how2java.service.ProductService;

import java.util.List;

public class ProductServiceImpl implements ProductService {
    ProductDAO productDAO;

    public ProductDAO getProductDAO() {
        return productDAO;
    }

    public void setProductDAO(ProductDAO productDAO) {
        this.productDAO = productDAO;
    }

    @Override
    public List<Product> list() {
        List<Product> products = productDAO.list();
        if (products.isEmpty()) {
            for (int i = 0; i < 5; i++) {
                Product product = new Product();
                product.setName("product" + i);
                productDAO.add(product);
                products.add(product);
            }
        }

        return products;
    }

    @Override
    public Product get(int id) {
        return productDAO.get(id);
    }

    @Override
    public void add(Product product) {
        productDAO.add(product);
    }

    @Override
    public void update(Product product) {
        productDAO.update(product);
    }

    @Override
    public void delete(Product product) {
        productDAO.delete(product);
    }
}
