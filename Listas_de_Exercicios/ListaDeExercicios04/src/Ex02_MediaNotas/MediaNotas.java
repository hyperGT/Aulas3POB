package Ex02_MediaNotas;

import java.util.Scanner;

public class MediaNotas {
        
        public static void main(String[] args) {
            
            double notas[] = new double[4];
            double soma = 0;
            
            Scanner sc = new Scanner(System.in);

            for(int i = 0; i < notas.length; i++) {
                System.out.print("Insira a nota " + (i + 1) + ": ");
                notas[i] = sc.nextDouble();
            }

            for(int i = 0; i < notas.length; i++) {
                soma += notas[i];
            }
            
            double media = soma / notas.length;
            
            System.out.println("Média das notas: " + media);
            sc.close();
        }            
}
