package Ex03_OrdemInversa;

import java.util.Scanner;

public class VetorExibirInverso {
        
        public static void main(String[] args) {
            
            int vetor[] = new int[6];
            
            Scanner sc = new Scanner(System.in);

            for(int i = 0; i < vetor.length; i++) {
                System.out.print("Digite um valor: ");
                vetor[i] = sc.nextInt();
            }
            
            for(int i = vetor.length - 1; i >= 0; i--) {
                System.out.println(vetor[i]);
            }
            sc.close();
        }
}
