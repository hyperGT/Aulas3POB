package domain;

public class Estagiario extends Funcionario {

    public Estagiario(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        double salarioBase = super.getSalarioBase();
        return  salarioBase + (salarioBase * 0.05);
    }
    
}
