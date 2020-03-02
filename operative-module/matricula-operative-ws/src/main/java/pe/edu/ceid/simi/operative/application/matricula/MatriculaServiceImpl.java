package pe.edu.ceid.simi.operative.application.matricula;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.ceid.simi.operative.domain.curso.model.CursoDTO;
import pe.edu.ceid.simi.operative.domain.matricula.model.Matricula;
import pe.edu.ceid.simi.operative.domain.matricula.model.MatriculaDTO;
import pe.edu.ceid.simi.operative.domain.matricula.repository.MatriculaRepository;
import pe.edu.ceid.simi.operative.domain.voucher.model.VoucherDTO;

@Service
public class MatriculaServiceImpl implements MatriculaService {

	@Autowired
	private MatriculaRepository matriculaRepository;

	@Override
	public boolean crearMatricula(List<Matricula> matricula, int id) {
		// TODO Auto-generated method stub
		return this.matriculaRepository.crearMatricula(matricula, id);
	}

	@Override
	public Matricula editMatricula(Matricula matricula, int id) {
		// TODO Auto-generated method stub
		return this.matriculaRepository.editMatricula(matricula, id);
	}

	@Override
	public boolean deleteMatricula(int id) {
		// TODO Auto-generated method stub
		return this.matriculaRepository.deleteMatricula(id);
	}

//	@Override
//	public List<MatriculaDTO> getMatricula(int id, int estado) {
//		// TODO Auto-generated method stub
//		return this.repository.getMatricula(id, estado);
//	}

	@Override
	public List<MatriculaDTO> getMatriculaById(int id, int estado) {
		// TODO Auto-generated method stub
		return this.matriculaRepository.getMatriculaById(id, estado);
	}

	@Override
	public List<VoucherDTO> obtenerpagosSinUsar(int codUser) {
		return this.matriculaRepository.obtenerpagosSinUsar(codUser);
	}

	@Override
	public boolean matricularOnline(List<Matricula> matricula, int id) {
		// TODO Auto-generated method stub
		return this.matriculaRepository.crearMatricula(matricula, id);
	}

	@Override
	public List<VoucherDTO> obtenerpagosRealizados(int codUser) {
		return this.matriculaRepository.obtenerpagosRealizados(codUser);
	}

	@Override
	public List<CursoDTO> getCursosDelAlumno(int codUser) {
		return this.matriculaRepository.getCursosDelAlumno(codUser);
	}

}
