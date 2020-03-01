package pe.edu.ceid.simi.management.application.progdoccurso;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.ceid.simi.management.domain.progdoccurso.model.ProgDocCurso;
import pe.edu.ceid.simi.management.domain.progdoccurso.model.ProgDocCursoDTO;
import pe.edu.ceid.simi.management.domain.progdoccurso.repository.ProgDocCursoRepository;

@Service
public class ProgDocCursoServiceImpl implements ProgDocCursoService {

	@Autowired
	private ProgDocCursoRepository repository;
	
	@Override
	public String crearProgDocCurso(ProgDocCurso progDocCurso) {
		// TODO Auto-generated method stub
		return this.repository.crearProgDocCurso(progDocCurso);
	}

	@Override
	public String editProgDocCurso(ProgDocCurso progDocCurso, int id) {
		// TODO Auto-generated method stub
		return this.repository.editProgDocCurso(progDocCurso, id);
	}

	@Override
	public boolean deleteProgDocCurso(int id) {
		// TODO Auto-generated method stub
		return this.repository.deleteProgDocCurso(id);
	}

	@Override
	public List<ProgDocCursoDTO> getProgDocCursos() {
		// TODO Auto-generated method stub
		return this.repository.getProgDocCursos();
	}

	 @Override
	 public ProgDocCursoDTO getProgDocCursoById(int id) {
	 	// TODO Auto-generated method stub
	 	return this.repository.getProgDocCursoById(id);
	 }

	@Override
	public List<ProgDocCursoDTO> getProgDocCursosByPeriodo(int idPeriodo) {
		// TODO Auto-generated method stub
		return this.repository.getProgDocCursosByPeriodo(idPeriodo);
	}

	@Override
	public List<ProgDocCursoDTO> getProgDocCursosByPeriodoIdioma(int idPeriodo, int idIdioma) {
		// TODO Auto-generated method stub
		return this.repository.getProgDocCursosByPeriodoIdioma(idPeriodo, idIdioma);
	}

	@Override
	public List<ProgDocCursoDTO> getProgDocCursosByDocenteCursoPeriodo(String codDocente, int idCurso, int idPeriodo) {
		// TODO Auto-generated method stub
		return this.repository.getProgDocCursosByDocenteCursoPeriodo(codDocente, idCurso, idPeriodo);
	}

}
