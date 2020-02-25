package pe.edu.ceid.simi.management.application.progcurso;

import java.util.List;

import pe.edu.ceid.simi.management.domain.progcurso.model.ProgCurso;
import pe.edu.ceid.simi.management.domain.progcurso.model.ProgCursoDTO;

public interface ProgCursoService {
	ProgCurso crearProgCurso(ProgCurso progCurso);
	ProgCurso editProgCurso(ProgCurso progCurso, int id);
	boolean deleteProgCurso(int id);
	List<ProgCursoDTO> getProgCursos();
	List<ProgCursoDTO> getProgCursosByDocente(String codDocente, int idCurso);
	ProgCursoDTO getProgCursoById(int id);
}
