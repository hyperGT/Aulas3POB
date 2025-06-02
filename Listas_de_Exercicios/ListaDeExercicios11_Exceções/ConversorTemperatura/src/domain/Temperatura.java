package domain;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Temperatura{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Insira a temperatura em celsius para ser convertida: ");
            
            double celsius = sc.nextDouble();
            
            double fahrenheit = (celsius * 9/5) + 32;

            System.out.printf("%.2f°C equivale a %.2f°F%n", celsius, fahrenheit);
        } catch (InputMismatchException e) {            
            System.out.println("Erro: Entrada inválida. Por favor, digite um número.");
        }finally{
            sc.close();
            System.out.println("Operação concluída");
        }        
    }
}