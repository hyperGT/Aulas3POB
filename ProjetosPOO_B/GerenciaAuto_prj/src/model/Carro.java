package model;

public class Carro extends Veiculo {
    
    private int qtdPortas;
    
    public Carro(String placa, String modelo, int ano, int qtdPortas) {
        super(placa, modelo, ano);
        this.qtdPortas = qtdPortas;
    }

    @Override
    public void exibeDados() {
        super.exibeDados();
        System.out.println("Quantidade de portas: " + qtdPortas);
    }

    public int getQtdPortas() {
        return qtdPortas;
    }

    public void setQtdPortas(int qtdPortas) {
        this.qtdPortas = qtdPortas;
    }

    @Override
    public String toString() {
        return "Carro - " + super.toString() + "| Portas: " + qtdPortas;
    }
    
    
}
