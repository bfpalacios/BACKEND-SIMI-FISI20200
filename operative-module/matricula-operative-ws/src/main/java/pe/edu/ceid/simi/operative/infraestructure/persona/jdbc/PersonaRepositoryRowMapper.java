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
	
	@SuppressWarnings("rawtypes")
	public PersonaUsuario mapRowInfoAcademica(LinkedCaseInsensitiveMap row) {
		int codUser = Integer.parseInt(row.get("ID_USUARIO").toString());
		String email = row.get("EMAIL").toString();
		String nombre =row.get("NOMBRE").toString();
		String apPaterno = row.get("APELLIDO_PAT").toString();
		String apMaterno =row.get("APELLIDO_MAT").toString();
		String dni = row.get("DNI").toString();
		String birthday = row.get("FECHA_NACIMIENTO") != null ? row.get("FECHA_NACIMIENTO").toString() : "Sin datos";
		String lugarNacDist = row.get("LUGAR_NAC_DIST") != null ? row.get("LUGAR_NAC_DIST").toString() : "Sin datos";
		String lugarNacProv = row.get("LUGAR_NAC_PROV") != null ? row.get("LUGAR_NAC_PROV").toString() : "Sin datos";
		String lugarNacDep = row.get("LUGAR_NAC_DEP") != null ? row.get("LUGAR_NAC_DEP").toString() : "Sin datos";
		String nacionalidad = row.get("NACIONALIDAD") != null ? row.get("NACIONALIDAD").toString() : "Sin datos";
		String edad = row.get("EDAD").toString();
		String genero = row.get("GENERO").toString().equals("1") ? "Masculino" : "Femenino";
		String address = row.get("ADDRESS") != null ? row.get("ADDRESS").toString() : "Sin datos";
		String university = row.get("UNIVERSITY")!= null ? row.get("UNIVERSITY").toString() : "Sin datos";
		String phone = row.get("PHONE")!= null ? row.get("PHONE").toString() : "Sin datos";
		return PersonaUsuario.builder()
				.codUser(codUser)
				.email(email)
				.nombre(nombre)
				.apPaterno(apPaterno)
				.apMaterno(apMaterno)
				.dni(dni)
				.university(university)
				.phone(phone)
				.genero(genero)
				.edad(Integer.parseInt(edad))
				.birthday(birthday)
				.lugarNacDep(lugarNacDep)
				.lugarNacDist(lugarNacDist)
				.lugarNacProv(lugarNacProv)
				.nacionalidad(nacionalidad)
				.address(address)
				.build();
	}
}
