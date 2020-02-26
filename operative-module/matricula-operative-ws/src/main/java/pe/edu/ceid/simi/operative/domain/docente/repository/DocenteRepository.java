package pe.edu.ceid.simi.operative.domain.docente.repository;

import java.util.List;

import pe.edu.ceid.simi.operative.domain.docente.model.DocenteDTO;

public interface DocenteRepository {
	List<DocenteDTO> getDocente();
}
