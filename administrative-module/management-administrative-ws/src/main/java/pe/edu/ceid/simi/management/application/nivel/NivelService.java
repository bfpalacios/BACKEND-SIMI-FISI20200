package pe.edu.ceid.simi.management.application.nivel;

import java.util.List;

import pe.edu.ceid.simi.management.domain.nivel.model.Nivel;


public interface NivelService {
	List<Nivel> getNiveles();
	Nivel getNivelById(int id);
}
