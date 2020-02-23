package pe.edu.ceid.simi.operative.application.autenticacion;

import pe.edu.ceid.simi.operative.domain.autorizacion.model.Autorizacion;

public interface AutenticacionService {

	Autorizacion accederSistema(String email, int codigo, int tipo);
}
