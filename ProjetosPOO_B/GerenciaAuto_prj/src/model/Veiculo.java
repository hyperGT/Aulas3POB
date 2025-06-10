package model;

public abstract class Veiculo implements IExibivel{

    private String placa;
    private String modelo;
    private int ano;

    public Veiculo(String placa, String modelo, int ano) {
        this.placa = placa;
        this.modelo = modelo;
        this.ano = ano;
    }

    @Override
    public void exibeDados() {
       System.out.println("Placa: " + placa + "\nModelo: " + modelo + "\nAno: " + ano);        
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Modelo: " + modelo + " | Placa: " + placa + " | Ano: " + ano;
    }   
}
