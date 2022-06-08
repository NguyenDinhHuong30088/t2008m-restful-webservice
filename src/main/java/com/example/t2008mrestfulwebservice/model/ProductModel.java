package com.example.t2008mrestfulwebservice.model;

import com.example.t2008mrestfulwebservice.entity.Product;

import java.util.List;

public interface ProductModel {

    boolean save(Product product);
    boolean update(Product product, int id);
    boolean delete(int id);
    List<Product> findAll();
    Product findById(int id);

}
