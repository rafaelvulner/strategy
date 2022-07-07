package com.example.solid.impostos;

import com.example.solid.interfaces.Imposto;

public class Icms implements Imposto {
    public Double valor;

    public Icms(double valor) {
        this.valor = valor;
    }

    @Override
    public Double mostraImposto() {
        return this.valor * 0.10;
    }
}