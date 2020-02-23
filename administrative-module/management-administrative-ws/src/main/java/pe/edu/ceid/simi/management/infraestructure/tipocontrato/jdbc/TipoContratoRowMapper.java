package pe.edu.ceid.simi.management.infraestructure.tipocontrato.jdbc;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.swing.tree.RowMapper;
import javax.swing.tree.TreePath;

import org.springframework.stereotype.Component;

import pe.edu.ceid.simi.management.domain.tipocontrato.model.TipoContrato;

@Component
public class TipoContratoRowMapper implements RowMapper {

	@Override
	public int[] getRowsForPaths(TreePath[] arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<TipoContrato> mapRowTipoContrato(List<Map<String, Object>> rows){
		List<TipoContrato> tiposs = new ArrayList<TipoContrato>();
		
		for(Map<String, Object> row: rows) {
			int idTipoContrato = Integer.parseInt(row.get("ID_TIPO_CONTRATO").toString());
			String nomTipoContrato =row.get("NOM_TIPO").toString();
			
			TipoContrato t = new TipoContrato(idTipoContrato, nomTipoContrato);
			tiposs.add(t);
		}
		
		return tiposs;
	}
	
}
