package pe.edu.ceid.simi.management.application.matricula;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.ceid.simi.management.domain.matricula.model.Matricula;
import pe.edu.ceid.simi.management.domain.matricula.model.MatriculaDTO;
import pe.edu.ceid.simi.management.domain.matricula.repository.MatriculaRepository;

@Service
public class MatriculaServiceImpl implements MatriculaService {

	@Autowired
	private MatriculaRepository repository;
	
	@Override
	public Matricula crearMatricula(Matricula matricula) {
		// TODO Auto-generated method stub
		return this.repository.crearMatricula(matricula);
	}

	@Override
	public Matricula editMatricula(Matricula matricula, int id) {
		// TODO Auto-generated method stub
		return this.repository.editMatricula(matricula, id);
	}

	@Override
	public boolean deleteMatricula(int id) {
		// TODO Auto-generated method stub
		return this.repository.deleteMatricula(id);
	}

	@Override
	public List<MatriculaDTO> getMatriculas() {
		// TODO Auto-generated method stub
		return this.repository.getMatriculas();
	}

	@Override
	public MatriculaDTO getMatriculaById(int id) {
		// TODO Auto-generated method stub
		return this.repository.getMatriculaById(id);
	}

}
