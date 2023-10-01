package com.Anish.Ecommerce.API.Creation.service;

import com.Anish.Ecommerce.API.Creation.model.Address;
import com.Anish.Ecommerce.API.Creation.repo.AddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

    @Autowired
    AddressRepo addressRepo;

    public Address createAddress(Address address) {
        return addressRepo.save(address);
    }
}
