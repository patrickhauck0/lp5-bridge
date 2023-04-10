package org.example.bridge;

public class Marinha extends Servico {
    public Marinha(float salarioBase) {
        super(salarioBase);
    }

    public float calcularSalario() {
        return this.salarioBase * (1 + this.patente.percentualAumento());
    }
}
