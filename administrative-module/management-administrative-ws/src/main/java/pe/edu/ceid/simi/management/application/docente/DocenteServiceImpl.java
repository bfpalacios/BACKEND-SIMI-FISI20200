package pe.edu.ceid.simi.management.application.docente;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.ceid.simi.management.domain.docente.model.Docente;
import pe.edu.ceid.simi.management.domain.docente.model.DocenteDTO;
import pe.edu.ceid.simi.management.domain.docente.repository.DocenteRepository;

@Service
public class DocenteServiceImpl implements DocenteService {

	@Autowired
	private DocenteRepository repository;
	
	@Override
	public Docente crearDocente(Docente docente) {
		// TODO Auto-generated method stub
		return this.repository.crearDocente(docente);
	}

	@Override
	public Docente editDocente(Docente docente, int id) {
		// TODO Auto-generated method stub
		return this.repository.editDocente(docente, id);
	}

	@Override
	public boolean deleteDocente(int id) {
		// TODO Auto-generated method stub
		return this.repository.deleteDocente(id);
	}

	@Override
	public List<DocenteDTO> getDocente() {
		// TODO Auto-generated method stub
		return this.repository.getDocente();
	}

	@Override
	public DocenteDTO getDocenteById(int id) {
		// TODO Auto-generated method stub
		return this.repository.getDocenteById(id);
	}

}
