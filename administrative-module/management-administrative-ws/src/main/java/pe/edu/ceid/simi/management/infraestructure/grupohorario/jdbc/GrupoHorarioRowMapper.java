package pe.edu.ceid.simi.management.infraestructure.grupohorario.jdbc;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.swing.tree.RowMapper;
import javax.swing.tree.TreePath;

import org.springframework.stereotype.Component;

import pe.edu.ceid.simi.management.domain.grupohorario.model.GrupoHorarioDTO;


@Component
public class GrupoHorarioRowMapper implements RowMapper {
	
	@Override
	public int[] getRowsForPaths(TreePath[] arg0) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public List<GrupoHorarioDTO> mapRowGrupoHorario(List<Map<String, Object>> rows){
		List<GrupoHorarioDTO> grupoHorario = new ArrayList<GrupoHorarioDTO>();
		for(Map<String, Object> row: rows) {
			int idGrupoHorario = Integer.parseInt(row.get("ID_GRUPOHORARIO").toString());
			String nomGrupoHorario = row.get("NOM_GRUPOHORARIO").toString();
			String listaHorarios = row.get("LISTA_HORARIOS").toString();
			
			GrupoHorarioDTO g = new GrupoHorarioDTO(idGrupoHorario, nomGrupoHorario, listaHorarios);
			
			grupoHorario.add(g);
		}
		return grupoHorario;
	}
	
}
