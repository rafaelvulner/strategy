package com.example.solid;

import com.example.solid.domain.Clt;
import org.junit.jupiter.api.Test;

class SolidApplicationTests {

    @Test
    void teste() {
        Salario clt = new Clt(1500.0);
        System.out.println(clt.exibirSalario());
    }

}
