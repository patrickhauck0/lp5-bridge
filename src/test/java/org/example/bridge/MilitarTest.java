package org.example.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MilitarTest {
    @Test
    void deveRetornarSalarioMilitarTenente() {
        Patente patente = new Tenente();
        Militar militar = new Militar(4000.0f);

        militar.setPatente(patente);

        assertEquals(4240.0f, militar.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioMilitarCapitao() {
        Patente patente = new Capitao();
        Militar militar = new Militar(4000.0f);

        militar.setPatente(patente);

        assertEquals(4480.0f, militar.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioMilitarMajor() {
        Patente patente = new Major();
        Militar militar = new Militar(4000.0f);

        militar.setPatente(patente);

        assertEquals(4800.0f, militar.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioMilitarCoronel() {
        Patente patente = new Coronel();
        Militar militar = new Militar(4000.0f);

        militar.setPatente(patente);

        assertEquals(5280.0f, militar.calcularSalario(), 0.01f);
    }
}