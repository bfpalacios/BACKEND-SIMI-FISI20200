package pe.edu.ceid.simi.operative.application.nivel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.ceid.simi.operative.domain.nivel.model.NivelDTO;
import pe.edu.ceid.simi.operative.domain.nivel.repository.NivelRepository;
import java.util.List;

@Service
public class NivelServiceImpl implements NivelService{

	@Autowired
	private NivelRepository repository;
	
	@Override
	public List<NivelDTO> getNivelbyIdioma(int id) {
		// TODO Auto-generated method stub
		return this.repository.getNivelbyIdioma(id);
	}
	

}
