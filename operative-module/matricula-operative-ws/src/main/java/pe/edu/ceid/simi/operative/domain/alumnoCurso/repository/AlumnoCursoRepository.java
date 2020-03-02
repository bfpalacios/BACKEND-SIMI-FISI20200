package pe.edu.ceid.simi.operative.domain.alumnoCurso.repository;

import pe.edu.ceid.simi.operative.domain.alumnoCurso.model.AlumnoCurso;
import java.util.List;
public interface AlumnoCursoRepository {
	List<AlumnoCurso> getAlumdoByCurso(int id);
}
