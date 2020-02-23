package pe.edu.ceid.simi.operative.application.programacion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.ceid.simi.operative.domain.programacion.model.ProgramacionDTO;
import pe.edu.ceid.simi.operative.domain.programacion.repository.ProgramacionRepository;

@Service
public class ProgramacionServiceImpl implements ProgramacionService {

	@Autowired
	private ProgramacionRepository repository;
	
	@Override
	public List<ProgramacionDTO> getProgramacion() {
		// TODO Auto-generated method stub
	
		return this.repository.getProgramacion();
	}

}
