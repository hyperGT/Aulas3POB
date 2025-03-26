package Ex06_CalculoSalario;

import java.text.DecimalFormat;

public class CalcularSalario {
    
    public static double calcularSalario(double vBruto, double descontoInss){   
        
        return vBruto < 1519 ? vBruto - (vBruto * (descontoInss / 100)) : vBruto - ((2793.88 - vBruto) * (descontoInss/100));
    }

    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("#.##");

        double salarioBruto = Double.parseDouble(System.console().readLine("Insira o salário bruto: "));
        double aliquota = Double.parseDouble(System.console().readLine("Insira a alíquota do INSS: "));
        
        double vLiquido = calcularSalario(salarioBruto, aliquota);

        System.out.println("Salário líquido: " + df.format(vLiquido));
    }
}
