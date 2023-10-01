package com.Anish.Ecommerce.API.Creation.service;

import com.Anish.Ecommerce.API.Creation.model.AnishOrder;
import com.Anish.Ecommerce.API.Creation.repo.AnishOrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnishOrderService {

    @Autowired
    AnishOrderRepo anishOrderRepo;

//    public AnishOrder createOrder(AnishOrder order) {
//        return anishOrderRepo.save(order);
//    }
}
