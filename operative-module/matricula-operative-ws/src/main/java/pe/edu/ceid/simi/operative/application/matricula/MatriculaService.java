package pe.edu.ceid.simi.operative.application.matricula;

import java.util.List;

import pe.edu.ceid.simi.operative.domain.matricula.model.Matricula;
import pe.edu.ceid.simi.operative.domain.matricula.model.MatriculaDTO;
import pe.edu.ceid.simi.operative.domain.voucher.model.VoucherDTO;

public interface MatriculaService {
	boolean crearMatricula(List<Matricula> matricula, int id);
	Matricula editMatricula(Matricula matricula, int id);
	boolean deleteMatricula(int id);
	//List<MatriculaDTO> getMatricula(int id, int estado);
	List<MatriculaDTO> getMatriculaById(int id, int estado);
	List<VoucherDTO> obtenerpagosSinUsar(int codUser);
}
