package pe.edu.ceid.simi.management.infraestructure.horasclase.jdbc;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Component;

import pe.edu.ceid.simi.management.domain.horasclase.model.HorasClase;

import javax.swing.tree.RowMapper;
import javax.swing.tree.TreePath;


@Component
public class HorasClaseRowMapper implements RowMapper {

	@Override
	public int[] getRowsForPaths(TreePath[] arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<HorasClase> mapRowHorasClase(List<Map<String, Object>> rows){
		List<HorasClase> horass = new ArrayList<HorasClase>();
		for(Map<String, Object> row: rows) {
			int idHora = Integer.parseInt(row.get("ID_HORA").toString());
			String horaInicio = row.get("HORA_INICIO").toString();
			String horaSalida = row.get("HORA_SALIDA").toString();
						
			HorasClase h = new HorasClase(idHora,horaInicio,horaSalida);
			horass.add(h);
		}
		return horass;
	}
	
}
