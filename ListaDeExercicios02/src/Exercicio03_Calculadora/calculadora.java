package Exercicio03_Calculadora;

import java.util.Scanner;

public class calculadora {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha a operação desejada: ");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");    
        System.out.println("4 - Divisão");
        System.out.print("Digite a opção desejada: ");
        int op = sc.nextInt();

        System.out.print("Digite o primeiro número: ");
        int a = sc.nextInt();
        System.out.print("\nDigite o segundo número: ");
        int b = sc.nextInt();
        
        switch (op) {
            case 1: // soma
                System.out.println("Resultado: " + (a + b));
                break;  
            case 2: // subtração
                System.out.println("Resultado: " + (a - b));
                break;
            case 3: // multiplicação
                System.out.println("Resultado: " + (a * b));
                break;
            case 4: // divisão
                               
                if(b == 0) {
                    System.out.println("Divisão por zero.");
                } else {
                    System.out.println("Resultado: " + (a / b));
                }
                break;
            default:
                break;
        }
        sc.close();
    }
}
