package pe.edu.ceid.simi.operative.application.hora;

import java.util.List;
import pe.edu.ceid.simi.operative.domain.hora.model.HoraDTO;

public interface HoraService {
	List<HoraDTO> getHora(int id);
}
