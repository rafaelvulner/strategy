package com.example.solid;

import com.example.solid.domais.Clt;
import com.example.solid.domais.Pj;
import com.example.solid.inteface.Salario;
import org.junit.jupiter.api.Test;

class SolidApplicationTests {


  @Test
  void testeImpostos() {

    Salario clt = new Clt(1500.0);
    Salario pj = new Pj();

    RH salarioClt = new RH(clt);
    RH salarioPj = new RH(pj);

    salarioClt.exibir();
    salarioPj.exibir();

  }


}
