package pe.edu.ceid.simi.management.domain.estudianteusuariopersona.repository;

import java.util.List;

import pe.edu.ceid.simi.management.domain.estudianteusuariopersona.model.EstudianteUsuarioPersona;

public interface EstudianteUsuarioPersonaRepository {
	String crearEstudianteUsuarioPersona(EstudianteUsuarioPersona estudianteUsuarioPersona);
	String editEstudianteUsuarioPersona(EstudianteUsuarioPersona estudianteUsuarioPersona, String id);
	List<EstudianteUsuarioPersona> getEstudianteUsuarioPersona();
	List<EstudianteUsuarioPersona> getEstudianteUsuarioPersonaMatriculadosByProgCurso(int idProgCurso);
	List<EstudianteUsuarioPersona> getEstudianteUsuarioPersonaByTipoEstudiante(int idTipoEstudiante);
	boolean deleteEstudianteUsuarioPersona(String codEstudiante);
	EstudianteUsuarioPersona getEstudianteUsuarioPersonaById(String codEstudiante);
}
