package pe.edu.ceid.simi.management.application.grupohorario;

import java.util.List;

import pe.edu.ceid.simi.management.domain.grupohorario.model.GrupoHorario;
import pe.edu.ceid.simi.management.domain.grupohorario.model.GrupoHorarioDTO;


public interface GrupoHorarioService {
	GrupoHorario crearGrupoHorario(GrupoHorario grupoHorario);
	GrupoHorario editGrupoHorario(GrupoHorario grupoHorario, int id);
	List<GrupoHorarioDTO> getGrupoHorario();
	GrupoHorarioDTO getGrupoHorarioById(int id);
	boolean deleteGrupoHorario(int id);
}
