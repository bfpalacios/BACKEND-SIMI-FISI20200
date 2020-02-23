package pe.edu.ceid.simi.operative.domain.programacion.repository;

import java.util.List;

import pe.edu.ceid.simi.operative.domain.programacion.model.Programacion;
import pe.edu.ceid.simi.operative.domain.programacion.model.ProgramacionDTO;

public interface ProgramacionRepository {
	List<ProgramacionDTO> getProgramacion();
}
