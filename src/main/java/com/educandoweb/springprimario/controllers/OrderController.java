package com.educandoweb.springprimario.controllers;

import com.educandoweb.springprimario.entities.Order;
import com.educandoweb.springprimario.entities.User;
import com.educandoweb.springprimario.repositories.OrderRepository;
import com.educandoweb.springprimario.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private UserRepository userRepository;

    // 🔍 BUSCAR TODOS
    @GetMapping
    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    // 🔍 BUSCAR POR ID
    @GetMapping("/{id}")
    public Order findById(@PathVariable Long id) {
        return orderRepository.findById(id).orElse(null);
    }

    // 🚀 CRIAR ORDER (AGORA CORRETO)
    @PostMapping
    public Order insert(@RequestBody Order order) {

        Long userId = order.getClient().getId();

        User user = userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("User não encontrado"));

        order.setClient(user);

        return orderRepository.save(order);
    }
}