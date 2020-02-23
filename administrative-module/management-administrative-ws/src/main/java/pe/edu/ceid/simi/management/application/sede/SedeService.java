package pe.edu.ceid.simi.management.application.sede;

import java.util.List;

import pe.edu.ceid.simi.management.domain.sede.model.Sede;


public interface SedeService {
	Sede crearSede(Sede sede);
	Sede editSede(Sede sede, int id);
	List<Sede> getSedes();
	boolean deleteSede(int csede);
	Sede getSedeById(int id);
}
