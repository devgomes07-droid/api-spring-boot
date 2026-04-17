package com.educandoweb.springprimario.services;

import com.educandoweb.springprimario.entities.Order;
import com.educandoweb.springprimario.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public List<Order> findAll() {
        return repository.findAll();
    }
}
