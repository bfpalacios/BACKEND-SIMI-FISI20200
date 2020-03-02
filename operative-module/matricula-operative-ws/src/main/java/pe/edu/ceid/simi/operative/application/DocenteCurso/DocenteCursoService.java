package pe.edu.ceid.simi.operative.application.DocenteCurso;

import java.util.List;
import pe.edu.ceid.simi.operative.domain.DocenteCurso.model.DocenteCurso;

public interface DocenteCursoService {
	List<DocenteCurso> listCursoByDocente(int id);
	
	
}
