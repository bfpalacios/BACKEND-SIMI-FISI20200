package pe.edu.ceid.simi.operative.application.persona;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.ceid.simi.operative.domain.persona.model.PersonaUsuario;
import pe.edu.ceid.simi.operative.domain.persona.repository.PersonaRepository;

@Service
public class PersonaServiceImpl implements PersonaService{

	@Autowired
	private PersonaRepository repository;
	@Override
	public PersonaUsuario obtenerDatosUsuario(int codUsuario) {
		return this.repository.obtenerDatosUsuario(codUsuario);
	}
	@Override
	public PersonaUsuario obtenerInformacionAcademica(int codUsuario) {
		if (codUsuario != 0) {
			return this.repository.obtenerInformacionAcademica(codUsuario);
		}
		return null;
	}

}
