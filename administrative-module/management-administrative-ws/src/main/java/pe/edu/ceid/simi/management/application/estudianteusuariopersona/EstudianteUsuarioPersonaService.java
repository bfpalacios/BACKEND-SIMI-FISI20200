package pe.edu.ceid.simi.management.application.estudianteusuariopersona;

import java.util.List;

import pe.edu.ceid.simi.management.domain.estudianteusuariopersona.model.EstudianteUsuarioPersona;

public interface EstudianteUsuarioPersonaService {
	EstudianteUsuarioPersona crearEstudianteUsuarioPersona(EstudianteUsuarioPersona estudianteUsuarioPersona);
	EstudianteUsuarioPersona editEstudianteUsuarioPersona(EstudianteUsuarioPersona estudianteUsuarioPersona, String id);
	List<EstudianteUsuarioPersona> getEstudianteUsuarioPersona();
	boolean deleteEstudianteUsuarioPersona(String codEstudiante);
	EstudianteUsuarioPersona getEstudianteUsuarioPersonaById(String codEstudiante);
}
