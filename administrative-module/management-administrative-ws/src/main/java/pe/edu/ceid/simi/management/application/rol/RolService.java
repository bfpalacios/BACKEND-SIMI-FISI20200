package pe.edu.ceid.simi.management.application.rol;

import java.util.List;

import pe.edu.ceid.simi.management.domain.rol.model.Rol;

public interface RolService {
	Rol crearRol(Rol rol);
	Rol editRol(Rol rol, int id);
	boolean deleteRol(int id);
	List<Rol> getRoles();
	Rol getRolById(int id);
}
