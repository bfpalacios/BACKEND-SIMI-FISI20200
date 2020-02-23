package pe.edu.ceid.simi.management.domain.progdoccurso.repository;

import java.util.List;

import pe.edu.ceid.simi.management.domain.progdoccurso.model.ProgDocCurso;
import pe.edu.ceid.simi.management.domain.progdoccurso.model.ProgDocCursoDTO;

public interface ProgDocCursoRepository {
	ProgDocCurso crearProgDocCurso(ProgDocCurso progDocCurso);
	ProgDocCurso editProgDocCurso(ProgDocCurso progDocCurso, int id);
	boolean deleteProgDocCurso(int id);
	List<ProgDocCursoDTO> getProgDocCursos();
	List<ProgDocCursoDTO> getProgDocCursosByPeriodo(int idPeriodo);
	ProgDocCursoDTO getProgDocCursoById(int id);
}
