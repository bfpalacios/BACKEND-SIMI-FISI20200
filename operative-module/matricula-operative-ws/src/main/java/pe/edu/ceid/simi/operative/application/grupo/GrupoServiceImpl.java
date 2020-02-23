package pe.edu.ceid.simi.operative.application.grupo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.ceid.simi.operative.domain.grupo.repository.GrupoRepository;
import pe.edu.ceid.simi.operative.domain.grupo.model.Grupo;

@Service
public class GrupoServiceImpl implements GrupoService {

	@Autowired
	private GrupoRepository repository;
	
	@Override
	public List<Grupo> getGrupo() {
		// TODO Auto-generated method stub
		return this.repository.getGrupo();
	}

}
