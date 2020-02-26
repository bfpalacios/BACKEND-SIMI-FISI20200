package pe.edu.ceid.simi.management.application.estudianteusuariopersona;

import java.util.List;

import pe.edu.ceid.simi.management.domain.estudianteusuariopersona.model.EstudianteUsuarioPersona;

public interface EstudianteUsuarioPersonaService {
	String crearEstudianteUsuarioPersona(EstudianteUsuarioPersona estudianteUsuarioPersona);
	String editEstudianteUsuarioPersona(EstudianteUsuarioPersona estudianteUsuarioPersona, String id);
	List<EstudianteUsuarioPersona> getEstudianteUsuarioPersona();
	List<EstudianteUsuarioPersona> getEstudianteUsuarioPersonaMatriculadosByProgCurso(int idProgCurso);
	boolean deleteEstudianteUsuarioPersona(String codEstudiante);
	EstudianteUsuarioPersona getEstudianteUsuarioPersonaById(String codEstudiante);
}
