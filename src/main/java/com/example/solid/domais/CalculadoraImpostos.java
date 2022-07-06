package com.example.solid.domais;

public class CalculadoraImpostos {


  //REMOVER ESSE CARA DAQUI E UTILIZAR O PADRÃO STRATEGY E CRIAR UM NOVO IMPOSTO PODE DAR O NOME Q QUISER VALOR * 05
  public double calcular(String imposto, double valor) {
    if (imposto.equalsIgnoreCase("ICMS"))
      return valor * 0.10;
    else if (imposto.equalsIgnoreCase("IPI"))
      return valor * 0.20;
    return valor;
  }

}
