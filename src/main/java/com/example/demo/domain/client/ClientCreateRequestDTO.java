package com.example.demo.domain.client;

import java.time.LocalDate;

public class ClientCreateRequestDTO {

    private String plan;
    private LocalDate fechaAlta;

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
