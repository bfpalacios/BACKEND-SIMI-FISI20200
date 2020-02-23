package pe.edu.ceid.simi.operative.infraestructure.matricula.jdbc;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.swing.tree.RowMapper;
import javax.swing.tree.TreePath;

import org.springframework.stereotype.Component;
import org.springframework.util.LinkedCaseInsensitiveMap;

import pe.edu.ceid.simi.operative.domain.matricula.model.MatriculaDTO;
import pe.edu.ceid.simi.operative.domain.voucher.model.VoucherDTO;

@Component
public class MatriculaRowMapper implements RowMapper {
	@Override
	public int[] getRowsForPaths(TreePath[] arg0) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public List<MatriculaDTO> mapRowMatricula(List<Map<String, Object>> rows){
		List<MatriculaDTO> matriculas = new ArrayList<MatriculaDTO>();
		
		for(Map<String, Object> row: rows) {
			int idMatricula = Integer.parseInt(row.get("ID_MATRICULA").toString());
			int codEstudiante = Integer.parseInt(row.get("FK_COD_ESTUDIANTE_CI").toString());
			int idProgcurso = Integer.parseInt(row.get("FK_ID_PROGCURSO").toString());
			int numvouvher = Integer.parseInt(row.get("FK_NUM_VOUCHER").toString());
			int estadoMat = Integer.parseInt(row.get("FK_ID_ESTADO_MATRICULA").toString());
			String fechaMat = row.get("FECHA_MATRICULA").toString();
			String nomEstado = row.get("NOM_ESTADO_MATRICULA").toString();
			String nomIdioma= row.get("NOM_IDIOMA").toString();
			String nomNivel= row.get("NOM_NIVEL").toString();
			String nomDocente= row.get("NOMBRE").toString();
			String appatDocente= row.get("APELLIDO_PAT").toString();
			String apmatDocente= row.get("APELLIDO_MAT").toString();
			String nomGrupoH = row.get("NOM_GRUPOHORARIO").toString();
			String horaInicio = row.get("HORA_INICIO").toString();
			String horaFin = row.get("HORA_SALIDA").toString();
			
			MatriculaDTO i = new MatriculaDTO(idMatricula, codEstudiante, idProgcurso, numvouvher, estadoMat, fechaMat,
					nomEstado, nomIdioma, nomNivel, nomDocente, appatDocente, apmatDocente, nomGrupoH, horaInicio, horaFin);
			
			matriculas.add(i);
		}
		return matriculas;
	}
	
	public VoucherDTO mapRowVoucherSinPagar(LinkedCaseInsensitiveMap row){
		int codUsuario = Integer.parseInt(row.get("ID_USUARIO").toString());
		String codVoucher = row.get("SEC").toString();
		String codConcepto = row.get("COD").toString();
		String email = row.get("EMAIL").toString();
		String descripcion = row.get("DESCRIPCION").toString();
		String dni= row.get("DNI").toString();
		float importe = Float.parseFloat(row.get("IMPORTE").toString());
		String fecha= row.get("FECHA").toString();
		String estado = row.get("ESTADO").toString().equals("1") ? "USADO" : "NO USADO";
		
		return VoucherDTO.builder()
				.codUsuario(codUsuario)
				.codVoucher(codVoucher)
				.codConcepto(codConcepto)
				.email(email)
				.descripcion(descripcion)
				.dni(dni)
				.importe(importe)
				.fecha(fecha)
				.estado(estado).build();
	}
	
}
