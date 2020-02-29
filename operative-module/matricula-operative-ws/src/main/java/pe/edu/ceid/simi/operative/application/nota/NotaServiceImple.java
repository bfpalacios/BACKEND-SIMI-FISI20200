package pe.edu.ceid.simi.operative.application.nota;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.ceid.simi.operative.domain.detalleNota.model.DetalleNota;
import pe.edu.ceid.simi.operative.domain.nota.model.NotaDTO;
import pe.edu.ceid.simi.operative.domain.nota.repository.NotaRepository;;

@Service
public class NotaServiceImple implements NotaService{
	
	@Autowired
	private NotaRepository repository;

	@Override
	public List<NotaDTO> getNotabyID(int id) {
		// TODO Auto-generated method stub
		return this.repository.getNotabyID(id);
	}

	@Override
	public boolean crearDetalle(List<DetalleNota> detalle) {
		// TODO Auto-generated method stub
		return this.repository.crearDetalle(detalle);
	}

	@Override
	public DetalleNota editDetalle(DetalleNota detalle, int id) {
		// TODO Auto-generated method stub
		return this.repository.editDetalle(detalle, id);
	}

	@Override
	public boolean deleteDetalle(int id) {
		// TODO Auto-generated method stub
		return this.repository.deleteDetalle(id);
	}

	@Override
	public List<DetalleNota> getDetallebyID(int id) {
		// TODO Auto-generated method stub
		return this.repository.getDetallebyID(id);
	}

	@Override
	public boolean editPromedio(int id) {
		// TODO Auto-generated method stub
		return this.repository.editPromedio(id);
	}

}
