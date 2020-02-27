package pe.edu.ceid.simi.management.application.estadomatricula;

import java.util.List;

import pe.edu.ceid.simi.management.domain.estadomatricula.model.EstadoMatricula;

public interface EstadoMatriculaService {
	List<EstadoMatricula> getEstadoMatricula();
	EstadoMatricula getEstadoMatriculaById(String idEstadoMatricula);
}
