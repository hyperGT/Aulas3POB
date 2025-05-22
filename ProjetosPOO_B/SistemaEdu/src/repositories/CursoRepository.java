package repositories;

import model.Curso;

import java.util.HashMap;
import java.util.Map;

public class CursoRepository {

    // inicializando
    private Map<Integer, Curso> cursosMap = new HashMap<>();

    // adiciona cursos no mapa
    public void addCurso(Curso curso){
        cursosMap.put(curso.getId(), curso);
    }

    public Curso getCursoById(int id){
        return cursosMap.get(id);
    }

}
