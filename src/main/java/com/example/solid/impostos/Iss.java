package com.example.solid.impostos;

import com.example.solid.interfaces.Imposto;

public class Iss implements Imposto {
    private double valor;

    public Iss(double valor) {
        this.valor = valor;
    }

    @Override
    public Double mostraImposto() {
        return this.valor * 0.5;

    }
}
