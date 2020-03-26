package pe.edu.ceid.simi.management.domain.estudianteusuariopersona.repository;

import java.util.List;

import pe.edu.ceid.simi.management.domain.estudianteusuariopersona.model.EstudianteUsuarioPersona;

public interface EstudianteUsuarioPersonaRepository {
	String crearEstudianteUsuarioPersona(EstudianteUsuarioPersona estudianteUsuarioPersona);
	String editEstudianteUsuarioPersona(EstudianteUsuarioPersona estudianteUsuarioPersona, String id);
	List<EstudianteUsuarioPersona> getEstudianteUsuarioPersona();
	List<EstudianteUsuarioPersona> getEstudianteUsuarioPersonaMatriculadosByProgCurso(int idProgCurso);
	List<EstudianteUsuarioPersona> getEstudianteUsuarioPersonaByTipoEstudiante(int idTipoEstudiante);
	List<EstudianteUsuarioPersona> getEstudiantesByCursoPeriodo(int idCurso, int idPeriodo);
//	List<EstudianteUsuarioPersona> getEstudiantesMatriculadosByProgCurso(int idProgCurso);
	List<EstudianteUsuarioPersona> getEstudiantesByCodigo(String codEstudiante);
	String deleteEstudianteUsuarioPersona(String codEstudiante);
	EstudianteUsuarioPersona getEstudianteUsuarioPersonaById(String codEstudiante);
	String validarPasswdEstudiante(String codEstudiante, String passwd);
}
