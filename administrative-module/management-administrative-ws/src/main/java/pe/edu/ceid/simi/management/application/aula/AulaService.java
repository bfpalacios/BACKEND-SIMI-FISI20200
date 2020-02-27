package pe.edu.ceid.simi.management.application.aula;

import java.util.List;

import pe.edu.ceid.simi.management.domain.aula.model.Aula;
import pe.edu.ceid.simi.management.domain.aula.model.AulaDTO;

public interface AulaService {
	String crearAula(Aula aula);
	String editAula(Aula aula, int id);
	List<AulaDTO> getAulas();
	List<AulaDTO> getAulasBySede(int idSede);
	AulaDTO getAulaById(int id);
	String deleteAula(int id);
}
