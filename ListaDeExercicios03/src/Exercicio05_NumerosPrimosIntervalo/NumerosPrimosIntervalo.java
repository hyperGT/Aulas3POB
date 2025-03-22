package Exercicio05_NumerosPrimosIntervalo;

import java.util.Scanner;

public class NumerosPrimosIntervalo {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        boolean primo = false;

        System.out.print("Insira o início do intervalo: ");
        int inicio = sc.nextInt();
        System.out.print("Insira o fim do intervalo: ");
        int fim = sc.nextInt();
        
        System.out.println("Números primos entre " + inicio + " e " + fim + ":");
        
        for (int num = inicio; num <= fim; num++) {
            primo = true;
            if (num <= 1) {     
                primo = false;       
                continue;
            }else{
                for (int j = 2; j <= Math.sqrt(num); j++) {
                    if (num % j == 0) {
                        primo = false;
                        break;
                    }
                }                
            }
            if(primo){
                System.out.println(num);
            }
        }
        sc.close();
    }        
}
