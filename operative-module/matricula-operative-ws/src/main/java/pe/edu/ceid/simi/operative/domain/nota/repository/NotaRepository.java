package pe.edu.ceid.simi.operative.domain.nota.repository;

import java.util.List;
import pe.edu.ceid.simi.operative.domain.nota.model.NotaDTO;
import pe.edu.ceid.simi.operative.domain.detalleNota.model.DetalleNota;

public interface NotaRepository {
	List<NotaDTO> getNotabyID(int id);
	
	List<DetalleNota> getDetallebyID(int id);
	boolean crearDetalle(List<DetalleNota> detalle);
	DetalleNota editDetalle(DetalleNota detalle, int id);
	boolean editPromedio(int id);
	boolean deleteDetalle(int id);
}
