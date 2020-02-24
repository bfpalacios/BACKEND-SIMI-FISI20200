package pe.edu.ceid.simi.management.application.progdoccurso;

import java.util.List;

import pe.edu.ceid.simi.management.domain.progdoccurso.model.ProgDocCurso;
import pe.edu.ceid.simi.management.domain.progdoccurso.model.ProgDocCursoDTO;

public interface ProgDocCursoService {
	ProgDocCurso crearProgDocCurso(ProgDocCurso progDocCurso);
	ProgDocCurso editProgDocCurso(ProgDocCurso progDocCurso, int id);
	boolean deleteProgDocCurso(int id);
	List<ProgDocCursoDTO> getProgDocCursos();
	List<ProgDocCursoDTO> getProgDocCursosByPeriodo(int idPeriodo);
	List<ProgDocCursoDTO> getProgDocCursosByIdioma(int idIdioma);
	ProgDocCursoDTO getProgDocCursoById(int id);
}
