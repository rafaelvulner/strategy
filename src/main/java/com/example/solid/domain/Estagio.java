package com.example.solid.domain;

import com.example.solid.interfaces.Salario;

public class Estagio implements Salario {

    private Double salario;

    public Estagio(Double salario) {
        this.salario = salario;
    }

    @Override
    public void calcularSalario() { this.salario = salario; }

    @Override
    public Double mostraSalario() {
        return this.salario;
    }
}
