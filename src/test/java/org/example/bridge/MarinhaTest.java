package org.example.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MarinhaTest {
    @Test
    void deveRetornarSalarioMarinhaTenente() {
        Patente patente = new Tenente();
        Marinha marinha = new Marinha(6000.0f);

        marinha.setPatente(patente);

        assertEquals(6360.0f, marinha.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioMarinhaCapitao() {
        Patente patente = new Capitao();
        Marinha marinha = new Marinha(6000.0f);

        marinha.setPatente(patente);

        assertEquals(6720.0f, marinha.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioMarinhaMajor() {
        Patente patente = new Major();
        Marinha marinha = new Marinha(6000.0f);

        marinha.setPatente(patente);

        assertEquals(7200.0f, marinha.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioMarinhaCoronel() {
        Patente patente = new Coronel();
        Marinha marinha = new Marinha(6000.0f);

        marinha.setPatente(patente);

        assertEquals(7920.0f, marinha.calcularSalario(), 0.01f);
    }

}