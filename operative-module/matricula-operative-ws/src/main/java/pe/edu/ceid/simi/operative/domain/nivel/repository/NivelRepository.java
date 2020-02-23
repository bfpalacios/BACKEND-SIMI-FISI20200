package pe.edu.ceid.simi.operative.domain.nivel.repository;

import pe.edu.ceid.simi.operative.domain.nivel.model.NivelDTO;
import java.util.List;

public interface NivelRepository {
	
	List<NivelDTO> getNivelbyIdioma(int id);
}
