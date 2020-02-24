package pe.edu.ceid.simi.management.infraestructure.rol;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import pe.edu.ceid.simi.management.domain.rol.model.Rol;
import pe.edu.ceid.simi.management.domain.rol.repository.RolRepository;

@Component
public class RolRepositoryImpl implements RolRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	private RolRowMapper row;

	@Override
	public Rol crearRol(Rol rol) {
		String insertQuery = "INSERT INTO tmrol (NOM_ROL, DESC_ROL) values (?, ?)";
		
		int success = this.jdbcTemplate.update(insertQuery, rol.getNomRol(), rol.getDescRol());
		if (success >= 0) {
			return rol;
		}
		
		return null;
	}

	@Override
	public Rol editRol(Rol rol, int id) {
		String query = "UPDATE tmrol SET NOM_ROL = ?, DESC_ROL = ? WHERE ID_ROL = " + id;
		int update = this.jdbcTemplate.update(query, rol.getNomRol(), rol.getDescRol());
		
		if (update == 1) {
			return rol;
		}
		
		return null;
	}

	@Override
	public boolean deleteRol(int id) {
		String query = "DELETE FROM tmrol WHERE ID_ROL = ?";
		int success = this.jdbcTemplate.update(query, id);
		
		if (success >= 0) {
			return true;
		}
		
		return false;
	}

	@Override
	public List<Rol> getRoles() {
		String query = "SELECT * FROM tmrol";
		List<Map<String, Object>> rows = this.jdbcTemplate.queryForList(query);
		List<Rol> rol = row.mapRowRol(rows);
		return rol;
	}

	@Override
	public Rol getRolById(int id) {
		String query = "SELECT * FROM tmrol WHERE ID_ROL  = " + id;
		List<Rol> rol = this.row.mapRowRol(this.jdbcTemplate.queryForList(query));
		
		if (rol.size() > 0) {
			return rol.get(0);
		}
		
		return null;
	}

}
