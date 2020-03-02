package pe.edu.ceid.simi.management.application.estudianteusuariopersona;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.ceid.simi.management.domain.estudianteusuariopersona.model.EstudianteUsuarioPersona;
import pe.edu.ceid.simi.management.domain.estudianteusuariopersona.repository.EstudianteUsuarioPersonaRepository;

@Service
public class EstudianteUsuarioPersonaServiceImpl implements EstudianteUsuarioPersonaService {

	@Autowired
	private EstudianteUsuarioPersonaRepository repository;
	
	@Override
	public String crearEstudianteUsuarioPersona(EstudianteUsuarioPersona estudianteUsuarioPersona) {
		// TODO Auto-generated method stub
		return this.repository.crearEstudianteUsuarioPersona(estudianteUsuarioPersona);
	}

	@Override
	public String editEstudianteUsuarioPersona(EstudianteUsuarioPersona estudianteUsuarioPersona,
			String id) {
		// TODO Auto-generated method stub
		return this.repository.editEstudianteUsuarioPersona(estudianteUsuarioPersona, id);
	}

	@Override
	public List<EstudianteUsuarioPersona> getEstudianteUsuarioPersona() {
		// TODO Auto-generated method stub
		return this.repository.getEstudianteUsuarioPersona();
	}

	@Override
	public String deleteEstudianteUsuarioPersona(String codEstudiante) {
		// TODO Auto-generated method stub
		return this.repository.deleteEstudianteUsuarioPersona(codEstudiante);
	}

	@Override
	public EstudianteUsuarioPersona getEstudianteUsuarioPersonaById(String codEstudiante) {
		// TODO Auto-generated method stub
		return this.repository.getEstudianteUsuarioPersonaById(codEstudiante);
	}

	@Override
	public List<EstudianteUsuarioPersona> getEstudianteUsuarioPersonaMatriculadosByProgCurso(int idProgCurso) {
		// TODO Auto-generated method stub
		return this.repository.getEstudianteUsuarioPersonaMatriculadosByProgCurso(idProgCurso);
	}

	@Override
	public List<EstudianteUsuarioPersona> getEstudianteUsuarioPersonaByTipoEstudiante(int idTipoEstudiante) {
		// TODO Auto-generated method stub
		return this.repository.getEstudianteUsuarioPersonaByTipoEstudiante(idTipoEstudiante);
	}

	@Override
	public List<EstudianteUsuarioPersona> getEstudiantesByCursoPeriodo(int idCurso, int idPeriodo) {
		// TODO Auto-generated method stub
		return this.repository.getEstudiantesByCursoPeriodo(idCurso, idPeriodo);
	}

}
