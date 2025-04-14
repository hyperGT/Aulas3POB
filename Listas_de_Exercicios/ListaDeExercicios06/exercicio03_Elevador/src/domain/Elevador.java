package domain;

public class Elevador {
    
    private int andarAtual;
    private int totalAndares;

    public Elevador(int andarAtual, int totalAndares){
        this.andarAtual = andarAtual;
        this.totalAndares = totalAndares;
    }

    // Methods
    public void subir(){
        if(andarAtual < totalAndares){
            andarAtual++;
        }else{
            throw new IllegalArgumentException("Não pode mais subir");
        }
    }
    public void descer(){
        if(andarAtual > 1){
            andarAtual--;
        }else{
            throw new IllegalArgumentException("Não pode mais descer");
        }
    }

    public void exibirAndar(){
        System.out.println("Você está no " + andarAtual + "° Andar");
    }
}
