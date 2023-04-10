package org.example.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PoliciaTest {
    @Test
    void deveRetornarSalarioPoliciaTenente() {
        Patente patente = new Tenente();
        Policia policia = new Policia(5000.0f);

        policia.setPatente(patente);

        assertEquals(5300.0f, policia.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioPoliciaCapitao() {
        Patente patente = new Capitao();
        Policia policia = new Policia(5000.0f);

        policia.setPatente(patente);

        assertEquals(5600.0f, policia.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioPoliciaMajor() {
        Patente patente = new Major();
        Policia policia = new Policia(5000.0f);

        policia.setPatente(patente);

        assertEquals(6000.0f, policia.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioPoliciaCoronel() {
        Patente patente = new Coronel();
        Policia policia = new Policia(5000.0f);

        policia.setPatente(patente);

        assertEquals(6600.0f, policia.calcularSalario(), 0.01f);
    }
}