package pe.edu.ceid.simi.operative.domain.matricula.repository;

import java.util.List;

import pe.edu.ceid.simi.operative.domain.matricula.model.Matricula;
import pe.edu.ceid.simi.operative.domain.matricula.model.MatriculaDTO;
import pe.edu.ceid.simi.operative.domain.voucher.model.VoucherDTO;

public interface MatriculaRepository {
	
	Matricula crearMatricula(Matricula matricula);
	Matricula editMatricula(Matricula matricula, int id);
	boolean deleteMatricula(int id);
	List<MatriculaDTO> getMatricula();
	MatriculaDTO getMatriculaById(int id);
	List<VoucherDTO> obtenerpagosSinUsar(int codUser);
}



