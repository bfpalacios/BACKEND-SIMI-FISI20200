package pe.edu.ceid.simi.management.domain.usuario.repository;

import java.util.List;

import pe.edu.ceid.simi.management.domain.usuario.model.Usuario;
import pe.edu.ceid.simi.management.domain.usuario.model.UsuarioDTO;

public interface UsuarioRepository {
	Usuario crearUsuario(Usuario usuario);
	Usuario editUsuario(Usuario usuario, int id);
	List<UsuarioDTO> getUsuarios();
	boolean deleteUsuario(int cusuario);
	UsuarioDTO getUsuarioById(int id);
	UsuarioDTO getUsuarioMod(UsuarioDTO usuario);
}
