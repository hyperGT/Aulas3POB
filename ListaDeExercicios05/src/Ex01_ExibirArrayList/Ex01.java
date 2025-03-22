package Ex01_ExibirArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        // Cria um ArrayList de Inteiros
        ArrayList<Integer> listaNumeros = new ArrayList<Integer>(); 
        
        Scanner sc = new Scanner(System.in);
        
        int v = 1, i = 0;
        
        // Adiciona elementos ao ArrayList
        while(v > 0){
            System.out.print("Digite o " + (i+1) + "º número: ");
            listaNumeros.add(sc.nextInt());
            System.out.print("Digite um valor menor que 0 para sair\n > ");
            v = sc.nextInt();
            i++;
        }

        System.out.println("\nNúmeros digitados:");
        // Exibe os elementos do ArrayList
        for (Integer valor : listaNumeros) {
            System.out.print(valor + " ");
        }
        sc.close();
    }
}