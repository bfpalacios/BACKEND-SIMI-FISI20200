package pe.edu.ceid.simi.management.application.estadomatricula;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.ceid.simi.management.domain.estadomatricula.model.EstadoMatricula;
import pe.edu.ceid.simi.management.domain.estadomatricula.repository.EstadoMatriculaRepository;

@Service
public class EstadoMatriculaServiceImpl implements EstadoMatriculaService {

	@Autowired
	private EstadoMatriculaRepository repository;
	
	@Override
	public List<EstadoMatricula> getEstadoMatricula() {
		// TODO Auto-generated method stub
		return this.repository.getEstadoMatricula();
	}

	@Override
	public EstadoMatricula getEstadoMatriculaById(String idEstadoMatricula) {
		// TODO Auto-generated method stub
		return this.repository.getEstadoMatriculaById(idEstadoMatricula);
	}

}
