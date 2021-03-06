package com.example.t2008mrestfulwebservice.service;

import com.example.t2008mrestfulwebservice.entity.Product;
import com.example.t2008mrestfulwebservice.respository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class ProductService {
    @Autowired
    private ProductRepository districtRepository;

    public List<Product> findAll() {
        return districtRepository.findAll();
    }

    public Optional<Product> findById(Integer id) {
        return districtRepository.findById(id);
    }

    public Product save(Product district) {
        return districtRepository.save(district);
    }

    public List<Product> saveAll(List<Product> districts){return districtRepository.saveAll(districts);}

    public void deleteById(Integer id) {
        districtRepository.deleteById(id);
    }
}
