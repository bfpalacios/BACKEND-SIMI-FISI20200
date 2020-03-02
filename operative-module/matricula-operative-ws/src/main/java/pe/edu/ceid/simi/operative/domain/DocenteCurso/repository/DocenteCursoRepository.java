package pe.edu.ceid.simi.operative.domain.DocenteCurso.repository;

import java.util.List;
import pe.edu.ceid.simi.operative.domain.DocenteCurso.model.DocenteCurso;

public interface DocenteCursoRepository {
	List<DocenteCurso> listCursoByDocente(int id);

}
