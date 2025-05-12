package controller;

import domain.Carro;
import domain.Moto;

public class TesteCarroMoto {
    public static void main(String[] args) {
        
        Carro carro = new Carro("Fiat", 2010, 4);

        Moto moto = new Moto("Honda", 2024, true);


        System.out.println("Dados da moto: ");
        moto.exibirDados();

        System.out.println("Dados do carro: ");
        carro.exibirDados();

    }
}
