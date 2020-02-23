package pe.edu.ceid.simi.management.infraestructure.voucher.jdbc;

import org.springframework.stereotype.Component;
import org.springframework.util.LinkedCaseInsensitiveMap;
import pe.edu.ceid.simi.management.domain.voucher.model.VoucherDTO;

@Component
public class VoucherRowMapper {

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
}