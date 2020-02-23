package pe.edu.ceid.simi.management.domain.estudiante.repository;

import java.util.List;

import pe.edu.ceid.simi.management.domain.estudiante.model.Estudiante;
import pe.edu.ceid.simi.management.domain.estudiante.model.EstudianteDTO;

public interface EstudianteRepository {
	Estudiante crearEstudiante(Estudiante estudiante);
	Estudiante editEstudiante(Estudiante estudiante, int id);
	boolean deleteEstudiante(int id);
	List<EstudianteDTO> getEstudiantes();
	EstudianteDTO getEstudianteById(int id);
}
