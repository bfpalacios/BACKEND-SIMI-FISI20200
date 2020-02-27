package pe.edu.ceid.simi.management.domain.estadomatricula.repository;

import java.util.List;

import pe.edu.ceid.simi.management.domain.estadomatricula.model.EstadoMatricula;

public interface EstadoMatriculaRepository {
	List<EstadoMatricula> getEstadoMatricula();
	EstadoMatricula getEstadoMatriculaById(String idEstadoMatricula);
}
