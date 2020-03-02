package pe.edu.ceid.simi.management.application.matricula;

import java.util.List;

import pe.edu.ceid.simi.management.domain.matricula.model.Matricula;
import pe.edu.ceid.simi.management.domain.matricula.model.MatriculaDTO;

public interface MatriculaService {
	Matricula crearMatricula(Matricula matricula);
	Matricula editMatricula(Matricula matricula, int id);
	boolean deleteMatricula(int id);
	List<MatriculaDTO> getMatriculas();
	List<MatriculaDTO> getMatriculasBySedePeriodo(int idSede, int idPeriodo);
	MatriculaDTO getMatriculaById(int id);
}
