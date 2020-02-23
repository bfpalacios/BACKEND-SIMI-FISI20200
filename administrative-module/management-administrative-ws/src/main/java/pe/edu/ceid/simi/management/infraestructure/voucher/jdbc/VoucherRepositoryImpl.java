package pe.edu.ceid.simi.management.infraestructure.voucher.jdbc;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedCaseInsensitiveMap;

import pe.edu.ceid.simi.management.domain.voucher.model.Voucher;
import pe.edu.ceid.simi.management.domain.voucher.model.VoucherDTO;
import pe.edu.ceid.simi.management.domain.voucher.repository.VoucherRepository;

@Component
public class VoucherRepositoryImpl implements VoucherRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	private VoucherRowMapper row;
	
	private int statusInsert;

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public List<VoucherDTO> getVouchers() {
		SimpleJdbcCall jdbcCall = new SimpleJdbcCall(jdbcTemplate).withProcedureName("SP_VOUCHER_LIST");

		Map<String, Object> result = jdbcCall.execute();
		List<VoucherDTO> vouchers = new ArrayList<>();
		List<LinkedCaseInsensitiveMap> r = (List<LinkedCaseInsensitiveMap>) result.values().toArray()[0];
		r.forEach((v) -> vouchers.add(row.mapRow(v)));
		return vouchers;
	}

	@Override
	public boolean saveVouchers(List<Voucher> vouchers) {
		System.out.println("Entrando ->" + vouchers.size());
		this.statusInsert = 0;
		String query = "INSERT INTO TMVOUCHER " +
				" (COD, SEC, DESCRIPCION, T, NRODOCUMENTO, NR, IMPORTE, COMILLA, FECHA, HORA, C, AGENCIA, CAJERO, FILLER, MOD_MANUAL)" +
				" VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		vouchers.forEach(v -> {
			System.out.println("Entrando -> " + v.getCodigo());
			this.statusInsert = 
			this.jdbcTemplate.update(query, 
					v.getCodigo(),
					v.getSecuencia(),
					v.getDescripcion(),
					v.getT(),
					v.getNroDocumento(),
					v.getNr(),
					v.getImporte(),
					v.getEstado(),
					v.getFecha(),
					v.getHora(),
					v.getC(),
					v.getAgencia(),
					v.getCajero(),
					v.getFiller(),
					v.getMod_manual()
					);
		});
		return this.statusInsert == 1 ? true : false;
	}
	
	

}