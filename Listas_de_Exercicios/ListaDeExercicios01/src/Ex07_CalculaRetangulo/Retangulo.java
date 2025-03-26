package Ex07_CalculaRetangulo;

import java.util.Scanner;

public class Retangulo {    
    
    public double calculaPerimetro(double b, double a){        
        return 2 * (b + a);
    }

    public double calculaArea(double b, double a){
        return b * a;
    }

    public static void main(String[] args) {
        
        Retangulo retangulo = new Retangulo();

        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o valor da base: ");
        double base = sc.nextDouble();
        System.out.print("Insira o valor da altura: ");
        double altura = sc.nextDouble();

        System.out.println("Perímetro: " + retangulo.calculaPerimetro(base, altura));
        System.out.println("Área: " + retangulo.calculaArea(base, altura));

        sc.close();
    }
}
