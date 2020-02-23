package pe.edu.ceid.simi.operative.domain.apertura.repository;

import java.util.List;

import pe.edu.ceid.simi.operative.domain.apertura.model.Apertura;
import pe.edu.ceid.simi.operative.domain.apertura.model.AperturaDTO;

public interface AperturaRepository {
	List<AperturaDTO> getApertura();
	public Apertura crearApertura(Apertura apertura);
}
