package pe.edu.ceid.simi.operative.application.matricula;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.ceid.simi.operative.domain.matricula.model.Matricula;
import pe.edu.ceid.simi.operative.domain.matricula.model.MatriculaDTO;
import pe.edu.ceid.simi.operative.domain.matricula.repository.MatriculaRepository;
import pe.edu.ceid.simi.operative.domain.voucher.model.VoucherDTO;

@Service
public class MatriculaServiceImpl implements MatriculaService{
	
	@Autowired
	private MatriculaRepository repository;
	
	@Override
	public boolean crearMatricula(List<Matricula> matricula, int id) {
		// TODO Auto-generated method stub
		return this.repository.crearMatricula(matricula, id);
	}

	@Override
	public Matricula editMatricula(Matricula matricula, int id) {
		// TODO Auto-generated method stub
		return this.repository.editMatricula(matricula, id);
	}

	@Override
	public boolean deleteMatricula(int id) {
		// TODO Auto-generated method stub
		return this.repository.deleteMatricula(id);
	}

//	@Override
//	public List<MatriculaDTO> getMatricula(int id, int estado) {
//		// TODO Auto-generated method stub
//		return this.repository.getMatricula(id, estado);
//	}

	@Override
	public List<MatriculaDTO> getMatriculaById(int id, int estado) {
		// TODO Auto-generated method stub
		return this.repository.getMatriculaById(id, estado);
	}

	@Override
	public List<VoucherDTO> obtenerpagosSinUsar(int codUser) {
		return this.repository.obtenerpagosSinUsar(codUser);
	}

}
