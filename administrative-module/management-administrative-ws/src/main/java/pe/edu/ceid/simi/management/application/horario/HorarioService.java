package pe.edu.ceid.simi.management.application.horario;

import java.util.List;

import pe.edu.ceid.simi.management.domain.horario.model.Horario;
import pe.edu.ceid.simi.management.domain.horario.model.HorarioDTO;


public interface HorarioService {
	Horario crearHorario(Horario horario);
	Horario editHorario(Horario horario, int id);
	List<HorarioDTO> getHorarios();
	List<HorarioDTO> getHorariosByCursoPeriodo(int idCurso, int idPeriodo);
	boolean deleteHorario(int idHorario);
	List<HorarioDTO> getHorariosById(int id);
}
