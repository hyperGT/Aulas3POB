package domain;

public class Aluno {
    private String nome;
    private double nota;

    // methods
    public int validarNota(double nota) {
        if (nota < 0 || nota > 10) {
            System.out.println("A nota do aluno deve estar em um intervalo válido, entre 0 e 10. Nota inserida: " + nota);
            return -1;
        }
        return 1;
    }

    public void classificarAluno() {

        if (nota >= 7) {
            System.out.println("Nome: " + nome + "\t Nota: " + nota + "\t Situação: Aprovado");
        } else {
            if (nota < 5) {
                System.out.println("Nome: " + nome + "\t Nota: " + nota + "\t Situação: Reprovado");
            } else {
                System.out.println("Nome: " + nome + "\t Nota: " + nota + "\t Situação: Recuperação");
            }
        }
    }

    public void exibirAluno(){
        System.out.println("Nome: " + nome + "\t Nota: " + nota);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    
}
