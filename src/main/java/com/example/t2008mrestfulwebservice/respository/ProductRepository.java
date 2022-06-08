package com.example.t2008mrestfulwebservice.respository;

import com.example.t2008mrestfulwebservice.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}

