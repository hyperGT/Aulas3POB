package Ex01_soma2Num;

import java.util.Scanner;

public class Soma {
    
    Scanner sc = new Scanner(System.in);
    
    public int somaNum(int x, int y) {
        return x + y;
    }      
    
    public static void main(String[] args) throws Exception {
        Soma soma = new Soma();
        System.out.println("Digite o primeiro número: ");
        int x = soma.sc.nextInt();
        System.out.println("Digite o segundo número: ");
        int y = soma.sc.nextInt();
        System.out.println("A soma dos números é: " + soma.somaNum(x, y));
        soma.sc.close();
    }

}