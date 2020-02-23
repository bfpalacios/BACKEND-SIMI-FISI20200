package pe.edu.ceid.simi.management.infraestructure.usuario.jdbc;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import pe.edu.ceid.simi.management.domain.usuario.model.Usuario;
import pe.edu.ceid.simi.management.domain.usuario.model.UsuarioDTO;
import pe.edu.ceid.simi.management.domain.usuario.repository.UsuarioRepository;

@Component
public class UsuarioRepositoryImpl implements UsuarioRepository{

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	private UsuarioRowMapper row;

	@Override
	public Usuario crearUsuario(Usuario usuario) {
		String query = "INSERT INTO tmusuario (COD_USUARIO, FK_ID_PERSONA, EMAIL, CONTRASENIA, FK_ID_ROL, "
				+ "ESTADO, FECHA_ALTA, FECHA_BAJA, FECHA_MOD, FK_ID_USUARIO_MOD) "
				+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		int success = this.jdbcTemplate.update(query, usuario.getCodUsuario(), usuario.getIdPersona(),
				usuario.getEmail(), usuario.getContrasenia(), usuario.getIdRol(), usuario.getEstado(),
				usuario.getFechaAlta(), usuario.getFechaBaja(), usuario.getFechaMod(), usuario.getIdUsuarioMod());
		
		if (success >= 0) {
			return usuario;
		}
		
		return null;
	}

	@Override
	public Usuario editUsuario(Usuario usuario, int id) {
		String query = "UPDATE tmusuario SET COD_USUARIO = ?, FK_ID_PERSONA = ?, EMAIL = ?, CONTRASENIA = ?, "
				+ "FK_ID_ROL = ?, ESTADO = ?, FECHA_ALTA = ? , FECHA_BAJA = ? , FECHA_MOD = ? , FK_ID_USUARIO_MOD = ? "
				+ "WHERE ID_USUARIO = "+ id;
		int update = this.jdbcTemplate.update(query, usuario.getCodUsuario(), usuario.getIdPersona(),
				usuario.getEmail(), usuario.getContrasenia(), usuario.getIdRol(), usuario.getEstado(),
				usuario.getFechaAlta(), usuario.getFechaBaja(), usuario.getFechaMod(), usuario.getIdUsuarioMod());
		
		if (update == 1) {
			return usuario;
		}
		
		return null;
	}

	@Override
	public boolean deleteUsuario(int cusuario) {
		String query = "DELETE FROM tmusuario WHERE ID_USUARIO = ?";
		int success = this.jdbcTemplate.update(query, cusuario);
		
		if (success >= 0) {
			return true;
		}
		
		return false;
	}

	@Override
	public List<UsuarioDTO> getUsuarios() {
		String query = "SELECT * FROM tmusuario";
		List<Map<String, Object>> rows = this.jdbcTemplate.queryForList(query);
		List<UsuarioDTO> usuario = row.mapRowUsuario(rows);
		return usuario;
	}

	@Override
	public UsuarioDTO getUsuarioById(int id) {
		String query ="SELECT * FROM tmusuario AS us " + 
				"INNER JOIN tmpersona AS pe ON pe.ID_PERSONA = us.FK_ID_PERSONA " + 
				"INNER JOIN tmrol AS ro ON ro.ID_ROL = us.FK_ID_ROL WHERE ID_USUARIO = " + id;
		List<UsuarioDTO> usuario = this.row.mapRowUsuario(this.jdbcTemplate.queryForList(query));
		
		if (usuario.size() > 0) {
			return usuario.get(0);
		}
		
		return null;
	}

	@Override
	public UsuarioDTO getUsuarioMod(UsuarioDTO usuario) {
		String query ="SELECT * FROM tmusuario AS us " + 
				"INNER JOIN tmpersona AS pe ON pe.ID_PERSONA = us.FK_ID_PERSONA " + 
				"INNER JOIN tmrol AS ro ON ro.ID_ROL = us.FK_ID_ROL " +
				"WHERE ID_USUARIO = " + usuario.getIdUsuarioMod();
		List<UsuarioDTO> us = this.row.mapRowUsuario(this.jdbcTemplate.queryForList(query));
		
		if (us.size() > 0) {
			return us.get(0);
		}
		
		return null;
	}

}
