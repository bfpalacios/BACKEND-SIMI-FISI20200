package pe.edu.ceid.simi.management.application.horario;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.ceid.simi.management.domain.horario.model.Horario;
import pe.edu.ceid.simi.management.domain.horario.model.HorarioDTO;
import pe.edu.ceid.simi.management.domain.horario.repository.HorarioRepository;


@Service
public class HorarioServiceImpl implements HorarioService {

	@Autowired
	private HorarioRepository repository;
	
	@Override
	public Horario crearHorario(Horario horario) {
		// TODO Auto-generated method stub
		return this.repository.crearHorario(horario);
	}

	@Override
	public Horario editHorario(Horario horario, int id) {
		// TODO Auto-generated method stub
		return this.repository.editHorario(horario, id);
	}

	@Override
	public boolean deleteHorario(int chorario) {
		// TODO Auto-generated method stub
		return this.repository.deleteHorario(chorario);
	}
	
	@Override
	public List<HorarioDTO> getHorarios() {
		// TODO Auto-generated method stub
		return this.repository.getHorarios();
	}

	@Override
	public List<HorarioDTO> getHorariosById(int id) {
		// TODO Auto-generated method stub
		return this.repository.getHorariosById(id);
	}

}
