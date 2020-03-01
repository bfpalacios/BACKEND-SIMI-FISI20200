package pe.edu.ceid.simi.management.domain.voucher.repository;

import java.util.List;
import pe.edu.ceid.simi.management.domain.voucher.model.Voucher;
import pe.edu.ceid.simi.management.domain.voucher.model.VoucherDTO;

public interface VoucherRepository {
	List<VoucherDTO> getVouchers();
	boolean saveVouchers(List<Voucher> vouchers);
	boolean existeVoucher(int codvoucher);
}