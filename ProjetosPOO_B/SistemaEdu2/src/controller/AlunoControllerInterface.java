package controller;

import java.util.List;

import model.Aluno;

public interface AlunoControllerInterface {
   List<Aluno> listarAlunos();
   void adicionarAluno(int matricula, String nome, double coeficienteRendimento);
   boolean alterarAluno(int matricula, String nome, double coeficienteRendimento);
   boolean removerAluno(int matricula);
}