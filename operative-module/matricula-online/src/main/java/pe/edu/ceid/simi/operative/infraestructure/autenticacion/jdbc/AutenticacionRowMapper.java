package pe.edu.ceid.simi.operative.infraestructure.autenticacion.jdbc;

import java.util.Map;

import org.springframework.stereotype.Component;

import pe.edu.ceid.simi.operative.domain.autorizacion.model.Autorizacion;

@Component
public class AutenticacionRowMapper {

	public Autorizacion mapRow(Map<String, Object> row){
		return Autorizacion.builder()
                .codigo(row.get("CCODIGO").toString())
                .tipo(Integer.parseInt(row.get("CTIPOUSUARIO").toString())).build();
	}
}
