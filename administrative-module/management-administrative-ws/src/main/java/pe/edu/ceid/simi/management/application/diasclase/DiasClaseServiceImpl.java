package pe.edu.ceid.simi.management.application.diasclase;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.ceid.simi.management.domain.diasclase.model.DiasClase;
import pe.edu.ceid.simi.management.domain.diasclase.repository.DiasClaseRepository;


@Service
public class DiasClaseServiceImpl implements DiasClaseService {

	@Autowired
	private DiasClaseRepository repository;
	
	@Override
	public DiasClase crearDiasClase(DiasClase diasClase) {
		// TODO Auto-generated method stub
		return this.repository.crearDiasClase(diasClase);
	}

	@Override
	public DiasClase editDiasClase(DiasClase diasClase, int id) {
		// TODO Auto-generated method stub
		return this.repository.editDiasClase(diasClase, id);
	}

	@Override
	public boolean deleteDiasClase(int cdia) {
		// TODO Auto-generated method stub
		return this.repository.deleteDiasClase(cdia);
	}
	@Override
	public List<DiasClase> getDiasClase() {
		// TODO Auto-generated method stub
		return this.repository.getDiasClase();
	}

	@Override
	public DiasClase getDiasClaseById(int id) {
		// TODO Auto-generated method stub
		return this.repository.getDiasClaseById(id);
	}

}
