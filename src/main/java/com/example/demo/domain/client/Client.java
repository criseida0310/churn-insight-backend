package com.example.demo.domain.client;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "clients")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String plan;

    @Column(name = "fecha_alta")
    private LocalDate fechaAlta;

    public Client() {}

    public Long getId() {
        return id;
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

    public LocalDate getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(LocalDate fechaAlta) {
        this.fechaAlta = fechaAlta;
    }
}
