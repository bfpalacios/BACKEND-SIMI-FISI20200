package pe.edu.ceid.simi.management.infraestructure.docente.jdbc;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.swing.tree.RowMapper;
import javax.swing.tree.TreePath;

import org.springframework.stereotype.Component;

import pe.edu.ceid.simi.management.domain.docente.model.DocenteDTO;

@Component
public class DocenteRowMapper implements RowMapper {

	@Override
	public int[] getRowsForPaths(TreePath[] arg0) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public List<DocenteDTO> mapRowDocente(List<Map<String, Object>> rows){
		List<DocenteDTO> docentes = new ArrayList<DocenteDTO>();
		for(Map<String, Object> row: rows) {
			int codDocente = Integer.parseInt(row.get("COD_DOCENTE_CI").toString());
			int idUsuario = Integer.parseInt(row.get("FK_ID_USUARIO").toString());
			String nombre =row.get("NOMBRE").toString();
			String apellidoPat =row.get("APELLIDO_PAT").toString();
			String apellidoMat =row.get("APELLIDO_MAT").toString();
			int departamento = Integer.parseInt(row.get("DEPARTAMENTO").toString());
			DocenteDTO d = new DocenteDTO(codDocente, idUsuario, nombre, apellidoPat, apellidoMat, departamento);
			
			docentes.add(d);
		}
		return docentes;
	}
}
