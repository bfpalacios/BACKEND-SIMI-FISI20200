package pe.edu.ceid.simi.management.domain.tipoestudiante.repository;

import java.util.List;

import pe.edu.ceid.simi.management.domain.tipoestudiante.model.TipoEstudiante;

public interface TipoEstudianteRepository {
	TipoEstudiante crearTipoEstudiante(TipoEstudiante tipoEstudiante);
	TipoEstudiante editTipoEstudiante(TipoEstudiante tipoEstudiante, int id);
	boolean deleteTipoEstudiante(int ctipoEstudiante);
	List<TipoEstudiante> getTiposEstudiante();
	TipoEstudiante getTipoEstudianteById(int id);
}
