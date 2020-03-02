package pe.edu.ceid.simi.operative.application.AlumnoCurso;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.ceid.simi.operative.domain.alumnoCurso.model.AlumnoCurso;
import pe.edu.ceid.simi.operative.domain.alumnoCurso.repository.AlumnoCursoRepository;

@Service
public class AlumnoCursoServiceImpl implements AlumnoCursoService {
	@Autowired
	private AlumnoCursoRepository repository;

	@Override
	public List<AlumnoCurso> getAlumnoByCurso(int id) {
		// TODO Auto-generated method stub
		return this.repository.getAlumdoByCurso(id);
	}
	

}
