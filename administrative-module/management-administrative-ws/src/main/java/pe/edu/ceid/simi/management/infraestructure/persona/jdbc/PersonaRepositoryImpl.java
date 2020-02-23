package pe.edu.ceid.simi.management.infraestructure.persona.jdbc;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import pe.edu.ceid.simi.management.domain.persona.model.Persona;
import pe.edu.ceid.simi.management.domain.persona.repository.PersonaRepository;

@Component
public class PersonaRepositoryImpl implements PersonaRepository{

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	private PersonaRowMapper row;

	@Override
	public Persona crearPersona(Persona persona) {
		String insertQuery = "INSERT INTO tmpersona (NOMBRE, APELLIDO_PAT, APELLIDO_MAT, DNI, GENERO, EDAD, "
				+ "FECHA_ALTA, FECHA_MOD) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
		int success = this.jdbcTemplate.update(insertQuery, persona.getNombre(), persona.getApellidoPat(),
				persona.getApellidoMat(), persona.getDni(), persona.getGenero(), persona.getEdad(),
				persona.getFechaAlta(), persona.getFechaMod());
		
		if (success >= 0) {
			return persona;
		}
		
		return null;
	}

	@Override
	public Persona editPersona(Persona persona, int id) {
		String query = "UPDATE tmpersona SET NOMBRE = ?, APELLIDO_PAT = ?, APELLIDO_MAT = ? , DNI = ?, "
				+ "GENERO = ?, EDAD = ?, FECHA_ALTA = ?, FECHA_MOD = ? WHERE ID_PERSONA = " + id;
		int update = this.jdbcTemplate.update(query, persona.getNombre(), persona.getApellidoPat(),
				persona.getApellidoMat(), persona.getDni(), persona.getGenero(), persona.getEdad(),
				persona.getFechaAlta(), persona.getFechaMod());
		
		if (update == 1) {
			return persona;
		}
		
		return null;
	}

	@Override
	public List<Persona> getPersonas() {
		String query = "SELECT * FROM tmpersona";
		List<Map<String, Object>> rows = this.jdbcTemplate.queryForList(query);
		List<Persona> persona = row.mapRowPersona(rows);
		return persona;
	}

	@Override
	public boolean deletePersona(int idPersona) {
		String query = "DELETE FROM tmpersona WHERE ID_PERSONA = ?";
		int success = this.jdbcTemplate.update(query, idPersona);
		
		if (success >= 0) {
			return true;
		}
		
		return false;
	}

	@Override
	public Persona getPersonaById(int id) {
		String query ="SELECT * FROM tmpersona WHERE ID_PERSONA = " + id;
		List<Persona> persona = this.row.mapRowPersona(this.jdbcTemplate.queryForList(query));
		
		if (persona.size() > 0) {
			return persona.get(0);
		}
	
		return null;
	}

}
