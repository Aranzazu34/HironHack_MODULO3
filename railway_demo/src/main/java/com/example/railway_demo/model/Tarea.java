package com.example.railway_demo.model;

import jakarta.persistence.*;

@Entity
public class Tarea {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private boolean completada;

    public Tarea() {}

    public Tarea(String titulo, boolean completada) {
        this.titulo = titulo;
        this.completada = completada;
    }

    public Long getId() { return id; }
    public String getTitulo() { return titulo; }
    public boolean isCompletada() { return completada; }

    public void setTitulo(String titulo) { this.titulo = titulo; }
    public void setCompletada(boolean completada) { this.completada = completada; }
}

