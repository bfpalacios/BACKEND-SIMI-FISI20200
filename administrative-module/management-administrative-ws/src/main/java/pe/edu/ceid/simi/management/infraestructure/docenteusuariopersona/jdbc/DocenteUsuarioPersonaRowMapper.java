package pe.edu.ceid.simi.management.infraestructure.docenteusuariopersona.jdbc;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.swing.tree.RowMapper;
import javax.swing.tree.TreePath;

import org.springframework.stereotype.Component;

import pe.edu.ceid.simi.management.domain.docenteusuariopersona.model.DocenteUsuarioPersona;
import pe.edu.ceid.simi.management.infraestructure.Tratamiento;

@Component
public class DocenteUsuarioPersonaRowMapper implements RowMapper {

	@Override
	public int[] getRowsForPaths(TreePath[] arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<DocenteUsuarioPersona> mapRowDocenteUsuarioPersona(List<Map<String, Object>> rows){
		List<DocenteUsuarioPersona> docentes = new ArrayList<DocenteUsuarioPersona>();
		for(Map<String, Object> row: rows) {
			int idPersona = Integer.parseInt(row.get("ID_PERSONA").toString());
			String nombre =row.get("NOMBRE").toString();
			String apellidoPat =row.get("APELLIDO_PAT").toString();
			String apellidoMat =row.get("APELLIDO_MAT").toString();
			String dni = row.get("DNI").toString();
			int genero = Integer.parseInt(row.get("GENERO").toString());
			int edad = Integer.parseInt(row.get("EDAD").toString());
			Date fechaAltaP = Tratamiento.tratarDate("FECHA_ALTA_PER", row);
			Date fechaModP = Tratamiento.tratarDate("FECHA_MOD_PER", row);
			String university = Tratamiento.tratarString("university", row);
			String fechaNacimiento = Tratamiento.tratarString("FECHA_NACIMIENTO", row);
			String lugarNacDist = Tratamiento.tratarString("LUGAR_NAC_DIST", row);
			String lugarNacProv = Tratamiento.tratarString("LUGAR_NAC_PROV", row);
			String lugarNacDep = Tratamiento.tratarString("LUGAR_NAC_DEP", row);
			String nacionalidad = Tratamiento.tratarString("NACIONALIDAD", row);
			String address = Tratamiento.tratarString("ADDRESS", row);
			String phone = Tratamiento.tratarString("PHONE", row);
			
			int idUsuario = Integer.parseInt(row.get("ID_USUARIO").toString());
			String email =row.get("EMAIL").toString();
			String contrasenia =row.get("PASSWORD").toString();
			int idRol = Integer.parseInt(row.get("FK_ID_ROL").toString());
			String nomRol =row.get("NOM_ROL").toString();
			int estado = Integer.parseInt(row.get("ESTADO").toString());
			Date fechaAltaU = Tratamiento.tratarDate("FEHCA_ALTA_USU", row);
			Date fechaBajaU = Tratamiento.tratarDate("FEHCA_BAJA_USU", row);
			Date fechaModU = Tratamiento.tratarDate("FECHA_MOD_USU", row);
			int idUsuarioMod = Tratamiento.tratarEntero("FK_ID_USUARIO_MOD", row);
			
			String codDocente = row.get("COD_DOCENTE_CI").toString();
			String departamento =row.get("DEPARTAMENTO").toString();

			DocenteUsuarioPersona d = new DocenteUsuarioPersona(idPersona, nombre, apellidoPat, apellidoMat, dni,
					genero, edad, fechaAltaP, fechaModP, university, fechaNacimiento, lugarNacDist, lugarNacProv,
					lugarNacDep, nacionalidad, address, phone, idUsuario, email, contrasenia, idRol, nomRol, estado,
					fechaAltaU, fechaBajaU, fechaModU, idUsuarioMod, codDocente, departamento);
			
			docentes.add(d);
		}
		return docentes;
	}

}


