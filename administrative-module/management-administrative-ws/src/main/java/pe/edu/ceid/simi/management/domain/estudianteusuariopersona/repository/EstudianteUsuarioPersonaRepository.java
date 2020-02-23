package pe.edu.ceid.simi.management.domain.estudianteusuariopersona.repository;

import java.util.List;

import pe.edu.ceid.simi.management.domain.estudianteusuariopersona.model.EstudianteUsuarioPersona;

public interface EstudianteUsuarioPersonaRepository {
	EstudianteUsuarioPersona crearEstudianteUsuarioPersona(EstudianteUsuarioPersona estudianteUsuarioPersona);
	EstudianteUsuarioPersona editEstudianteUsuarioPersona(EstudianteUsuarioPersona estudianteUsuarioPersona, int id);
	List<EstudianteUsuarioPersona> getEstudianteUsuarioPersona();
	boolean deleteEstudianteUsuarioPersona(String codEstudiante);
	EstudianteUsuarioPersona getEstudianteUsuarioPersonaById(String codEstudiante);
}
