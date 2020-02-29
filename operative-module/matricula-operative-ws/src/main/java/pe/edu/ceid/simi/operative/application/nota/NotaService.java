package pe.edu.ceid.simi.operative.application.nota;

import java.util.List;

import pe.edu.ceid.simi.operative.domain.detalleNota.model.DetalleNota;
import pe.edu.ceid.simi.operative.domain.nota.model.NotaDTO;

public interface NotaService {
	List<NotaDTO> getNotabyID(int id);
	
	List<DetalleNota> getDetallebyID(int id);
	boolean crearDetalle(List<DetalleNota> detalle);
	DetalleNota editDetalle(DetalleNota detalle, int id);
	boolean editPromedio(int id);
	boolean deleteDetalle(int id);
}
