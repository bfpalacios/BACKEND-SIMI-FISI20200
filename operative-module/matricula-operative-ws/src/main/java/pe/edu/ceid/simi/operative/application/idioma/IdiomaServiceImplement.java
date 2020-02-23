package pe.edu.ceid.simi.operative.application.idioma;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.ceid.simi.operative.domain.idioma.model.IdiomaDTO;
import pe.edu.ceid.simi.operative.domain.idioma.repository.IdiomaRepository;

@Service
public class IdiomaServiceImplement implements IdiomaService {

	@Autowired
	private IdiomaRepository repository;
	
	@Override
	public List<IdiomaDTO> getIdioma() {
		return this.repository.getIdioma();
	}

}
