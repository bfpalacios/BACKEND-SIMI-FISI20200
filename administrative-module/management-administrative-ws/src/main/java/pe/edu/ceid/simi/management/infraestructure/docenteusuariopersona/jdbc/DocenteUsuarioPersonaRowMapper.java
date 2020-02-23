package pe.edu.ceid.simi.management.infraestructure.docenteusuariopersona.jdbc;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.swing.tree.RowMapper;
import javax.swing.tree.TreePath;

import org.springframework.stereotype.Component;

import pe.edu.ceid.simi.management.domain.docenteusuariopersona.model.DocenteUsuarioPersona;

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

//			String university = "";
//			String fechaNacimiento = ""; 
//			String lugarNacDist = "";
//			String lugarNacProv = "";
//			String lugarNacDep = "";
//			String nacionalidad = "";
//			String address = "";
//			String phone = "";
			
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
			String codDocente = row.get("COD_DOCENTE_CI").toString();
			String departamento =row.get("DEPARTAMENTO").toString();

			String university = tratarString("university", row);
			String fechaNacimiento = tratarString("FECHA_NACIMIENTO", row);
			String lugarNacDist = tratarString("LUGAR_NAC_DIST", row);
			String lugarNacProv = tratarString("LUGAR_NAC_PROV", row);
			String lugarNacDep = tratarString("LUGAR_NAC_DEP", row);
			String nacionalidad = tratarString("NACIONALIDAD", row);
			String address = tratarString("ADDRESS", row);
			String phone = tratarString("PHONE", row);
			
//			try {
//				university = row.get("university").toString();
//				fechaNacimiento = row.get("FECHA_NACIMIENTO").toString(); 
//				lugarNacDist = row.get("LUGAR_NAC_DIST").toString();
//				lugarNacProv = row.get("LUGAR_NAC_PROV").toString();
//				lugarNacDep = row.get("LUGAR_NAC_DEP").toString();
//				nacionalidad = row.get("NACIONALIDAD").toString();
//				address = row.get("ADDRESS").toString();
//				phone = row.get("PHONE").toString();
//			}
//			catch (Exception e) {}
			
			DocenteUsuarioPersona d = new DocenteUsuarioPersona(idPersona, nombre, apellidoPat, apellidoMat, dni,
					genero, edad, idUsuario, email, contrasenia, idRol, nomRol, estado, codDocente, departamento,
					university, fechaNacimiento, lugarNacDist, lugarNacProv, lugarNacDep, nacionalidad, address, phone);
			
			docentes.add(d);
		}
		return docentes;
	}

	public int tratarEntero(String columna, Map<String, Object> row) {
		int ret = -1;
		
		try {
			ret = Integer.parseInt(row.get(columna).toString());
		} catch (Exception e) {}
		
		return ret;
	}

	public String tratarString(String columna, Map<String, Object> row) {
		String ret = "";
		
		try {
			ret = row.get(columna).toString();
		} catch (Exception e) {}
		
		return ret;
	}

//	public int mapRowCodDocente(List<Map<String, Object>> rows){
//		int  codigoDocente = -1;
//		
//		System.out.println("212113316446546468787798879546: ");
//		
//		for(Map<String, Object> row: rows) {
//			codigoDocente = Integer.parseInt(row.get("COD_DOCENTE").toString());
//		}
//		
//		return codigoDocente;
//	}
	
}


