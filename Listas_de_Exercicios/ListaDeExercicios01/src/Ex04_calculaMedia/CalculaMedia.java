package Ex04_calculaMedia;

import java.text.DecimalFormat;

public class CalculaMedia {
    
    public static double calculaMedia(double x, double y, double z) {
        return (x + y + z) / 3;
    }

    public static void main(String[] args) {        

        DecimalFormat df = new DecimalFormat("#.##");

        System.out.print("X: ");
        double x = Double.parseDouble(System.console().readLine());
        System.out.print("Y: ");
        double y = Double.parseDouble(System.console().readLine());
        System.out.print("Z: ");
        double z = Double.parseDouble(System.console().readLine());        

        double media = calculaMedia(x, y, z);
        System.out.println("Média dos números: " + df.format(media));
    }
}
