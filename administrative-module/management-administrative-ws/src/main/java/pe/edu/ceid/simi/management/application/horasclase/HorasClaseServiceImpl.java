package pe.edu.ceid.simi.management.application.horasclase;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.ceid.simi.management.domain.horasclase.model.HorasClase;
import pe.edu.ceid.simi.management.domain.horasclase.repository.HorasClaseRepository;
@Service
public class HorasClaseServiceImpl implements HorasClaseService {

	@Autowired
	private HorasClaseRepository repository;
	
	@Override
	public HorasClase crearHorasClase(HorasClase horasClase) {
		// TODO Auto-generated method stub
		return this.repository.crearHorasClase(horasClase);
	}

	@Override
	public HorasClase editHorasClase(HorasClase horasClase, int id) {
		// TODO Auto-generated method stub
		return this.repository.editHorasClase(horasClase, id);
	}

	@Override
	public boolean deleteHorasClase(int chora) {
		// TODO Auto-generated method stub
		return this.repository.deleteHorasClase(chora);
	}

	@Override
	public List<HorasClase> getHorasClase() {
		// TODO Auto-generated method stub
		return this.repository.getHorasClase();
	}

	@Override
	public HorasClase getHorasClaseById(int id) {
		// TODO Auto-generated method stub
		return this.repository.getHorasClaseById(id);
	}

}
