package pe.edu.ceid.simi.management.domain.docenteusuariopersona.repository;

import java.util.List;

import pe.edu.ceid.simi.management.domain.docenteusuariopersona.model.DocenteUsuarioPersona;

public interface DocenteUsuarioPersonaRepository {
	String crearDocenteUsuarioPersona(DocenteUsuarioPersona docenteUsuarioPersona);
	String editDocenteUsuarioPersona(DocenteUsuarioPersona docenteUsuarioPersona, String id);
	List<DocenteUsuarioPersona> getDocenteUsuarioPersona();
	List<DocenteUsuarioPersona> getDocentesByCursoPeriodo(int idCurso, int idPeriodo);
	String deleteDocenteUsuarioPersona(String codDocente);
	DocenteUsuarioPersona getDocenteUsuarioPersonaById(String id);
	String validarPasswdDocente(String codDocente, String passwd);
}
