package pe.edu.ceid.simi.operative.application.DocenteCurso;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.ceid.simi.operative.domain.DocenteCurso.model.DocenteCurso;
import pe.edu.ceid.simi.operative.domain.DocenteCurso.repository.DocenteCursoRepository;

@Service
public class DocenteCursoImpl implements DocenteCursoService{

	@Autowired
	private DocenteCursoRepository repository;
	
	@Override
	public List<DocenteCurso> listCursoByDocente(int id) {
		return this.repository.listCursoByDocente(id);
	}

}
