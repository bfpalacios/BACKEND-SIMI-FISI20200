package pe.edu.ceid.simi.operative.domain.alumno.repository;

import java.util.List;

import pe.edu.ceid.simi.operative.domain.alumno.model.Alumno;
import pe.edu.ceid.simi.operative.domain.alumno.model.AlumnoDTO;

public interface AlumnoRepository {
	AlumnoDTO getAlumnoById(int id);
}
