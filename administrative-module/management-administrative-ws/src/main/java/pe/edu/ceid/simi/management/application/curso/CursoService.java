package pe.edu.ceid.simi.management.application.curso;

import java.util.List;

import pe.edu.ceid.simi.management.domain.curso.model.Curso;
import pe.edu.ceid.simi.management.domain.curso.model.CursoDTO;


public interface CursoService {
	Curso crearCurso(Curso curso);
	Curso editCurso(Curso curso, int id);
	List<CursoDTO> getCursos();
	List<CursoDTO> getCursosByIdioma(int idIdioma);
	CursoDTO getCursoById(int id);
	boolean deleteCurso(int id);
}
