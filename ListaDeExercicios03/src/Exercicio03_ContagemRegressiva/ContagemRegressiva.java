package Exercicio03_ContagemRegressiva;

import java.util.Scanner;

public class ContagemRegressiva {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int n = sc.nextInt();
        
        while(n >= 0) {
            System.out.println(n);
            n--;
        }
        sc.close();
    }
}
