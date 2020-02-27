package pe.edu.ceid.simi.management.application.alumnosm;

import java.util.List;

import pe.edu.ceid.simi.management.domain.alumnosm.model.AlumnoSM;

public interface AlumnoSMService {
	List<AlumnoSM> getAlumnoSM();
	AlumnoSM getAlumnoSMById(String codAlumnoAsm);
}
