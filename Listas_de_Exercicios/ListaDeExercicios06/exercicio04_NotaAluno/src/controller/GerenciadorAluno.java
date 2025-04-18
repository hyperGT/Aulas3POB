package controller;

import java.util.Scanner;

import domain.Aluno;

public class GerenciadorAluno {
    public static void main(String[] args) {
        System.out.println("Testando");
  
        Scanner sc = new Scanner(System.in);

        Aluno novoAluno = new Aluno();
        System.out.print("Insira o nome do Aluno: ");
        String nome = sc.nextLine();
        novoAluno.setNome(nome);
        double nota;
        do {
        System.out.println("Nome do Aluno: " + novoAluno.getNome());
        System.out.print("Insira uma nota válida: ");
        nota = sc.nextDouble();
        
        } while(novoAluno.validarNota(nota) != 1);
        novoAluno.setNota(nota);
        novoAluno.classificarAluno();
        sc.close();
    }    
}
