package pe.edu.ceid.simi.management.application.rol;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.ceid.simi.management.domain.rol.model.Rol;
import pe.edu.ceid.simi.management.domain.rol.repository.RolRepository;

@Service
public class RolServiceImpl implements RolService {

	@Autowired
	private RolRepository repository;
	
	@Override
	public Rol crearRol(Rol rol) {
		// TODO Auto-generated method stub
		return this.repository.crearRol(rol);
	}

	@Override
	public Rol editRol(Rol rol, int id) {
		// TODO Auto-generated method stub
		return this.repository.editRol(rol, id);
	}

	@Override
	public boolean deleteRol(int id) {
		// TODO Auto-generated method stub
		return this.repository.deleteRol(id);
	}

	@Override
	public List<Rol> getRoles() {
		// TODO Auto-generated method stub
		return this.repository.getRoles();
	}

	@Override
	public Rol getRolById(int id) {
		// TODO Auto-generated method stub
		return this.repository.getRolById(id);
	}

}
