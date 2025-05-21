package model;

public class Aluno {

    private String matricula;
    private String nome;
    private Turno turno;
    private Curso curso;

    // construtor
    public Aluno(String matricula, String nome, Turno turno, Curso curso) {
        if(nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome do produto não pode ser vazio ou nulo");
        }

        this.matricula = matricula;
        this.nome = nome;
        this.turno = turno;
        this.curso = curso;
    }

    public Turno getTurno() {
        return turno;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso){
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "matricula='" + matricula + '\'' +
                ", nome='" + nome + '\'' +
                ", turno=" + turno +
                ", curso=" + curso +
                '}';
    }

    public String toFileString(){
        return matricula + ";" + nome + ";" + getTurno().name() + ";" + getCurso().getId();
    }
/*
    public static Aluno fromFileString(String line){
        String[] data = line.split(";");
        if(data.length != 4){
            throw new IllegalArgumentException("Linha de dado invalida para adição de um novo aluno" + line);
        }

        try {
            String matricula = data[0];
            String nome = data[1];
            Turno turno = Turno.valueOf(data[2].toUpperCase());
            // retorna novo aluno
        }
    }

*/
}
