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
        Funcionario newFc = new Funcionario(nome, salarioBase, categoria);
        double salarioFinal;

        switch (categoria) {
            case 'A':
                salarioFinal = newFc.calculaSalarioFinal(salarioBase, 20);
                System.out.println("Salario final: " + salarioFinal);
                break;
            case 'B':
                salarioFinal = newFc.calculaSalarioFinal(salarioBase, 10);
                System.out.println("Salario final: " + salarioFinal);
                break;

            default:
                salarioFinal = salarioBase;
                System.out.println("Salario final: " + salarioFinal);
                break;
        }
        sc.close();
    }
}