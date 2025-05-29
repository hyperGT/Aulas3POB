package controller;

import domain.Carro;
import domain.Moto;

public class VeiculosController{
 public static void main(String[] args) {
    
    Carro carro = new Carro("Fiat", "Uno", "2005", 2);

    carro.exibirDados();

    Moto moto = new Moto("Honda", "Sung 1.0", "2020", 600);

    moto.exibirDados();
 }
}