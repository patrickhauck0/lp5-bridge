package org.example.bridge;

public class Policia extends Servico{
    public Policia(float salarioBase) {
        super(salarioBase);
    }

    public float calcularSalario() {
        return this.salarioBase * (1 + this.patente.percentualAumento());
    }
}
