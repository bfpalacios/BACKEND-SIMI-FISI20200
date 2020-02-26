package pe.edu.ceid.simi.management.infraestructure.alumnosm.jdbc;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.swing.tree.RowMapper;
import javax.swing.tree.TreePath;

import org.springframework.stereotype.Component;

import pe.edu.ceid.simi.management.domain.alumnosm.model.AlumnoSM;

@Component
public class AlumnoSMRowMapper implements RowMapper {

	@Override
	public int[] getRowsForPaths(TreePath[] arg0) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public List<AlumnoSM> mapRowAlumnoSM(List<Map<String, Object>> rows){
		List<AlumnoSM> alumnos = new ArrayList<AlumnoSM>();
		
		for(Map<String, Object> row: rows) {
			String codAsm = row.get("CODIGO_ASM").toString();
			String dniAsm = row.get("DNI_ASM").toString();
			String nombreAsm = row.get("NOMBRE_ASM").toString();
			String apellidoPatAsm = row.get("APELLIDOPAT_ASM").toString();
			String apellidoMatAsm = row.get("APELLIDOMAT_ASM").toString();
			String emailAsm = row.get("EMAIL_ASM").toString();
			String facultadAsm = row.get("FACULTAD_ASM").toString();
			int generoAsm = Integer.parseInt(row.get("GENERO_ASM").toString());
			int idEstadoAsm = Integer.parseInt(row.get("FK_ID_ESTADO_ASM").toString());
			String nomEstadoAsm = row.get("ID_ESTADO_ASM").toString();
			
			AlumnoSM a = new AlumnoSM(codAsm, dniAsm, nombreAsm, apellidoPatAsm, apellidoMatAsm, emailAsm, facultadAsm,
					generoAsm, idEstadoAsm, nomEstadoAsm);
			alumnos.add(a);
		}
		
		return alumnos;
	}
}
