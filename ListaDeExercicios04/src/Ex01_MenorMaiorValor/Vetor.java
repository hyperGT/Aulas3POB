package Ex01_MenorMaiorValor;

import java.util.Scanner;

public class Vetor {
    
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        int vetor[]; // declaração do vetor
        vetor = new int[5]; // alocação de memória para o vetor
        
        for(int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um valor: ");
            vetor[i] = sc.nextInt();

            if(vetor[i] > maior) {
                maior = vetor[i];
                System.out.println("Maior valor atual: " + maior);
            }else if(vetor[i] < menor) {
                menor = vetor[i];
                System.out.println("Menor valor atual: " + menor);
            }
        }

        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);

        sc.close();
    }
}