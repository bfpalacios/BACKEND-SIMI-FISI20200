package pe.edu.ceid.simi.management.application.curso;

import java.util.List;

import pe.edu.ceid.simi.management.domain.curso.model.Curso;
import pe.edu.ceid.simi.management.domain.curso.model.CursoDTO;


public interface CursoService {
	String crearCurso(Curso curso);
	String editCurso(Curso curso, int id);
	List<CursoDTO> getCursos();
	List<CursoDTO> getCursosByIdioma(int idIdioma);
	List<CursoDTO> getCursosByDocente(int idDocente);
	List<CursoDTO> getCursosByPeriodo(int idPeriodo);
	List<CursoDTO> getCursosByIdiomaSedePeriodo(int idIdioma, int idSede, int idPeriodo);
	CursoDTO getCursoById(int id);
	String deleteCurso(int id);
}
