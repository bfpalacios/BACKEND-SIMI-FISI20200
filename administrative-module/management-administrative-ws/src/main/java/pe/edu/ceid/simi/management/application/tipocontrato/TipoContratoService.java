package pe.edu.ceid.simi.management.application.tipocontrato;

import java.util.List;

import pe.edu.ceid.simi.management.domain.tipocontrato.model.TipoContrato;

public interface TipoContratoService {
	TipoContrato crearTipoContrato(TipoContrato tipoContrato);
	TipoContrato editTipoContrato(TipoContrato tipoContrato, int id);
	boolean deleteTipoContrato(int ctipoContrato);
	List<TipoContrato> getTiposContrato();
	TipoContrato getTipoContratoById(int id);
}
