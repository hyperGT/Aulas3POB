package controller;

import java.util.ArrayList;
import java.util.Scanner;

import model.Caminhao;
import model.Carro;
import model.Moto;
import model.Veiculo;

public class GerenciaVeiculos {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        ArrayList<Veiculo> veiculosList = new ArrayList<>();

        while(true){
            System.out.println("1 - Cadastrar novo veículo");
            System.out.println("2 - Listar veículos");
            System.out.println("3 - Sair");
            System.out.print(">> ");
            int op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:
                    cadastrarVeiculo(veiculosList, sc);
                    break;
                case 2:
                    listarVeiculos(veiculosList);
                    break;
                case 3:
                    System.out.println("Saindo...");
                    sc.close();
                    return;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
    }

    private static void listarVeiculos(ArrayList<Veiculo> veiculosList) {
        if(veiculosList.isEmpty()){
            System.out.println("Nenhum veículo cadastrado! ");
            return;
        }

        for(Veiculo v : veiculosList){
            System.out.println(v);
        }
    }

    private static void cadastrarVeiculo(ArrayList<Veiculo> veiculosList, Scanner sc) {
        System.out.print("Tipo (1-Carro, 2-Moto, 3-Caminhao): ");
        int tipo = sc.nextInt();
        sc.nextLine();

        System.out.print("Modelo: ");
        String modelo = sc.nextLine();

        System.out.print("Placa: ");
        String placa = sc.nextLine();

        System.out.print("Ano: ");
        int ano = sc.nextInt();

        sc.nextLine();

        switch (tipo) {
            case 1: // carro
                System.out.print("Quantidade de portas: ");
                int qtdPortas = sc.nextInt();

                veiculosList.add(new Carro(placa, modelo, ano, qtdPortas));
                break;
            case 2:             
                System.out.print("Cilindradas: ");
                int cilindradas = sc.nextInt();

                veiculosList.add(new Moto(placa, modelo, ano, cilindradas));
                break;
            case 3: 
                System.out.print("Capacidade de carga (kg): ");
                int capacidadeCarga = sc.nextInt();

                veiculosList.add(new Caminhao(placa, modelo, ano, capacidadeCarga));
                break;
            default:
                System.out.print("Entrada inválida");
                break;
        }
    }
}
