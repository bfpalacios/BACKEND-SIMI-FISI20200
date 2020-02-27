package pe.edu.ceid.simi.management.application.alumnosm;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.ceid.simi.management.domain.alumnosm.model.AlumnoSM;
import pe.edu.ceid.simi.management.domain.alumnosm.repository.AlumnoSMRepository;

@Service
public class AlumnoSMServiceImpl implements AlumnoSMService {

	@Autowired
	private AlumnoSMRepository repository;
	
	@Override
	public List<AlumnoSM> getAlumnoSM() {
		// TODO Auto-generated method stub
		return this.repository.getAlumnoSM();
	}

	@Override
	public AlumnoSM getAlumnoSMById(String codAlumnoAsm) {
		// TODO Auto-generated method stub
		return this.repository.getAlumnoSMById(codAlumnoAsm);
	}

}
