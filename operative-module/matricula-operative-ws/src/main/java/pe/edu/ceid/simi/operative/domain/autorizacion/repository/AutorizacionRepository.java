package pe.edu.ceid.simi.operative.domain.autorizacion.repository;

import pe.edu.ceid.simi.operative.domain.autorizacion.model.Autorizacion;

public interface AutorizacionRepository {
	Autorizacion validarParametrosAutorizacion(String codigo, String tipo);
}