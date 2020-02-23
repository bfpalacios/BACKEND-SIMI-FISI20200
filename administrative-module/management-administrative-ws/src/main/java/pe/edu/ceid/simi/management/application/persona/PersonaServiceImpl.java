package pe.edu.ceid.simi.management.application.persona;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.ceid.simi.management.domain.persona.model.Persona;
import pe.edu.ceid.simi.management.domain.persona.repository.PersonaRepository;

@Service
public class PersonaServiceImpl implements PersonaService {

	@Autowired
	private PersonaRepository repository;
	
	@Override
	public Persona crearPersona(Persona persona) {
		// TODO Auto-generated method stub
		return this.repository.crearPersona(persona);
	}

	@Override
	public Persona editPersona(Persona persona, int id) {
		// TODO Auto-generated method stub
		return this.repository.editPersona(persona, id);
	}

	@Override
	public List<Persona> getPersonas() {
		// TODO Auto-generated method stub
		return this.repository.getPersonas();
	}

	@Override
	public boolean deletePersona(int idPersona) {
		// TODO Auto-generated method stub
		return this.repository.deletePersona(idPersona);
	}

	@Override
	public Persona getPersonaById(int id) {
		// TODO Auto-generated method stub
		return this.repository.getPersonaById(id);
	}

}
