package domain;

public class Funcionario {

    // variables
    private String nome;
    private double salarioBase;
    private char categoria;

    // constructor
    public Funcionario(String nome, double salarioBase, char categoria){
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.categoria = categoria;
    }

    // Methods
    public double calculaSalarioFinal(char categoria){
        double sFinal = salarioBase;
        switch (categoria) {
            case 'A':
                sFinal *= 1.20;
                break;
            case 'B':
                sFinal *= 1.10;
                break;

            default:                
                sFinal = salarioBase;
                break;
        }
        return sFinal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public char getCategoria() {
        return categoria;
    }

    public void setCategoria(char categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Funcionario [nome=" + nome + ", salarioBase=" + salarioBase + ", categoria=" + categoria + "]";
    }
}