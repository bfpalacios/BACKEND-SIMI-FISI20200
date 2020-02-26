package pe.edu.ceid.simi.operative.application.docente;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import pe.edu.ceid.simi.operative.domain.docente.model.DocenteDTO;
import pe.edu.ceid.simi.operative.domain.docente.repository.DocenteRepository;

@Service
public class DocenteServiceImpl implements DocenteService {

	@Autowired
	private DocenteRepository repository;

	@Override
	public List<DocenteDTO> getDocente() {
		// TODO Auto-generated method stub
		return this.repository.getDocente();
	}
}
