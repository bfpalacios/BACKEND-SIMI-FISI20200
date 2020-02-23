package pe.edu.ceid.simi.operative.application.autenticacion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.ceid.simi.operative.domain.autorizacion.model.Autorizacion;
import pe.edu.ceid.simi.operative.domain.autorizacion.repository.AutorizacionRepository;

@Service
public class AutenticacionServiceImpl implements AutenticacionService {

	@Autowired
	private AutorizacionRepository repository;

	public Autorizacion validarParametrosAutorizacion(String email, int codigo, int tipo) {
		return this.repository.validarParametrosAutorizacion(email, codigo, tipo);
	}

	@Override
	public Autorizacion accederSistema(String email, int codigo, int tipo) {
		return this.validarParametrosAutorizacion(email, codigo, tipo);
	}

}
