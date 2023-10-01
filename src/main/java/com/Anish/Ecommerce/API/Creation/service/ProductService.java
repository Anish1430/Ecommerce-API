package com.Anish.Ecommerce.API.Creation.service;

import com.Anish.Ecommerce.API.Creation.model.Product;
import com.Anish.Ecommerce.API.Creation.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    ProductRepo productRepo;

    public Product createProduct(Product product) {
        return productRepo.save(product);
    }
}