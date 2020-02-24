package pe.edu.ceid.simi.management.infraestructure.horario.jdbc;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Component;

import pe.edu.ceid.simi.management.domain.horario.model.HorarioDTO;
import pe.edu.ceid.simi.management.infraestructure.Tratamiento;

import javax.swing.tree.RowMapper;
import javax.swing.tree.TreePath;


@Component
public class HorarioRowMapper implements RowMapper {

	@Override
	public int[] getRowsForPaths(TreePath[] arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<HorarioDTO> mapRowHorario(List<Map<String, Object>> rows){
		List<HorarioDTO> horarioss = new ArrayList<HorarioDTO>();
		
		for(Map<String, Object> row: rows) {
			int idGrupoHorario = Integer.parseInt(row.get("FK_ID_GRUPOHORARIO").toString());
			int idDia = Tratamiento.tratarEntero("FK_ID_DIA", row);
			String nomDia = Tratamiento.tratarString("NOM_DIA", row);
			int idHora = Integer.parseInt(row.get("FK_ID_HORA").toString());
			String horaInicio = row.get("HORA_INICIO").toString();
			String horaSalida = row.get("HORA_SALIDA").toString();
						
			HorarioDTO h = new HorarioDTO(idGrupoHorario, idDia, nomDia, idHora, horaInicio, horaSalida);
			horarioss.add(h);
		}
		
		return horarioss;
	}
	
}
