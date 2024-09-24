package com.arepas.app.model;

import jakarta.persistence.*;

@Entity
@Table(name = "sugerencias")
public class Suggestion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userId;
    private String comentario;

    // Getters y Setters
}