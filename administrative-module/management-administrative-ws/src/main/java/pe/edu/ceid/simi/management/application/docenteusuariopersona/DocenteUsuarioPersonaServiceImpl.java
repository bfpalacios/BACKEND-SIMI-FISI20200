package pe.edu.ceid.simi.management.application.docenteusuariopersona;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.ceid.simi.management.domain.docenteusuariopersona.model.DocenteUsuarioPersona;
import pe.edu.ceid.simi.management.domain.docenteusuariopersona.repository.DocenteUsuarioPersonaRepository;

@Service
public class DocenteUsuarioPersonaServiceImpl implements DocenteUsuarioPersonaService {

	@Autowired
	private DocenteUsuarioPersonaRepository repository;
	
	@Override
	public String crearDocenteUsuarioPersona(DocenteUsuarioPersona docenteUsuarioPersona) {
		// TODO Auto-generated method stub
		return this.repository.crearDocenteUsuarioPersona(docenteUsuarioPersona);
	}

	@Override
	public String editDocenteUsuarioPersona(DocenteUsuarioPersona docenteUsuarioPersona, String id) {
		// TODO Auto-generated method stub
		return this.repository.editDocenteUsuarioPersona(docenteUsuarioPersona, id);
	}

	@Override
	public List<DocenteUsuarioPersona> getDocenteUsuarioPersona() {
		// TODO Auto-generated method stub
		return this.repository.getDocenteUsuarioPersona();
	}

	@Override
	public String deleteDocenteUsuarioPersona(String codDocente) {
		// TODO Auto-generated method stub
		return this.repository.deleteDocenteUsuarioPersona(codDocente);
	}

	@Override
	public DocenteUsuarioPersona getDocenteUsuarioPersonaById(String id) {
		// TODO Auto-generated method stub
		return this.repository.getDocenteUsuarioPersonaById(id);
	}

	@Override
	public List<DocenteUsuarioPersona> getDocentesByCursoPeriodo(int idCurso, int idPeriodo) {
		// TODO Auto-generated method stub
		return this.repository.getDocentesByCursoPeriodo(idCurso, idPeriodo);
	}

}
