package pe.edu.ceid.simi.operative.application.hora;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.ceid.simi.operative.domain.hora.model.HoraDTO;
import pe.edu.ceid.simi.operative.domain.hora.repository.HoraRepository;

@Service
public class HoraServiceImpl implements HoraService{
	@Autowired
	private HoraRepository repository;

	@Override
	public List<HoraDTO> getHora(int id) {
		// TODO Auto-generated method stub
		return this.repository.getHora(id);
	}
	
	

}
