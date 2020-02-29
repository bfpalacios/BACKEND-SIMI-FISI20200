package pe.edu.ceid.simi.management.web.controllers.reportes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.ceid.simi.management.application.voucher.VoucherService;
import pe.edu.ceid.simi.management.domain.voucher.model.Voucher;
import pe.edu.ceid.simi.management.domain.voucher.model.VoucherDTO;

@CrossOrigin(origins = "localhost:4200")
@RestController
@RequestMapping({"/api/v1/vouchers"})
public class VoucherController {

	@Autowired
	private VoucherService service;

	@GetMapping
	public List<VoucherDTO> getVouchers() {
		return this.service.getVouchers();
	}

	@PostMapping
	public boolean saveVouchers(@RequestBody List<Voucher> vouchers) {
		return this.service.saveVouchers(vouchers);
	}
}