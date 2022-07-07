package com.example.solid.impostos;

import com.example.solid.interfaces.Imposto;

public class CalculadoraImpostos {
    private Double calculo;

    public CalculadoraImpostos(Imposto calculo) {
        this.calculo = calculo.mostraImposto();
    }

    public void exibir() {
        System.out.println("Total = " + this.calculo);

    }


}
