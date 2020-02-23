package pe.edu.ceid.simi.management.application.usuario;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.ceid.simi.management.domain.usuario.model.Usuario;
import pe.edu.ceid.simi.management.domain.usuario.model.UsuarioDTO;
import pe.edu.ceid.simi.management.domain.usuario.repository.UsuarioRepository;


@Service
public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	private UsuarioRepository repository;
	
	@Override
	public Usuario crearUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		return this.repository.crearUsuario(usuario);
	}

	@Override
	public Usuario editUsuario(Usuario usuario, int id) {
		// TODO Auto-generated method stub
		return this.repository.editUsuario(usuario, id);
	}

	@Override
	public List<UsuarioDTO> getUsuarios() {
		// TODO Auto-generated method stub
		return this.repository.getUsuarios();
	}

	@Override
	public boolean deleteUsuario(int cusuario) {
		// TODO Auto-generated method stub
		return this.repository.deleteUsuario(cusuario);
	}

	@Override
	public UsuarioDTO getUsuarioById(int id) {
		// TODO Auto-generated method stub
		return this.repository.getUsuarioById(id);
	}

	@Override
	public UsuarioDTO getUsuarioMod(UsuarioDTO usuario) {
		// TODO Auto-generated method stubstub
		return this.repository.getUsuarioMod(usuario);
	}

}
