package com.educandoweb.springprimario.controllers;

import com.educandoweb.springprimario.entities.Order;
import com.educandoweb.springprimario.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService service;

    @GetMapping
    public List<Order> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Order findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    public Order insert(@RequestBody Order order) {
        return service.insert(order);
    }
}