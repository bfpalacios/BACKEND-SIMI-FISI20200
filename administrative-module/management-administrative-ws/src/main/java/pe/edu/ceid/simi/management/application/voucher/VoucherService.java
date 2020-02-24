package pe.edu.ceid.simi.management.application.voucher;

import java.util.List;

import pe.edu.ceid.simi.management.domain.voucher.model.Voucher;
import pe.edu.ceid.simi.management.domain.voucher.model.VoucherDTO;

public interface VoucherService {
	List<VoucherDTO> getVouchers();
	boolean saveVouchers(List<Voucher> vouchers);
}