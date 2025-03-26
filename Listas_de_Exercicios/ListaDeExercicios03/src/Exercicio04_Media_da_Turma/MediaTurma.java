package Exercicio04_Media_da_Turma;

import java.util.Scanner;

public class MediaTurma {
    
    public static void main(String[] args) {
            
            Scanner sc = new Scanner(System.in);

            double media = 0;
            System.out.print("Insira a quantidade de alunos: ");
            int qntAlunos = sc.nextInt();
            double nota = 0;
            double soma = 0;
    
            for(int i = 0; i < qntAlunos; i++){
                System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
                nota = sc.nextDouble();
                if (nota >= 0 && nota <= 10) {
                    soma += nota;
                } else {
                    System.out.println("Nota inválida. Digite uma nota entre 0 e 10.");
                    i--;
                }
            }
            
            if (qntAlunos > 0) {
                media = soma / qntAlunos;
                System.out.println("Média da turma: " + media);
            } else {
                System.out.println("Nenhuma nota foi digitada.");
            }
            sc.close();
    }
}
