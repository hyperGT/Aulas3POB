package controller;

import domain.Estagiario;
import domain.Funcionario;
import domain.Gerente;

public class Controle {

    public static void main(String[] args) {
        
        Funcionario f = new Funcionario("Jonas", 2000);

        System.out.println("Salario Base Funcionario normal: " + f.calcularSalario());

        Estagiario e = new Estagiario("Diego", 1000);

        System.out.println("Salario Base Estagiario: " + e.calcularSalario());

        Gerente g = new Gerente("Marcos", 5000);

        System.out.println("Salario Base Gerente: " + g.calcularSalario());
    }
}