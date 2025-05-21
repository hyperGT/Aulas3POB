package model;

public enum Turno {

    MATUTINO("Manhã", "7:10 às 12:20"),
    VESPERTINO("Tarde", "13:10 às 18:20"),
    NOTURNO("Noite", "18:30 às 22:00"),
    INTEGRAL("Integral", "08:00 às 16:30");


    private final String descricao;
    private final String horario;

    private Turno(String descricao, String horario) {
        this.descricao = descricao;
        this.horario = horario;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getHorario() {
        return horario;
    }
}
