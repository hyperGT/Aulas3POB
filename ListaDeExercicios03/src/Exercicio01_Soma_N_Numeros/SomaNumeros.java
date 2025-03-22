package Exercicio01_Soma_N_Numeros;

import java.util.Scanner;

public class SomaNumeros {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int soma = 0;

        System.out.print("Digite a quantidade de números a serem somados: ");
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero inteiro: ");
            soma += sc.nextInt();
        }

        System.out.println("Soma: " + soma);
        sc.close();
    }
}