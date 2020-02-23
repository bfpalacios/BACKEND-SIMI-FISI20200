package pe.edu.ceid.simi.management.domain.persona.repository;

import java.util.List;

import pe.edu.ceid.simi.management.domain.persona.model.Persona;

public interface PersonaRepository {
	Persona crearPersona(Persona persona);
	Persona editPersona(Persona persona, int id);
	List<Persona> getPersonas();
	boolean deletePersona(int idPersona);
	Persona getPersonaById(int id);
}
