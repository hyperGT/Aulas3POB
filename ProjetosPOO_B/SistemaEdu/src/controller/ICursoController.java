package controller;

import model.Curso;
import model.Turno;

import java.util.List;

public interface ICursoController {
    List<Curso> listarCursos();
    void addCurso(int id, String nome, Turno turno);
    boolean editarCurso(int id, String nome, Turno turno);
    boolean removerCurso(int id);
}
