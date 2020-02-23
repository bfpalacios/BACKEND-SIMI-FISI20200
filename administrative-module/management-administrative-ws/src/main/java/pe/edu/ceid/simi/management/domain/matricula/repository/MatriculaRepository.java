package pe.edu.ceid.simi.management.domain.matricula.repository;

import java.util.List;

import pe.edu.ceid.simi.management.domain.matricula.model.Matricula;
import pe.edu.ceid.simi.management.domain.matricula.model.MatriculaDTO;

public interface MatriculaRepository {
	Matricula crearMatricula(Matricula matricula);
	Matricula editMatricula(Matricula matricula, int id);
	boolean deleteMatricula(int id);
	List<MatriculaDTO> getMatriculas();
	MatriculaDTO getMatriculaById(int id);
}
