package org.example.bridge;

public abstract class Servico {
    protected Patente patente;

    protected float salarioBase;

    public Servico(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public void setPatente(Patente patente) {
        this.patente = patente;
    }

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public abstract float calcularSalario();
}
