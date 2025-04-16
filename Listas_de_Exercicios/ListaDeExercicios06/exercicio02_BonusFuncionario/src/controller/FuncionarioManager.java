package controller;

import java.util.Scanner;

import domain.Funcionario;

public class FuncionarioManager {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o nome do funcionário: ");
        String nome = sc.nextLine();
        System.out.print("Insira a categoria: ");
        char categoria = sc.next().charAt(0);
        System.out.print("Insira o salario base: ");
        double salarioBase = sc.nextDouble();

        // criando um novo funcionário
        Funcionario funcionario = new Funcionario(nome, salarioBase, categoria);                        

        System.out.printf("Salário final: %.2f", funcionario.calculaSalarioFinal(categoria));
        
        funcionario.toString();
        sc.close();
    }
}