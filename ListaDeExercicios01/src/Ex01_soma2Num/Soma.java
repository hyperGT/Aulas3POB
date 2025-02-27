package Ex01_Soma2Num;

import java.util.Scanner;

public class Soma {    
    
    public int somaNum(int x, int y) {
        return x + y;
    }      
    
    public static void main(String[] args) throws Exception {
        Soma soma = new Soma();
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int x = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        int y = sc.nextInt();
        System.out.println("A soma dos números é: " + soma.somaNum(x, y));
        sc.close();
    }
}