package Ex04_ContagemOcorrencias;

import java.util.ArrayList;
import java.util.Scanner;

public class ContagemOcorrencias {
        
        public static void main(String[] args) {
            
            ArrayList<Integer> listaNumeros = new ArrayList<Integer>();

            Scanner sc = new Scanner(System.in);

            for(int i = 0; i < 10; i++) {
                System.out.print("Digite o " + (i+1) + "º número: ");
                listaNumeros.add(sc.nextInt());
            }

            System.out.print("Digite um número para verificar quantas vezes ele aparece na lista: \n > ");
            int numero = sc.nextInt();
            int cont = 0;

            for(Integer valor : listaNumeros){
                if(valor == numero){
                    cont++;
                }
            }

            System.out.println("O número " + numero + " aparece " + cont + " vezes na lista.");
            sc.close(); 
        }
}
