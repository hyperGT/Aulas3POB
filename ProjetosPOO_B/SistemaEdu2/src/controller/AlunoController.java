package controller;

import java.util.ArrayList;
import java.util.List;

import model.Aluno;

public class AlunoController implements AlunoControllerInterface{

    private ArrayList<Aluno> alunos;

    public AlunoController(){
        this.alunos = new ArrayList<>();

    }

    @Override
    public List<Aluno> listarAlunos() {
        throw new UnsupportedOperationException("Unimplemented method 'listarAlunos'");
    }

    @Override
    public void adicionarAluno(int matricula, String nome, double coeficienteRendimento) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'adicionarAluno'");
    }

    @Override
    public boolean alterarAluno(int matricula, String nome, double coeficienteRendimento) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'alterarAluno'");
    }

    @Override
    public boolean removerAluno(int matricula) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removerAluno'");
    }
    

}
