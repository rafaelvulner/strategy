package com.example.solid.domain;

import com.example.solid.Salario;

public class Clt implements Salario {

  private Double salario;

  public Clt(Double salario) {
    this.salario = salario;
  }

  @Override
  public void calcularSalario() {
    this.salario = salario - ((salario * 8 / 100) + (salario * 6 / 100));
  }

  @Override
  public Double exibirSalario() {
    return this.salario;
  }
}
