package pe.edu.ceid.simi.management.infraestructure.usuario.jdbc;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.swing.tree.RowMapper;
import javax.swing.tree.TreePath;

import org.springframework.stereotype.Component;

import pe.edu.ceid.simi.management.domain.usuario.model.UsuarioDTO;


@Component
public class UsuarioRowMapper implements RowMapper {

	@Override
	public int[] getRowsForPaths(TreePath[] arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<UsuarioDTO> mapRowUsuario(List<Map<String, Object>> rows){
		List<UsuarioDTO> usuarioss = new ArrayList<UsuarioDTO>();
		for(Map<String, Object> row: rows) {
			int idUsuario = Integer.parseInt(row.get("ID_USUARIO").toString());
			String codUsuario = row.get("COD_USUARIO").toString();
			int idPersona = Integer.parseInt(row.get("FK_ID_PERSONA").toString());
			String nombre =row.get("NOMBRE").toString();
			String apellidoPat =row.get("APELLIDO_MAT").toString();
			String apellidoMat =row.get("APELLIDO_PAT").toString();
			String email = row.get("EMAIL").toString();
			String contrasenia =row.get("CONTRASENIA").toString();
			int idRol = Integer.parseInt(row.get("ID_ROL").toString());
			String nomRol =row.get("NOM_ROL").toString();
			int estado = Integer.parseInt(row.get("ESTADO").toString());
			Date fechaAlta = (Date) row.get("FECHA_ALTA");
			Date fechaBaja = (Date) row.get("FECHA_BAJA");
			Date fechaMod = (Date) row.get("FECHA_MOD");
			int idUsuarioMod = Integer.parseInt(row.get("FK_ID_USUARIO_MOD").toString());
			
			UsuarioDTO u = new UsuarioDTO(idUsuario, codUsuario, idPersona, nombre, apellidoPat, apellidoMat,
					email, contrasenia, idRol, nomRol, estado, fechaAlta, fechaBaja, fechaMod, idUsuarioMod);
			usuarioss.add(u);
		}
		return usuarioss;
	}
}
