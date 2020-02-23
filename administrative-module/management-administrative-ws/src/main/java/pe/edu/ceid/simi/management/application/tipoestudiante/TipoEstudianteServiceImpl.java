package pe.edu.ceid.simi.management.application.tipoestudiante;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.ceid.simi.management.domain.tipoestudiante.model.TipoEstudiante;
import pe.edu.ceid.simi.management.domain.tipoestudiante.repository.TipoEstudianteRepository;

@Service
public class TipoEstudianteServiceImpl implements TipoEstudianteService {

	@Autowired
	private TipoEstudianteRepository repository;

	@Override
	public TipoEstudiante crearTipoEstudiante(TipoEstudiante tipoEstudiante) {
		// TODO Auto-generated method stub
		return this.repository.crearTipoEstudiante(tipoEstudiante);
	}

	@Override
	public TipoEstudiante editTipoEstudiante(TipoEstudiante tipoEstudiante, int id) {
		// TODO Auto-generated method stub
		return this.repository.editTipoEstudiante(tipoEstudiante, id);
	}

	@Override
	public boolean deleteTipoEstudiante(int ctipoEstudiante) {
		// TODO Auto-generated method stub
		return this.repository.deleteTipoEstudiante(ctipoEstudiante);
	}

	@Override
	public List<TipoEstudiante> getTiposEstudiante() {
		// TODO Auto-generated method stub
		return this.repository.getTiposEstudiante();
	}

	@Override
	public TipoEstudiante getTipoEstudianteById(int id) {
		// TODO Auto-generated method stub
		return this.repository.getTipoEstudianteById(id);
	}

}
