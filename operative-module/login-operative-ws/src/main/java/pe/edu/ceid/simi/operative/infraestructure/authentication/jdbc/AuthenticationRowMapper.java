package pe.edu.ceid.simi.operative.infraestructure.authentication.jdbc;

import java.util.Map;

import org.springframework.stereotype.Component;

import pe.edu.ceid.simi.operative.domain.authentication.model.Authentication;


@Component
public class AuthenticationRowMapper {
	
	public Authentication mapRowFindEmail(Map<String, Object> row){
		return Authentication.builder()
				.id(row.get("ID_USUARIO").toString())
				.rolId(row.get("FK_ID_ROL").toString())
                .email(row.get("EMAIL").toString()).build();
	}
	
	public Authentication mapRowAuthentication(Map<String, Object> row){
		return Authentication.builder()
				.id(row.get("ID_USUARIO").toString())
				.email(row.get("EMAIL").toString())
                .password(row.get("PASSWORD").toString()).build();
	}

}
