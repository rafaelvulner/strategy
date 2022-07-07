package com.example.solid.domain;

import com.example.solid.interfaces.Salario;

public class RH {

    private Double salario;

    public RH(Salario salario) {

        this.salario = salario.mostraSalario();
    }

    public void exibir() {
        System.out.println("Valor = " + this.salario);
    }
}