package pe.edu.ceid.simi.management.domain.horasclase.repository;

import java.util.List;

import pe.edu.ceid.simi.management.domain.horasclase.model.HorasClase;


public interface HorasClaseRepository {

	HorasClase crearHorasClase(HorasClase horasClase);
	HorasClase editHorasClase(HorasClase horasClase, int id);
	boolean deleteHorasClase(int chora);
	List<HorasClase> getHorasClase();
	HorasClase getHorasClaseById(int id);
}
