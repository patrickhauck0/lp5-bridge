package org.example.bridge;

public class Militar extends Servico {
    public Militar(float salarioBase) {
        super(salarioBase);
    }

    public float calcularSalario() {
        return this.salarioBase * (1 + this.patente.percentualAumento());
    }
}
