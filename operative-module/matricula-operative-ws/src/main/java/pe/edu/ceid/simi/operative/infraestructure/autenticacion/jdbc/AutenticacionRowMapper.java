package pe.edu.ceid.simi.operative.infraestructure.autenticacion.jdbc;

import java.util.Map;

import org.springframework.stereotype.Component;

import pe.edu.ceid.simi.operative.domain.autorizacion.model.Autorizacion;

@Component
public class AutenticacionRowMapper {

	public Autorizacion mapRow(Map<String, Object> row){
		return Autorizacion.builder()
				.email(row.get("EMAIL").toString())
                .codigo(Integer.parseInt(row.get("ID_USUARIO").toString()))
                .codPersona(Integer.parseInt(row.get("FK_ID_PERSONA").toString()))
                .tipo(Integer.parseInt(row.get("FK_ID_ROL").toString())).build();
	}
}
