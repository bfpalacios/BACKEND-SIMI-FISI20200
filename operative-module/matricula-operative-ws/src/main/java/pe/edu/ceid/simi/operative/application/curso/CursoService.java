package pe.edu.ceid.simi.operative.application.curso;

import java.util.List;
import pe.edu.ceid.simi.operative.domain.curso.model.CursoDTO;

public interface CursoService {
	List<CursoDTO> getCursobyNivel(int idIdioma, int idNivel);
}
