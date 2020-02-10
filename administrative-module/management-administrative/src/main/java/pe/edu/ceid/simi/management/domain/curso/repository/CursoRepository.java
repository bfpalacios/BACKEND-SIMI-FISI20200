package pe.edu.ceid.simi.management.domain.curso.repository;

import pe.edu.ceid.simi.management.domain.curso.model.Curso;
import pe.edu.ceid.simi.management.domain.curso.model.CursoDTO;
import java.util.List;

public interface CursoRepository {

	Curso crearCurso(Curso curso);
	Curso editCurso(Curso curso, int id);
	boolean deleteCurso(int id);
	List<CursoDTO> getCursos();
	CursoDTO getCursoById(int id);
	
}
