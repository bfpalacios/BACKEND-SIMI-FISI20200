package pe.edu.ceid.simi.management.application.docente;

import java.util.List;

import pe.edu.ceid.simi.management.domain.docente.model.Docente;
import pe.edu.ceid.simi.management.domain.docente.model.DocenteDTO;

public interface DocenteService {
	Docente crearDocente(Docente docente);
	Docente editDocente(Docente docente, int id);
	boolean deleteDocente(int id);
	List<DocenteDTO> getDocente();
	DocenteDTO getDocenteById(int id);
	
}
