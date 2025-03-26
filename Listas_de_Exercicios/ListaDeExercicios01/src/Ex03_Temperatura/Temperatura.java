package Ex03_Temperatura;

import java.util.Scanner;

public class Temperatura {

    private float tCelcius;

    public static double celsiusParaFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public static void main(String[] args) {
        
        Temperatura temperatura = new Temperatura();

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a temperatura em Celsius: ");
        temperatura.tCelcius = sc.nextFloat();
        
        System.out.println("A temperatura em Fahrenheit é: " + celsiusParaFahrenheit(temperatura.tCelcius));
        sc.close();
    }
}