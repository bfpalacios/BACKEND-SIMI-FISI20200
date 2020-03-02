package pe.edu.ceid.simi.operative.application.AlumnoCurso;

import pe.edu.ceid.simi.operative.domain.alumnoCurso.model.AlumnoCurso;
import java.util.List;

public interface AlumnoCursoService {
	List<AlumnoCurso> getAlumnoByCurso(int id);
}
