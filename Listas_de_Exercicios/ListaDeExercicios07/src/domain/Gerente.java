package domain;

public class Gerente extends Funcionario {

    public Gerente(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        double salarioBase = super.getSalarioBase();
        return  salarioBase + (salarioBase * 0.20);
    }
    
}
