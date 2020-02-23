package pe.edu.ceid.simi.management.domain.horario.repository;
import java.util.List;

import pe.edu.ceid.simi.management.domain.horario.model.Horario;
import pe.edu.ceid.simi.management.domain.horario.model.HorarioDTO;


public interface HorarioRepository {
	Horario crearHorario(Horario horario);
	Horario editHorario(Horario horario, int id);
	List<HorarioDTO> getHorarios();
	boolean deleteHorario(int chorario);
	List<HorarioDTO> getHorariosById(int id);
}
