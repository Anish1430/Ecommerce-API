package com.Anish.Ecommerce.API.Creation.repo;

import com.Anish.Ecommerce.API.Creation.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product,Integer> {
}
