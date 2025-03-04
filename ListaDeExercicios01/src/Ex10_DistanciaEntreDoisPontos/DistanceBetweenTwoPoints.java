package Ex10_DistanciaEntreDoisPontos;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class DistanceBetweenTwoPoints {

    public double calcDistance(double x1, double x2, double y1, double y2){
        return Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
    }

    public static void main(String[] args) {
                
        DecimalFormat df = new DecimalFormat("#.##");
        DistanceBetweenTwoPoints dPoints = new DistanceBetweenTwoPoints();
        double x1, x2, y1, y2;

        x1 = Double.parseDouble(System.console().readLine("Insira x_1: "));
        y1 = Double.parseDouble(System.console().readLine("Insira y_1: "));
        x2 = Double.parseDouble(System.console().readLine("Insira x_2: "));
        y2 = Double.parseDouble(System.console().readLine("Insira y_2: "));

        double D = dPoints.calcDistance(x1, x2, y1, y2);    

        System.out.println("Resultado: " + df.format(D));

        JOptionPane.showMessageDialog(null, "Distância entre os dois pontos: " + df.format(D), "Distância entre dois pontos", JOptionPane.INFORMATION_MESSAGE);
    }
}
