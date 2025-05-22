package controller;

import model.Curso;
import model.Turno;
import repositories.CursoRepository;

import java.util.ArrayList;
import java.util.List;

public class CursoController implements ICursoController{
    private List<Curso> cursos;
    private CursoRepository cursoRepository;

    public CursoController(){
        this.cursoRepository = new CursoRepository();
        this.cursos = new ArrayList<>(cursoRepository.listarCursos());
    }

    @Override
    public List<Curso> listarCursos() {
        return List.of();
    }

    @Override
    public void addCurso(int id, String nome, Turno turno) {

    }

    @Override
    public boolean editarCurso(int id, String nome, Turno turno) {
        return false;
    }

    @Override
    public boolean removerCurso(int id) {
        return false;
    }
}
