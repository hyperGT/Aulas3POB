package model;

public class Moto extends Veiculo{
    
    private int cilindrada;
    
    public Moto(String placa, String modelo, int ano, int cilindrada) {
        super(placa, modelo, ano);
        this.cilindrada = cilindrada;
    }
    
    @Override
    public void exibeDados() {
        super.exibeDados();
        System.out.println("Cilindradas: " + cilindrada);
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return "Moto - " + super.toString() + "| Cilindradas: " + cilindrada;
    }
}
