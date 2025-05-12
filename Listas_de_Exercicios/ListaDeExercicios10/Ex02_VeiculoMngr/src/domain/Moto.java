package domain;

public class Moto extends Veiculo{
    
    private boolean temPartidaEletrica;

    public Moto(){
        super(null, 0);
        temPartidaEletrica = false;
    }

    public Moto(String marca, int ano, boolean temPartidaEletrica){
        super(marca, ano);
        this.temPartidaEletrica = temPartidaEletrica;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        if(temPartidaEletrica){
            System.out.println("Partida Elétrica: Sim");
        }else{
            System.out.println("Partida Elétrica: Não");
        }
    }

    public boolean isTemPartidaEletrica() {
        return temPartidaEletrica;
    }

    public void setTemPartidaEletrica(boolean temPartidaEletrica) {
        this.temPartidaEletrica = temPartidaEletrica;
    }
    
}
