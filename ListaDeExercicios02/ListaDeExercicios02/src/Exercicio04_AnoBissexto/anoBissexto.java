package Exercicio04_AnoBissexto;

public class anoBissexto {

    public static void main(String[] args) {
        
        int ano = Integer.valueOf(System.console().readLine("Insira o ano: "));

        if(ano%4==0 && ano % 100 != 0 || ano%400==0){
           System.out.println("É um ano bissexto: " + ano); 
        }else{
            System.out.println("Não é um ano bissexto ");
        }
    }

}