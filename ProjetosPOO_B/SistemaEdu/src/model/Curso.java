package model;

public class Curso {

    private Integer id;
    private String nome;
    private Turno turno;

    // construtor
    public Curso(Integer id, String nome, Turno turno) {
        this.id = id;
        this.nome = nome;
        this.turno = turno;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public Turno getTurno() {
        return turno;
    }

    public Curso getCursoById(long id){

    }
}
