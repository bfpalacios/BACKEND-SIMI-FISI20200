package pe.edu.ceid.simi.management.domain.aula.repository;

import java.util.List;

import pe.edu.ceid.simi.management.domain.aula.model.Aula;
import pe.edu.ceid.simi.management.domain.aula.model.AulaDTO;

public interface AulaRepository {
	Aula crearAula(Aula aula);
	Aula editAula(Aula aula, int id);
	List<AulaDTO> getAulas();
	List<AulaDTO> getAulasBySede(int idSede);
	AulaDTO getAulaById(int id);
	boolean deleteAula(int id);
}
