package pe.edu.ceid.simi.management.domain.estadoprogcurso.repository;

import java.util.List;

import pe.edu.ceid.simi.management.domain.estadoprogcurso.model.EstadoProgCurso;

public interface EstadoProgCursoRepository {
	EstadoProgCurso crearEstadoProgCurso(EstadoProgCurso estadoProgCurso);
	EstadoProgCurso editEstadoProgCurso(EstadoProgCurso estadoProgCurso, int id);
	boolean deleteEstadoProgCurso(int id);
	List<EstadoProgCurso> getEstadoProgCurso();
	EstadoProgCurso getEstadoProgCursoById(int id);
}
