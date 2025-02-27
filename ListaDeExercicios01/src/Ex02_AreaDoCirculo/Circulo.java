package Ex02_AreaDoCirculo;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Circulo {
    
    public double calcularArea(double raio){
        return Math.PI * Math.pow(raio, 2);
    }
    
    public static void main(String[] args) {
        
        Circulo circulo = new Circulo();
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");

        System.out.print("Digite o raio do círculo: ");
        double raio = sc.nextDouble();

        System.out.println("Area do círculo: " + df.format(circulo.calcularArea(raio)));
        sc.close();
    }
}