package model;

public class Caminhao extends Veiculo {

    private int capacidadeCarga;

    public Caminhao(String placa, String modelo, int ano, int capacidadeCarga) {
        super(placa, modelo, ano);
        this.capacidadeCarga = capacidadeCarga;
    }

    @Override
    public void exibeDados() {
        super.exibeDados();
        System.out.println("Capacidade de carga: " + capacidadeCarga);
    }

    public int getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(int capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }
    
    @Override
    public String toString() {
        return "Caminhão - " + super.toString() + "| Capacidade de carga: " + capacidadeCarga;
    }
}
