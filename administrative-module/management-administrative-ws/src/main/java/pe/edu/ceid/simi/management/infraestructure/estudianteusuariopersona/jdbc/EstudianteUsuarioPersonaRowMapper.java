package pe.edu.ceid.simi.management.infraestructure.estudianteusuariopersona.jdbc;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.swing.tree.RowMapper;
import javax.swing.tree.TreePath;

import org.springframework.stereotype.Component;

import pe.edu.ceid.simi.management.domain.estudianteusuariopersona.model.EstudianteUsuarioPersona;

@Component
public class EstudianteUsuarioPersonaRowMapper implements RowMapper {

	@Override
	public int[] getRowsForPaths(TreePath[] arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<EstudianteUsuarioPersona> mapRowEstudianteUsuarioPersona(List<Map<String, Object>> rows){
		List<EstudianteUsuarioPersona> estudiantes = new ArrayList<EstudianteUsuarioPersona>();
		
		for(Map<String, Object> row: rows) {

			String university = "";
			String fechaNacimiento = ""; 
			String lugarNacDist = "";
			String lugarNacProv = "";
			String lugarNacDep = "";
			String nacionalidad = "";
			String address = "";
			String phone = "";
			
			int idPersona = Integer.parseInt(row.get("ID_PERSONA").toString());
			String nombre =row.get("NOMBRE").toString();
			String apellidoPat =row.get("APELLIDO_PAT").toString();
			String apellidoMat =row.get("APELLIDO_MAT").toString();
			String dni = row.get("DNI").toString();
			int genero = Integer.parseInt(row.get("GENERO").toString());
			int edad = Integer.parseInt(row.get("EDAD").toString());
			//Date fechaAltaP = (Date) row.get("FECHA_ALTA_PE");
			int idUsuario = Integer.parseInt(row.get("ID_USUARIO").toString());
			String email =row.get("EMAIL").toString();
			String contrasenia =row.get("PASSWORD").toString();
			int idRol = Integer.parseInt(row.get("FK_ID_ROL").toString());
			String nomRol =row.get("NOM_ROL").toString();
			int estado = Integer.parseInt(row.get("ESTADO").toString());
			//Date fechaAltaU = (Date) row.get("FECHA_ALTA_US");
			//Date fechaBajaU = (Date) row.get("FECHA_BAJA");
			String codEstudiante = row.get("COD_ESTUDIANTE_CI").toString();
			int idTipoEstudiante = Integer.parseInt(row.get("FK_ID_TIPO_ESTUDIANTE").toString());

			try {
				university = row.get("university").toString();
				fechaNacimiento = row.get("FECHA_NACIMIENTO").toString(); 
				lugarNacDist = row.get("LUGAR_NAC_DIST").toString();
				lugarNacProv = row.get("LUGAR_NAC_PROV").toString();
				lugarNacDep = row.get("LUGAR_NAC_DEP").toString();
				nacionalidad = row.get("NACIONALIDAD").toString();
				address = row.get("ADDRESS").toString();
				phone = row.get("PHONE").toString();
			}
			catch (Exception e) {}
			
			EstudianteUsuarioPersona e = new EstudianteUsuarioPersona(idPersona, nombre, apellidoPat, apellidoMat, dni,
					genero, edad, university, fechaNacimiento, lugarNacDist,
					lugarNacProv, lugarNacDep, nacionalidad, address, phone, idUsuario,
					email, contrasenia, idRol, nomRol, estado, codEstudiante, idTipoEstudiante);
			
			estudiantes.add(e);
		}
		
		return estudiantes;
	}

}
