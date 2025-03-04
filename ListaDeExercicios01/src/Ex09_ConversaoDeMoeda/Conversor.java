package Ex09_ConversaoDeMoeda;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Conversor {

    public static void main(String[] args) {
        
        DecimalFormat df = new DecimalFormat("#.##");

        double valorReais = Double.valueOf(JOptionPane.showInputDialog("Insira o valor em reais"));
        double cotacao = Double.valueOf(JOptionPane.showInputDialog("Insira a cotação atual: "));

        JOptionPane.showMessageDialog(null, "Valor em dólares: " + df.format(valorReais/cotacao), "Conversor REAL TO DÓLAR :(", 0);
    }
}
