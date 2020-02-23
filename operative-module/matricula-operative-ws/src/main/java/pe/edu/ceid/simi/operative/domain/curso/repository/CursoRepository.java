package pe.edu.ceid.simi.operative.domain.curso.repository;

import java.util.List;
import pe.edu.ceid.simi.operative.domain.curso.model.CursoDTO;

public interface CursoRepository {
	List<CursoDTO> getCursobyNivel(int idIdioma, int idNivel);
}
