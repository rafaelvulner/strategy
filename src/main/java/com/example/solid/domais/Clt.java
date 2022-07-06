package com.example.solid.domais;

import com.example.solid.inteface.Salario;

public class Clt implements Salario {

  private Double salario;

  public Clt(Double salario) {
    this.salario = salario;
  }

  @Override
  public void calcularSalario() {
    this.salario = this.salario -  ((salario * 6 / 100) + (salario * 6 / 100));
  }

  @Override
  public Double mostraSalario() {
    return this.salario;
  }
}
