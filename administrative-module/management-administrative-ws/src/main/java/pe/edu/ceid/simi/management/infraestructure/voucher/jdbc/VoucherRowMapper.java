package pe.edu.ceid.simi.management.infraestructure.voucher.jdbc;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.swing.tree.RowMapper;
import javax.swing.tree.TreePath;

import org.springframework.stereotype.Component;
import org.springframework.util.LinkedCaseInsensitiveMap;

import pe.edu.ceid.simi.management.domain.voucher.model.VoucherDTO;

@Component
public class VoucherRowMapper implements RowMapper {

	@Override
	public int[] getRowsForPaths(TreePath[] arg0) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@SuppressWarnings("rawtypes")
	public VoucherDTO mapRow(LinkedCaseInsensitiveMap row){
			int codigo = Integer.parseInt(row.get("CODIGO").toString());
			int secuencia = Integer.parseInt(row.get("SECUENCIA").toString());
			String descripcion = row.get("DESCRIPCION").toString();
			String nroDocumento = row.get("NRODOCUMENTO").toString();
			float importe = Float.parseFloat(row.get("IMPORTE").toString());
			String fecha = row.get("FECHA").toString();
			String hora = row.get("HORA").toString();

		return VoucherDTO.builder().codigo(codigo).secuencia(secuencia).descripcion(descripcion).nroDocumento(nroDocumento).importe(importe).fecha(fecha).hora(hora).build();
	}
	
	public List<VoucherDTO> mapRowVoucher(List<Map<String, Object>> rows){
		List<VoucherDTO> vouchers = new ArrayList<VoucherDTO>();
		
		for(Map<String, Object> row: rows) {
			int codigo = Integer.parseInt(row.get("COD").toString());
			int secuencia = Integer.parseInt(row.get("SEC").toString());
			String descripcion = row.get("DESCRIPCION").toString();
			String nroDocumento = row.get("NRODOCUMENTO").toString();
			float importe = Float.parseFloat(row.get("IMPORTE").toString());
			String fecha = row.get("FECHA").toString();
			String hora = row.get("HORA").toString();
			
			VoucherDTO v = new VoucherDTO(codigo, secuencia, descripcion, nroDocumento, importe, fecha, hora);
			vouchers.add(v);
		}
		
		return vouchers;
	}
}