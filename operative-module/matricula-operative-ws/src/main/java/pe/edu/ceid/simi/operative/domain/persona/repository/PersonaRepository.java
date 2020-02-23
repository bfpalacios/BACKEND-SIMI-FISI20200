package pe.edu.ceid.simi.operative.domain.persona.repository;

import pe.edu.ceid.simi.operative.domain.persona.model.PersonaUsuario;

public interface PersonaRepository {

	PersonaUsuario obtenerDatosUsuario(int codUsuario);
}
