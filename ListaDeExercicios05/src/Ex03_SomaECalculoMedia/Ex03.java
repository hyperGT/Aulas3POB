package Ex03_SomaECalculoMedia;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        ArrayList<Double> doubleList = new ArrayList<Double>();
        double soma = 0;
        double v = 0;

        while(true){
            
            System.out.print("Digite um número (digite -1 para sair): \n > ");
            v = sc.nextDouble();
            if(v == -1){
                break;
            }else{
                doubleList.add(v);
                soma += v;
            }
        }

        double media = soma / doubleList.size();

        System.out.println("\nNúmeros digitados:");
        for (Double valor : doubleList) {
            System.out.print(valor + " ");
        }

        System.out.println("\nSoma: " + soma);
        System.out.println("Média: " + media);
        sc.close(); 
    }
}
