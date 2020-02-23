package pe.edu.ceid.simi.management.application.horasclase;

import java.util.List;

import pe.edu.ceid.simi.management.domain.horasclase.model.HorasClase;


public interface HorasClaseService {

	HorasClase crearHorasClase(HorasClase horasClase);
	HorasClase editHorasClase(HorasClase horasClase, int id);
	boolean deleteHorasClase(int chora);
	List<HorasClase> getHorasClase();
	HorasClase getHorasClaseById(int id);
}
