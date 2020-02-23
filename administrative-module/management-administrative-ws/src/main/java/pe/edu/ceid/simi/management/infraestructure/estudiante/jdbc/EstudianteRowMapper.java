package pe.edu.ceid.simi.management.infraestructure.estudiante.jdbc;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.swing.tree.RowMapper;
import javax.swing.tree.TreePath;

import org.springframework.stereotype.Component;

import pe.edu.ceid.simi.management.domain.estudiante.model.EstudianteDTO;

@Component
public class EstudianteRowMapper implements RowMapper {

	@Override
	public int[] getRowsForPaths(TreePath[] path) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<EstudianteDTO> mapRowEstudiante(List<Map<String, Object>> rows){
		List<EstudianteDTO> estudiantes = new ArrayList<EstudianteDTO>();
		
		for(Map<String, Object> row: rows) {
			int idEstudiante = Integer.parseInt(row.get("COD_ESTUDIANTE_CI").toString());
			int idUsuario = Integer.parseInt(row.get("FK_ID_USUARIO").toString());
			String nombre =row.get("NOMBRE").toString();
			String apellidoPat =row.get("APELLIDO_PAT").toString();
			String apellidoMat =row.get("APELLIDO_MAT").toString();
			int idTipoEstudiante = Integer.parseInt(row.get("FK_ID_TIPO_ESTUDIANTE").toString());
			String nomTipoEstudiante = row.get("NOM_TIPO_ESTUDIANTE").toString();
			int codEstudianteAsm = Integer.parseInt(row.get("COD_ESTUDIANTE_ASM").toString());
			EstudianteDTO e = new EstudianteDTO(idEstudiante, idUsuario, nombre, apellidoPat, apellidoMat,
					idTipoEstudiante, nomTipoEstudiante, codEstudianteAsm);
			estudiantes.add(e);
		}
		
		return estudiantes;
	}
}
