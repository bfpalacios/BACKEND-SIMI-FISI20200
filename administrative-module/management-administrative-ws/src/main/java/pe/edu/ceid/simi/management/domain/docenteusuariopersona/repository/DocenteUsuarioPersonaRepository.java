package pe.edu.ceid.simi.management.domain.docenteusuariopersona.repository;

import java.util.List;

import pe.edu.ceid.simi.management.domain.docenteusuariopersona.model.DocenteUsuarioPersona;

public interface DocenteUsuarioPersonaRepository {
	DocenteUsuarioPersona crearDocenteUsuarioPersona(DocenteUsuarioPersona docenteUsuarioPersona);
	DocenteUsuarioPersona editDocenteUsuarioPersona(DocenteUsuarioPersona docenteUsuarioPersona, String id);
	List<DocenteUsuarioPersona> getDocenteUsuarioPersona();
	String deleteDocenteUsuarioPersona(String codDocente);
	DocenteUsuarioPersona getDocenteUsuarioPersonaById(String id);
}
