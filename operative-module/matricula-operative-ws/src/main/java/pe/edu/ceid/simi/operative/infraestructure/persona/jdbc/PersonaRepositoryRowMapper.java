package pe.edu.ceid.simi.operative.infraestructure.persona.jdbc;

import org.springframework.stereotype.Component;
import org.springframework.util.LinkedCaseInsensitiveMap;

import pe.edu.ceid.simi.operative.domain.persona.model.PersonaUsuario;

@Component
public class PersonaRepositoryRowMapper {

	
	@SuppressWarnings("rawtypes")
	public PersonaUsuario mapRowDatosUsuario(LinkedCaseInsensitiveMap row) {
		int codUser = Integer.parseInt(row.get("ID_USUARIO").toString());
		String email = row.get("EMAIL").toString();
		String nombre =row.get("NOMBRE").toString();
		String apPaterno = row.get("APELLIDO_PAT").toString();
		String apMaterno =row.get("APELLIDO_MAT").toString();
		String dni = row.get("DNI").toString();
		String university = row.get("UNIVERSITY")!= null ? row.get("UNIVERSITY").toString() : "Sin datos";
		String phone = row.get("PHONE")!= null ? row.get("PHONE").toString() : "Sin datos";
				//.toString();
		return PersonaUsuario.builder()
				.codUser(codUser)
				.email(email)
				.nombre(nombre)
				.apPaterno(apPaterno)
				.apMaterno(apMaterno)
				.dni(dni)
				.university(university)
				.phone(phone)
				.build();
	}
}
