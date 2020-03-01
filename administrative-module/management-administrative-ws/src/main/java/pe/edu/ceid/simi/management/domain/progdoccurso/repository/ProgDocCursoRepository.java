package pe.edu.ceid.simi.management.domain.progdoccurso.repository;

import java.util.List;

import pe.edu.ceid.simi.management.domain.progdoccurso.model.ProgDocCurso;
import pe.edu.ceid.simi.management.domain.progdoccurso.model.ProgDocCursoDTO;

public interface ProgDocCursoRepository {
	String crearProgDocCurso(ProgDocCurso progDocCurso);
	String editProgDocCurso(ProgDocCurso progDocCurso, int id);
	boolean deleteProgDocCurso(int id);
	List<ProgDocCursoDTO> getProgDocCursos();
	List<ProgDocCursoDTO> getProgDocCursosByPeriodo(int idPeriodo);
	List<ProgDocCursoDTO> getProgDocCursosByPeriodoIdioma(int idPeriodo, int idIdioma);
	List<ProgDocCursoDTO> getProgDocCursosByDocenteCursoPeriodo(String codDocente, int idCurso, int idPeriodo);
	ProgDocCursoDTO getProgDocCursoById(int id);
}
