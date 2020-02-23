package pe.edu.ceid.simi.operative.domain.hora.repository;

import java.util.List;
import pe.edu.ceid.simi.operative.domain.hora.model.HoraDTO;

public interface HoraRepository {
	List<HoraDTO> getHora(int id);
}
