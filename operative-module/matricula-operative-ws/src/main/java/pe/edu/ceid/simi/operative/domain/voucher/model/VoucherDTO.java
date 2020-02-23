package pe.edu.ceid.simi.operative.domain.voucher.model;

public class VoucherDTO {
	private String codVoucher;
	private int codUsuario;
	private String email;
	private String dni;
	private String codConcepto;
	private String descripcion;
	private float importe;
	private String fecha;
	private String estado;
	
	public VoucherDTO(String codVoucher, int codUsuario, String email, String dni, String codConcepto, String descripcion,
			float importe, String fecha, String estado) {
		this.codVoucher = codVoucher;
		this.codUsuario = codUsuario;
		this.email = email;
		this.dni = dni;
		this.codConcepto = codConcepto;
		this.descripcion = descripcion;
		this.importe = importe;
		this.fecha = fecha;
		this.estado = estado;
	}
	
	public String getCodVoucher() {
		return codVoucher;
	}
	public void setCodVoucher(String codVoucher) {
		this.codVoucher = codVoucher;
	}
	public int getCodUsuario() {
		return codUsuario;
	}
	public void setCodUsuario(int codUsuario) {
		this.codUsuario = codUsuario;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getCodConcepto() {
		return codConcepto;
	}
	public void setCodConcepto(String codConcepto) {
		this.codConcepto = codConcepto;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public float getImporte() {
		return importe;
	}
	public void setImporte(float importe) {
		this.importe = importe;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
	public static VoucherDTOBuilder builder() {
		return new VoucherDTOBuilder();
	}
	public static class VoucherDTOBuilder {
		private String codVoucher;
		private int codUsuario;
		private String email;
		private String dni;
		private String codConcepto;
		private String descripcion;
		private float importe;
		private String fecha;
		private String estado;
		
		public VoucherDTOBuilder codVoucher(String codVoucher){
			this.codVoucher = codVoucher;
			return this;
		}
		public VoucherDTOBuilder codUsuario(int codUsuario){
			this.codUsuario = codUsuario;
			return this;
		}
		public VoucherDTOBuilder dni(String dni){
			this.dni = dni;
			return this;
		}
		public VoucherDTOBuilder codConcepto(String codConcepto){
			this.codConcepto = codConcepto;
			return this;
		}
		public VoucherDTOBuilder descripcion(String descripcion){
			this.descripcion = descripcion;
			return this;
		}
		public VoucherDTOBuilder email(String email){
			this.email = email;
			return this;
		}
		public VoucherDTOBuilder importe(float importe){
			this.importe = importe;
			return this;
		}
		public VoucherDTOBuilder fecha(String fecha){
			this.fecha = fecha;
			return this;
		}
		public VoucherDTOBuilder estado(String estado){
			this.estado = estado;
			return this;
		}
		
		public VoucherDTO build() {
			return new VoucherDTO(codVoucher, codUsuario, email, dni, codConcepto, descripcion, importe, fecha, estado);
		}
	}
	
}
