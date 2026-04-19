package com.educandoweb.springprimario.entities;

import com.educandoweb.springprimario.entities.enums.OrderStatus;
import jakarta.persistence.*;
import java.io.Serializable;
import java.time.Instant;

@Entity
@Table(name = "tb_order")
public class Order implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Instant moment;

    // SALVA COMO INTEGER NO BANCO
    private Integer orderStatus;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private User client;

    public Order() {}

    public Order(Long id, Instant moment, User client, OrderStatus orderStatus) {
        this.id = id;
        this.moment = moment;
        this.client = client;
        setOrderStatus(orderStatus);
    }

    public Long getId() { return id; }
    public Instant getMoment() { return moment; }
    public User getClient() { return client; }

    // 🔥 CONVERSÃO INT → ENUM
    public OrderStatus getOrderStatus() {
        return OrderStatus.valueOf(orderStatus);
    }

    public void setId(Long id) { this.id = id; }
    public void setMoment(Instant moment) { this.moment = moment; }
    public void setClient(User client) { this.client = client; }

    // 🔥 CONVERSÃO ENUM → INT
    public void setOrderStatus(OrderStatus orderStatus) {
        if (orderStatus != null) {
            this.orderStatus = orderStatus.getCode();
        }
    }
}