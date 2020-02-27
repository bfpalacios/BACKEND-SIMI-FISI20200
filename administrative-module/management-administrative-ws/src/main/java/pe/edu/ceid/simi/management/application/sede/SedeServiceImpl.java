package pe.edu.ceid.simi.management.application.sede;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.ceid.simi.management.domain.sede.model.Sede;
import pe.edu.ceid.simi.management.domain.sede.repository.SedeRepository;


@Service
public class SedeServiceImpl implements SedeService {

	@Autowired
	private SedeRepository repository;
	
	@Override
	public String crearSede(Sede sede) {
		// TODO Auto-generated method stub
		return this.repository.crearSede(sede);
	}

	@Override
	public String editSede(Sede sede, int id) {
		// TODO Auto-generated method stub
		return this.repository.editSede(sede, id);
	}

	@Override
	public List<Sede> getSedes() {
		// TODO Auto-generated method stub
		return this.repository.getSedes();
	}

	@Override
	public String deleteSede(int csede) {
		// TODO Auto-generated method stub
		return this.repository.deleteSede(csede);
	}

	@Override
	public Sede getSedeById(int id) {
		// TODO Auto-generated method stub
		return this.repository.getSedeById(id);
	}

}
