package pe.edu.ceid.simi.operative.infraestructure.nota.jdbc;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.swing.tree.RowMapper;
import javax.swing.tree.TreePath;

import org.springframework.stereotype.Component;
import org.springframework.util.LinkedCaseInsensitiveMap;

import pe.edu.ceid.simi.operative.domain.nota.model.NotaDTO;
import pe.edu.ceid.simi.operative.domain.detalleNota.model.DetalleNota;

@Component
public class NotaRowMapper implements RowMapper {

	@Override
	public int[] getRowsForPaths(TreePath[] arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings("rawtypes")
	public NotaDTO mapRow(LinkedCaseInsensitiveMap row) {

		int idNota = Integer.parseInt(row.get("ID_NOTA").toString());
		int idMatricula = Integer.parseInt(row.get("FK_ID_MATRICULA").toString());
		String codEstudiante = row.get("FK_COD_ESTUDIANTE_CI").toString();
		String nomPeriodo = row.get("NOM_PERIODO").toString();
		String nomIdioma = row.get("NOM_IDIOMA").toString();
		String nomNivel = row.get("NOM_NIVEL").toString();
		int ciclo = Integer.parseInt(row.get("CICLO").toString());
		String hora = row.get("HORA").toString();
		int promedio = Integer.parseInt(row.get("PROMEDIO").toString());

		NotaDTO i = new NotaDTO(idNota, idMatricula, codEstudiante, nomPeriodo, nomIdioma, nomNivel,
				ciclo, hora, promedio);
		return i;
	}
	
	@SuppressWarnings("rawtypes")
	public DetalleNota DetallemapRow(LinkedCaseInsensitiveMap row) {

		int idDetalle = Integer.parseInt(row.get("ID_DETALLE_NOTA").toString());
		int idNota = Integer.parseInt(row.get("ID_NOTA").toString());
		String descripcion = row.get("NOTA_DESC").toString();
		int porcentaje = Integer.parseInt(row.get("PORCENTAJE").toString());
		int nota = Integer.parseInt(row.get("NOTA").toString());

		DetalleNota i = new DetalleNota(idDetalle, idNota, descripcion, porcentaje, nota);
		return i;
	}
}
