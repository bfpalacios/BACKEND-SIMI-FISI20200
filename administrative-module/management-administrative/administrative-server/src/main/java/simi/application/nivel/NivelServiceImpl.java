package simi.application.nivel;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import simi.domain.nivel.model.Nivel;
import simi.domain.nivel.repository.NivelRepository;

@Service
public class NivelServiceImpl implements NivelService{
	
	@Autowired
	private NivelRepository repository;

	@Override
	public List<Nivel> getNiveles() {
		// TODO Auto-generated method stub
		return this.repository.getNiveles();
	}

	@Override
	public Nivel getNivelById(int id) {
		// TODO Auto-generated method stub
		return this.repository.getNivelById(id);
	}

}
