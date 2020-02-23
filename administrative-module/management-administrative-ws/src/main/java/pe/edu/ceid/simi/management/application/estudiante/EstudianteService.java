package pe.edu.ceid.simi.management.application.estudiante;

import java.util.List;

import pe.edu.ceid.simi.management.domain.estudiante.model.Estudiante;
import pe.edu.ceid.simi.management.domain.estudiante.model.EstudianteDTO;

public interface EstudianteService {
	Estudiante crearEstudiante(Estudiante estudiante);
	Estudiante editEstudiante(Estudiante estudiante, int id);
	boolean deleteEstudiante(int id);
	List<EstudianteDTO> getEstudiantes();
	EstudianteDTO getEstudianteById(int id);
}
