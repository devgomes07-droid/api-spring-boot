package com.educandoweb.springprimario.services;

import com.educandoweb.springprimario.entities.Order;
import com.educandoweb.springprimario.entities.User;
import com.educandoweb.springprimario.repositories.OrderRepository;
import com.educandoweb.springprimario.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private UserRepository userRepository;

    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    public Order findById(Long id) {
        return orderRepository.findById(id).orElseThrow();
    }

    public Order insert(Order order) {

        User user = userRepository.findById(order.getClient().getId())
                .orElseThrow(() -> new RuntimeException("User não encontrado"));

        order.setClient(user);
        order.setMoment(Instant.now()); // 🔥 regra de negócio aqui

        return orderRepository.save(order);
    }
}
