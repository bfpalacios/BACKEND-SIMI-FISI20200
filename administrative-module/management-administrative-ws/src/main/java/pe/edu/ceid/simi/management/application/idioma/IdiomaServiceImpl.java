package pe.edu.ceid.simi.management.application.idioma;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.ceid.simi.management.domain.idioma.model.Idioma;
import pe.edu.ceid.simi.management.domain.idioma.repository.IdiomaRepository;

@Service
public class IdiomaServiceImpl implements IdiomaService{
	
	@Autowired
	private IdiomaRepository repository;
	
	@Override
	public Idioma crearIdioma(Idioma idioma) {
		// TODO Auto-generated method stub
		return this.repository.crearIdioma(idioma);
	}

	@Override
	public Idioma editIdioma(Idioma idioma, int id) {
		// TODO Auto-generated method stub
		return this.repository.editIdioma(idioma, id);
	}

	@Override
	public List<Idioma> getIdiomas() {
		// TODO Auto-generated method stub
		return this.repository.getIdiomas();
	}

	@Override
	public boolean deleteIdioma(int cidioma) {
		// TODO Auto-generated method stub
		return this.repository.deleteIdioma(cidioma);
	}

	@Override
	public Idioma getIdiomaById(int id) {
		// TODO Auto-generated method stub
		return this.repository.getIdiomaById(id);
	}

}
