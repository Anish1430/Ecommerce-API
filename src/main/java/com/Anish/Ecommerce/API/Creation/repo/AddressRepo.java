package com.Anish.Ecommerce.API.Creation.repo;

import com.Anish.Ecommerce.API.Creation.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepo extends JpaRepository<Address,Integer> {
}
