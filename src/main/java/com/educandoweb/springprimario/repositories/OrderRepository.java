package com.educandoweb.springprimario.repositories;

import com.educandoweb.springprimario.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}