package domain;

public class Carro extends Veiculo {

    private int numPortas;

    // opção de contrutor padrão sem parâmetro
    /*
     * public Carro(){
     * this("Desconhecido", 0, 0);
     * }
     * ou
     */

    public Carro() {
        super(null, 0);
        this.numPortas = 0;
    }

    public Carro(String marca, int ano, int numPortas) {
        super(marca, ano);
        this.numPortas = numPortas;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Número de portas: " + numPortas);
    }

    public int getNumPortas() {
        return numPortas;
    }

    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }

}
