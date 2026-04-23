package com.educandoweb.springprimario.repositories;

import com.educandoweb.springprimario.entities.OrderItem;
import com.educandoweb.springprimario.entities.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
}