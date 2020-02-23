package pe.edu.ceid.simi.management.application.grupohorario;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.ceid.simi.management.domain.grupohorario.model.GrupoHorario;
import pe.edu.ceid.simi.management.domain.grupohorario.model.GrupoHorarioDTO;
import pe.edu.ceid.simi.management.domain.grupohorario.repository.GrupoHorarioRepository;


@Service
public class GrupoHorarioServiceImpl implements GrupoHorarioService {

	@Autowired
	private GrupoHorarioRepository repository;
	
	@Override
	public GrupoHorario crearGrupoHorario(GrupoHorario grupoHorario) {
		// TODO Auto-generated method stub
		return this.repository.crearGrupoHorario(grupoHorario);
	}

	@Override
	public GrupoHorario editGrupoHorario(GrupoHorario grupoHorario, int id) {
		// TODO Auto-generated method stub
		return this.repository.editGrupoHorario(grupoHorario, id);
	}

	@Override
	public boolean deleteGrupoHorario(int id) {
		// TODO Auto-generated method stub
		return this.repository.deleteGrupoHorario(id);
	}

	@Override
	public List<GrupoHorarioDTO> getGrupoHorario() {
		// TODO Auto-generated method stub
		return this.repository.getGrupoHorario();
	}

	@Override
	public GrupoHorarioDTO getGrupoHorarioById(int id) {
		// TODO Auto-generated method stub
		return this.repository.getGrupoHorarioById(id);
	}

}
