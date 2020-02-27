package pe.edu.ceid.simi.management.domain.sede.repository;

import java.util.List;

import pe.edu.ceid.simi.management.domain.sede.model.Sede;


public interface SedeRepository {
	String crearSede(Sede sede);
	String editSede(Sede sede, int id);
	List<Sede> getSedes();
	String deleteSede(int csede);
	Sede getSedeById(int id);
}
