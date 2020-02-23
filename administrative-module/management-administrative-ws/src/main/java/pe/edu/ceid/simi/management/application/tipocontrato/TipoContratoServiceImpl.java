package pe.edu.ceid.simi.management.application.tipocontrato;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.ceid.simi.management.domain.tipocontrato.model.TipoContrato;
import pe.edu.ceid.simi.management.domain.tipocontrato.repository.TipoContratoRepository;

@Service
public class TipoContratoServiceImpl implements TipoContratoService {

	@Autowired
	private TipoContratoRepository repository;

	@Override
	public TipoContrato crearTipoContrato(TipoContrato tipoContrato) {
		// TODO Auto-generated method stub
		return this.repository.crearTipoContrato(tipoContrato);
	}

	@Override
	public TipoContrato editTipoContrato(TipoContrato tipoContrato, int id) {
		// TODO Auto-generated method stub
		return this.repository.editTipoContrato(tipoContrato, id);
	}

	@Override
	public boolean deleteTipoContrato(int ctipoContrato) {
		// TODO Auto-generated method stub
		return this.repository.deleteTipoContrato(ctipoContrato);
	}

	@Override
	public List<TipoContrato> getTiposContrato() {
		// TODO Auto-generated method stub
		return this.repository.getTiposContrato();
	}

	@Override
	public TipoContrato getTipoContratoById(int id) {
		// TODO Auto-generated method stub
		return this.repository.getTipoContratoById(id);
	}

}
