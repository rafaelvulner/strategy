package com.example.solid;

import com.example.solid.domain.Clt;
import com.example.solid.domain.Pj;
import com.example.solid.domain.RH;
import com.example.solid.impostos.CalculadoraImpostos;
import com.example.solid.impostos.Icms;
import com.example.solid.impostos.Ipi;
import com.example.solid.impostos.Iss;
import com.example.solid.interfaces.Imposto;
import com.example.solid.interfaces.Salario;
import org.junit.jupiter.api.Test;


class SolidApplicationTests {

    @Test
    void teste() {

        System.out.println("--------- Salarios ---------");

        Salario clt = new Clt(1500.0);
        Salario pj = new Pj();

        RH salarioClt = new RH(clt);
        RH salarioPj = new RH(pj);

        System.out.println("Salario CLT:");
        salarioClt.exibir();
        System.out.println("Salario PJ:");
        salarioPj.exibir();

        System.out.println("--------- Calculadora Impostos ---------");

        Imposto icms = new Icms(90.0);
        Imposto ipi = new Ipi(80.0);
        Imposto iss = new Iss(70.0);

        CalculadoraImpostos impostoIcms = new CalculadoraImpostos(icms);
        CalculadoraImpostos impostoIpi = new CalculadoraImpostos(ipi);
        CalculadoraImpostos impostoIss = new CalculadoraImpostos(iss);

        System.out.println("Imposto ICMS:");
        impostoIcms.exibir();
        System.out.println("Imposto IPI:");
        impostoIpi.exibir();
        System.out.println("Imposto ISS:");
        impostoIss.exibir();


    }

}
