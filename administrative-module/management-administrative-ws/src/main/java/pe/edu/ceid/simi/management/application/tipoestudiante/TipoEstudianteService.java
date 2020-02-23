package pe.edu.ceid.simi.management.application.tipoestudiante;

import java.util.List;

import pe.edu.ceid.simi.management.domain.tipoestudiante.model.TipoEstudiante;

public interface TipoEstudianteService {
	TipoEstudiante crearTipoEstudiante(TipoEstudiante tipoEstudiante);
	TipoEstudiante editTipoEstudiante(TipoEstudiante tipoEstudiante, int id);
	boolean deleteTipoEstudiante(int ctipoEstudiante);
	List<TipoEstudiante> getTiposEstudiante();
	TipoEstudiante getTipoEstudianteById(int id);
}
