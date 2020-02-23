package pe.edu.ceid.simi.operative.infraestructure.hora.jdbc;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.swing.tree.RowMapper;
import javax.swing.tree.TreePath;

import org.springframework.stereotype.Component;
import org.springframework.util.LinkedCaseInsensitiveMap;

import pe.edu.ceid.simi.operative.domain.hora.model.HoraDTO;

@Component
public class HoraRowMapper implements RowMapper{
	public int[] getRowsForPaths(TreePath[] arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<HoraDTO> mapRowHora(List<Map<String, Object>> rows) {
		List<HoraDTO> horas = new ArrayList<HoraDTO>();
		for (Map<String, Object> row : rows) {
			int idGrupo = Integer.parseInt(row.get("ID_HORARIO_GRUPOHORARIO").toString());
			String nomHora = row.get("HORA").toString();

			HoraDTO i = new HoraDTO(idGrupo, nomHora);
			horas.add(i);
		}
		return horas;
	}
}
