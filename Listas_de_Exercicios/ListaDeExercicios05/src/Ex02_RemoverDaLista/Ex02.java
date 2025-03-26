package Ex02_RemoverDaLista;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex02 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        ArrayList<String> listaNomes = new ArrayList<String>();


        for(int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i+1) + "º nome: ");
            listaNomes.add(sc.nextLine());
        }

        System.out.println("\nNomes digitados:");
        for (String nome : listaNomes) {
            System.out.println(nome + " ");
        }

        // remover nome
        System.out.print("\nDigite o nome que deseja remover: ");
        String nomeRemover = sc.nextLine();

        for(String nome :  listaNomes){
            if(nome.equals(nomeRemover)){
                listaNomes.remove(nome);
                break;
            }
        }

        for (String nome : listaNomes) {
            System.out.print(nome + " ");
        }

        sc.close();
    }
}
