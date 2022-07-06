package com.example.solid.domain;

import com.example.solid.Salario;

public class Pj implements Salario {

    private Double salario = 60.0;

    @Override
    public void calcularSalario() {
        this.salario = this.salario * 168;
    }

    @Override
    public Double exibirSalario() {
        return this.salario;
    }
}