package pe.edu.ceid.simi.operative.application.persona;

import pe.edu.ceid.simi.operative.domain.persona.model.PersonaUsuario;

public interface PersonaService {

	PersonaUsuario obtenerDatosUsuario(int codUsuario);
	PersonaUsuario obtenerInformacionAcademica(int codUsuario);
}
