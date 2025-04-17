package domain;

import util.*;

public class Elevador {

    private int andarAtual;
    private int totalAndares;

    public Elevador(int andarAtual, int totalAndares) {
        this.andarAtual = andarAtual;
        this.totalAndares = totalAndares;
    }

    // Methods
    public void subir() {
        if (andarAtual < totalAndares) {
            andarAtual++;
        } else {
            System.out.println("Não é possível subir mais");
        }
    }

    public void subir(int qntAndares) {

        if(qntAndares <= 0){
            throw new InvalidFloorException("Quantidade de andares deve ser positiva: " + qntAndares);
        }

        int novoAndar = andarAtual + qntAndares;
        if (novoAndar > totalAndares) {
            throw new InvalidFloorException(
                    "Não é possível Subir " + qntAndares + "andares. Andar Máximo: " + totalAndares);
        }
        andarAtual = novoAndar;
    }

    public void descer() {
        if (andarAtual > 1) {
            andarAtual--;
        } else {
            System.out.println("Não é possível subir mais");
        }
    }

    public void descer(int qntAndares) {
        int novoAndar = andarAtual - qntAndares;
        if (novoAndar < 1 || qntAndares <= 0) {
            throw new InvalidFloorException(
                "Não é possível descer " + qntAndares + ". \nAndares mínimo: 1");
        }
        andarAtual = novoAndar;
    }

    public void exibirAndar() {
        System.out.println("Você está no " + andarAtual + "° Andar");
    }
}
