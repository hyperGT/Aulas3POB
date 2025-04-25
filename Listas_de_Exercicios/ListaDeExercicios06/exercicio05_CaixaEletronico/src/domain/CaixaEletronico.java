package domain;

public class CaixaEletronico{
    private double saldo;
    
    public CaixaEletronico (double saldo){
        this.saldo = saldo;
    }

    // Métodos
    public double sacar(double valor){

        if(valor < saldo && valor % 10 == 0){
            saldo -= valor;
            return saldo; // saque pode ser realizado
        }else{
            // valor inválido
            System.out.println("Valor de saque inválido");
            return 0;
        }
    }

    public void exibirSaldo(){
        System.out.println("Seu Saldo atual: " + saldo);
    }

}