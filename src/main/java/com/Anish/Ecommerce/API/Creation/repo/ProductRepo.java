package com.Anish.Ecommerce.API.Creation.repo;

import com.Anish.Ecommerce.API.Creation.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepo extends JpaRepository<Product,Integer> {
    List<Product> findByCategory(String category);
}
