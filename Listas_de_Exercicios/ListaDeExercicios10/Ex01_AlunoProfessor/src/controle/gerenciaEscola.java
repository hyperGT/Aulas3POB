package controle;

import dominio.Aluno;
import dominio.Professor;

public class gerenciaEscola {
    
    public static void main(String[] args) {
        
        Aluno aluno = new Aluno("Joao", 20, "ADS");
        
        Professor prof = new Professor("Flavio", 43, 4300);

        System.out.println("Dados do Aluno: ");
        aluno.exibirDados();

        System.out.println("Dados do Professor: ");
        prof.exibirDados();
        
    }
}
