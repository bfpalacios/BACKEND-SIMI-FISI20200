package pe.edu.ceid.simi.management.application.estadoprogcurso;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.ceid.simi.management.domain.estadoprogcurso.model.EstadoProgCurso;
import pe.edu.ceid.simi.management.domain.estadoprogcurso.repository.EstadoProgCursoRepository;

@Service
public class EstadoProgCursoServiceImpl implements EstadoProgCursoService {

	@Autowired
	private EstadoProgCursoRepository repository;
	
	@Override
	public EstadoProgCurso crearEstadoProgCurso(EstadoProgCurso estadoProgCurso) {
		// TODO Auto-generated method stub
		return this.repository.crearEstadoProgCurso(estadoProgCurso);
	}

	@Override
	public EstadoProgCurso editEstadoProgCurso(EstadoProgCurso estadoProgCurso, int id) {
		// TODO Auto-generated method stub
		return this.repository.editEstadoProgCurso(estadoProgCurso, id);
	}

	@Override
	public boolean deleteEstadoProgCurso(int id) {
		// TODO Auto-generated method stub
		return this.repository.deleteEstadoProgCurso(id);
	}

	@Override
	public List<EstadoProgCurso> getEstadoProgCurso() {
		// TODO Auto-generated method stub
		return this.repository.getEstadoProgCurso();
	}

	@Override
	public EstadoProgCurso getEstadoProgCursoById(int id) {
		// TODO Auto-generated method stub
		return this.repository.getEstadoProgCursoById(id);
	}

}
