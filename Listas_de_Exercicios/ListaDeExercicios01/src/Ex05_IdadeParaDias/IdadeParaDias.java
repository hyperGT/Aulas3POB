package Ex05_IdadeParaDias;

import javax.swing.JOptionPane;

public class IdadeParaDias {
    
    public static int converterIdadeParaDias(int anos) {
        return anos * 365;
    }

    public static void main(String[] args) {        

        int idade = Integer.parseInt(JOptionPane.showInputDialog("Insira sua Idade: "));

        int dias = converterIdadeParaDias(idade);

        JOptionPane.showMessageDialog(null, "Você está vivo há: " + dias + " dias", "Idade convertida em dias", JOptionPane.INFORMATION_MESSAGE);
    }
}