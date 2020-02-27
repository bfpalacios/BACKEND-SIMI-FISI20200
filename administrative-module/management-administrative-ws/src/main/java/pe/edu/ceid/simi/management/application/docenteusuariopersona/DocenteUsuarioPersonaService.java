package pe.edu.ceid.simi.management.application.docenteusuariopersona;

import java.util.List;

import pe.edu.ceid.simi.management.domain.docenteusuariopersona.model.DocenteUsuarioPersona;

public interface DocenteUsuarioPersonaService {
	String crearDocenteUsuarioPersona(DocenteUsuarioPersona docenteUsuarioPersona);
	String editDocenteUsuarioPersona(DocenteUsuarioPersona docenteUsuarioPersona, String id);
	List<DocenteUsuarioPersona> getDocenteUsuarioPersona();
	String deleteDocenteUsuarioPersona(String codDocente);
	DocenteUsuarioPersona getDocenteUsuarioPersonaById(String id);
}
