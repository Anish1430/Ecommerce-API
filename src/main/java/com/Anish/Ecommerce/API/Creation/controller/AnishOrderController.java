package com.Anish.Ecommerce.API.Creation.controller;

import com.Anish.Ecommerce.API.Creation.model.AnishOrder;
import com.Anish.Ecommerce.API.Creation.service.AnishOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class AnishOrderController {

    @Autowired
    AnishOrderService anishOrderService;

    @PostMapping
    public AnishOrder createOrder(@RequestBody AnishOrder order) {
        return anishOrderService.createOrder(order);
    }
}
