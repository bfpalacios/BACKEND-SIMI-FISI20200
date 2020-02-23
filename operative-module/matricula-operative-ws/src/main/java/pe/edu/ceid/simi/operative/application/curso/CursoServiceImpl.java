package pe.edu.ceid.simi.operative.application.curso;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.ceid.simi.operative.domain.curso.model.CursoDTO;
import pe.edu.ceid.simi.operative.domain.curso.repository.CursoRepository;

import java.util.List;

@Service
public class CursoServiceImpl implements CursoService{
	
	@Autowired
	private CursoRepository repository;

	@Override
	public List<CursoDTO> getCursobyNivel(int idIdioma, int idNivel) {
		// TODO Auto-generated method stub
		return this.repository.getCursobyNivel(idIdioma, idNivel);
	}

}
