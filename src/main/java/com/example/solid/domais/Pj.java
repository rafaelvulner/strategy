package com.example.solid.domais;

import com.example.solid.inteface.Salario;

public class Pj implements Salario {

  private Double salario = 60.0;

  @Override
  public void calcularSalario() {
    this.salario = this.salario * 168;
  }

  @Override
  public Double mostraSalario() {
    return this.salario;
  }
}
