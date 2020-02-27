package pe.edu.ceid.simi.management.domain.alumnosm.repository;

import java.util.List;

import pe.edu.ceid.simi.management.domain.alumnosm.model.AlumnoSM;

public interface AlumnoSMRepository {
	List<AlumnoSM> getAlumnoSM();
	AlumnoSM getAlumnoSMById(String codAlumnoAsm);
}
