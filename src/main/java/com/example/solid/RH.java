package com.example.solid;

import com.example.solid.domain.Clt;
import com.example.solid.domain.Pj;

public class RH {

  private Double salario;

  public RH(Salario salario) {

    this.salario = salario.exibirSalario();
  }

  public void exibir() {
    System.out.println("Salario: "+this.salario);
  }


}