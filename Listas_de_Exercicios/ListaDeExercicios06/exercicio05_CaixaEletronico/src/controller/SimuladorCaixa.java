package controller;

import java.util.Scanner;

import domain.CaixaEletronico;

public class SimuladorCaixa {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        CaixaEletronico novoCaixa = new CaixaEletronico(2100);

        int op = 0;

        while(op != 3){

            System.out.println("Insira a operação: \n\t1 > Exibir Saldo\n\t2 > Sacar Valor\n\t3 ou qualquer outro valor > Sair");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    novoCaixa.exibirSaldo();
                    break;
                case 2:
                    System.out.print("Insira um valor para sacar (50, 100, 500, 1000): ");
                    double valor = sc.nextDouble();
                    valor = novoCaixa.sacar(valor);
                default:
                    op = 3;
                    break;
            }
        }
    }

}
