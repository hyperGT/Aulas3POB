package model;

public class Aluno {

    private Integer id;
    private String matricula;
    private String nome;
    private Turno turno;
    private Curso curso;

    public Aluno(Integer id, String matricula, String nome, Turno turno, Curso curso) {
        this.id = id;
        this.matricula = matricula;
        this.nome = nome;
        this.turno = turno;
        this.curso = curso;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
                "id=" + id +
                ", matricula='" + matricula + '\'' +
                ", nome='" + nome + '\'' +
                ", turno=" + turno +
                ", curso=" + curso +
                '}';
    }

    public String toFileString(){
        return matricula + ";" + nome + ";" + getTurno().name() + ";" + getCurso().getId();
    }

    public static Aluno fromFileString(String line){
        String[] data = line.split(";");
        if(data.length != 4){
            throw new IllegalArgumentException("Linha de dado invalida para adição de um novo aluno" + line);
        }

        try {
            String matricula = data[0];
            String nome = data[1];
            Turno turno = Turno.valueOf(data[2].toUpperCase());
           // Curso curso = Instituicao.getCursoById(data[3]);
            // retorna novo aluno
        }catch (IllegalArgumentException e){
            System.out.println("Não foi possível acessar os dados corretamente");
        }
    }
}
