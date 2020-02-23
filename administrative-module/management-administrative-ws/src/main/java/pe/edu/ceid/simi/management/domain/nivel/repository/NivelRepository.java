package pe.edu.ceid.simi.management.domain.nivel.repository;
import java.util.List;

import pe.edu.ceid.simi.management.domain.nivel.model.Nivel;

public interface NivelRepository {

	List<Nivel> getNiveles();
	Nivel getNivelById(int id);
	
}
