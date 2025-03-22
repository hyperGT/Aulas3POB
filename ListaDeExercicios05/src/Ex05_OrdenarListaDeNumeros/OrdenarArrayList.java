package Ex05_OrdenarListaDeNumeros;

import java.util.ArrayList;
import java.util.Collections;

public class OrdenarArrayList {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> lista = new ArrayList<>();
        
        while(true) {
            int num = Integer.valueOf(System.console().readLine("Digite um número (< 0 sai do programa): \n > "));
            if(num == 0) {
                break;
            }
            lista.add(num);
        }

        Collections.sort(lista);

        System.out.println("Lista ordenada: " + lista);
    }
}
