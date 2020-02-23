package pe.edu.ceid.simi.operative.application.nivel;

import pe.edu.ceid.simi.operative.domain.nivel.model.NivelDTO;
import java.util.List;

public interface NivelService {
	List<NivelDTO> getNivelbyIdioma(int id);
}
