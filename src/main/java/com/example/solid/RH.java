package com.example.solid;

import com.example.solid.inteface.Salario;

public class RH {


  private Double salario;

  public RH(Salario salario){

    //REMOVER ESSA REGRA E NÃO DIXAR O RH VISUALIZAR ESSE MÉTODO, APENAS EXIBIR O SALARIO
    salario.calcularSalario();

    this.salario = salario.mostraSalario();
  };

  public void exibir(){
    System.out.println("Salario: "+this.salario);
  }

}
