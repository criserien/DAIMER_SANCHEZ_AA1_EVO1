package com.arepas.app.model;

import jakarta.persistence.*;

@Entity
@Table(name = "pedidos")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userId;
    private String detalle;

    // Getters y Setters
}