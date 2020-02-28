package pe.edu.ceid.simi.operative.application.apertura;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.ceid.simi.operative.domain.apertura.model.Apertura;
import pe.edu.ceid.simi.operative.domain.apertura.model.AperturaDTO;
import pe.edu.ceid.simi.operative.domain.apertura.repository.AperturaRepository;

@Service
public class AperturaServiceImpl implements AperturaService{

	@Autowired
	private AperturaRepository repository;
	
	public List<AperturaDTO> getApertura() {
		return this.repository.getApertura();
	}

	public Apertura crearApertura(Apertura apertura) {
		return this.repository.crearApertura(apertura);
	}
	
	public List<AperturaDTO> getAperturabyID(int id){
		return this.repository.getAperturabyID(id);
	}

}
