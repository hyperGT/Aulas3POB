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
    public double calculaSalarioFinal(double salarioBase, double bonus){
        return salarioBase + (salarioBase * (bonus / 100));
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