package pe.edu.ceid.simi.management.infraestructure.periodoacademico.jdbc;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.swing.tree.RowMapper;
import javax.swing.tree.TreePath;

import org.springframework.stereotype.Component;

import pe.edu.ceid.simi.management.domain.periodoacademico.model.PeriodoAcademico;

@Component
public class PeriodoAcademicoRowMapper implements RowMapper {

	@Override
	public int[] getRowsForPaths(TreePath[] path) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public List<PeriodoAcademico> mapRowPeriodoAcademico(List<Map<String, Object>> rows){
		List<PeriodoAcademico> periodoss = new ArrayList<PeriodoAcademico>();
		
		for(Map<String, Object> row: rows) {
			int idPeriodo = Integer.parseInt(row.get("ID_PERIODO").toString());
			String nomPeriodo = row.get("NOM_PERIODO").toString();
			Date fechaInicio = (Date) row.get("FECHA_INICIO");
			Date fechaFin = (Date) row.get("FECHA_FIN");
			PeriodoAcademico p = new PeriodoAcademico(idPeriodo, nomPeriodo, fechaInicio, fechaFin);
			periodoss.add(p);
		}
		
		return periodoss;
	}
	
}
