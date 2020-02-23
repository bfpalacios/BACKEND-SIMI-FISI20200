package pe.edu.ceid.simi.operative.application.alumno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.ceid.simi.operative.domain.alumno.model.AlumnoDTO;
import pe.edu.ceid.simi.operative.domain.alumno.repository.AlumnoRepository;

@Service
public class AlumnoServiceImpl implements AlumnoService{

	@Autowired
	private AlumnoRepository repository;
	
	@Override
	public AlumnoDTO getAlumnoById(int id) {
		return this.repository.getAlumnoById(id);
	}

}
