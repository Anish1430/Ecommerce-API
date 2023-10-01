package com.Anish.Ecommerce.API.Creation.controller;

import com.Anish.Ecommerce.API.Creation.model.AnishOrder;
import com.Anish.Ecommerce.API.Creation.service.AnishOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class AnishOrderController {

    @Autowired
    AnishOrderService anishOrderService;

    @PostMapping
    public AnishOrder createOrder(@RequestBody AnishOrder order) {
        return anishOrderService.createOrder(order);
    }

    @GetMapping("/{orderId}")
    public  AnishOrder getOrderById(@PathVariable Integer orderId){
        return anishOrderService.getOrderById(orderId);
    }
}
