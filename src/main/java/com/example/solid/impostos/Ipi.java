package com.example.solid.impostos;

import com.example.solid.interfaces.Imposto;

public class Ipi implements Imposto {
    public Double valor;

    public Ipi(double valor) {
        this.valor = valor;
    }

    @Override
    public Double mostraImposto() {
        return this.valor * 0.20;
    }
}
