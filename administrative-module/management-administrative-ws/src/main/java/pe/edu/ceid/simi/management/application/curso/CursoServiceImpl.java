package pe.edu.ceid.simi.management.application.curso;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.ceid.simi.management.domain.curso.model.Curso;
import pe.edu.ceid.simi.management.domain.curso.model.CursoDTO;
import pe.edu.ceid.simi.management.domain.curso.repository.CursoRepository;


@Service
public class CursoServiceImpl implements CursoService{
	
	@Autowired
	private CursoRepository repository;
	
	@Override
	public Curso crearCurso(Curso curso) {
		// TODO Auto-generated method stub
		return this.repository.crearCurso(curso);
	}

	@Override
	public Curso editCurso(Curso curso, int id) {
		// TODO Auto-generated method stub
		return this.repository.editCurso(curso, id);
	}

	@Override
	public boolean deleteCurso(int id) {
		// TODO Auto-generated method stub
		return this.repository.deleteCurso(id);
	}

	@Override
	public List<CursoDTO> getCursos() {
		// TODO Auto-generated method stub
		return this.repository.getCursos();
	}

	@Override
	public CursoDTO getCursoById(int id) {
		// TODO Auto-generated method stub
		return this.repository.getCursoById(id);
	}

}
