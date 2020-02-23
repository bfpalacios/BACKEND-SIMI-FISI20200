package pe.edu.ceid.simi.management.application.progcurso;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.ceid.simi.management.domain.progcurso.model.ProgCurso;
import pe.edu.ceid.simi.management.domain.progcurso.model.ProgCursoDTO;
import pe.edu.ceid.simi.management.domain.progcurso.repository.ProgCursoRepository;

@Service
public class ProgCursoServiceImpl implements ProgCursoService {

	@Autowired
	private ProgCursoRepository repository;

	@Override
	public ProgCurso crearProgCurso(ProgCurso progCurso) {
		// TODO Auto-generated method stub
		return this.repository.crearProgCurso(progCurso);
	}

	@Override
	public ProgCurso editProgCurso(ProgCurso progCurso, int id) {
		// TODO Auto-generated method stub
		return this.repository.editProgCurso(progCurso, id);
	}

	@Override
	public boolean deleteProgCurso(int id) {
		// TODO Auto-generated method stub
		return this.repository.deleteProgCurso(id);
	}

	@Override
	public List<ProgCursoDTO> getProgCursos() {
		// TODO Auto-generated method stub
		return this.repository.getProgCursos();
	}

	@Override
	public ProgCursoDTO getProgCursoById(int id) {
		// TODO Auto-generated method stub
		return this.repository.getProgCursoById(id);
	}
	
}
