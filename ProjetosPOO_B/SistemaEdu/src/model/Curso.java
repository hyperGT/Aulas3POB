package model;

public class Curso {

    private Long id;
    private String nome;
    private Turno turno;

    // construtor
    public Curso(Long id, String nome, Turno turno) {
        this.id = id;
        this.nome = nome;
        this.turno = turno;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

}
