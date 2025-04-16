package domain;

import util.*;
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
            throw new InvalidFloorException("Já chegou no último andar.");
        }
    }

    public void subir(int qntAndares){
        
        try{
            
            if(qntAndares < totalAndares){
                andarAtual += qntAndares;   // atualiza o andar atual
                return;            
            }

            if(qntAndares == -1){
                andarAtual = totalAndares;  // vai direto pro último andar
                return;
            }

        }catch(InvalidFloorException e){
            
            e.getMyErrorMessage();
        }        
    }

    public void descer(){
        if(andarAtual > 1){
            andarAtual--;
        }else{
            throw new IllegalArgumentException("Não pode mais descer");
        }
    }

    public void descer(int qntAndares){
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
