package pe.edu.ceid.simi.management.domain.voucher.model;


public class VoucherDTO {

	private int codigo;
	private int secuencia;
	private String descripcion;
	private String nroDocumento;
	private float importe;
	private int estado;
	private String fecha;
	private String hora;

	public VoucherDTO(int codigo, int secuencia, String descripcion, String nroDocumento, float importe, int estado,
			String fecha, String hora) {
		super();
		this.codigo = codigo;
		this.secuencia = secuencia;
		this.descripcion = descripcion;
		this.nroDocumento = nroDocumento;
		this.importe = importe;
		this.estado = estado;
		this.fecha = fecha;
		this.hora = hora;
	}

	public VoucherDTO(int codigo, int secuencia, String descripcion, String nroDocumento, float importe,
			String fecha, String hora) {
		super();
		this.codigo = codigo;
		this.secuencia = secuencia;
		this.descripcion = descripcion;
		this.nroDocumento = nroDocumento;
		this.importe = importe;
		this.fecha = fecha;
		this.hora = hora;
	}
	
	public VoucherDTO() {
		
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getSecuencia() {
		return secuencia;
	}

	public void setSecuencia(int secuencia) {
		this.secuencia = secuencia;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getNroDocumento() {
		return nroDocumento;
	}

	public void setNroDocumento(String nroDocumento) {
		this.nroDocumento = nroDocumento;
	}

	public float getImporte() {
		return importe;
	}

	public void setImporte(float importe) {
		this.importe = importe;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}
	
	public static VoucherBuilder builder() {
		return new VoucherBuilder();
	}
	
	public static class VoucherBuilder {
		
		private int codigo;
		private int secuencia;
		private String descripcion;
		private String nroDocumento;
		private float importe;
		private int estado;
		private String fecha;
		private String hora;
		
		public VoucherBuilder codigo(int codigo) {
			this.codigo = codigo;
			return this;
		}
		
		public VoucherBuilder secuencia(int secuencia) {
			this.secuencia = secuencia;
			return this;
		}
		
		public VoucherBuilder descripcion(String descripcion) {
			this.descripcion = descripcion;
			return this;
		}
		
		public VoucherBuilder nroDocumento(String nroDocumento) {
			this.nroDocumento = nroDocumento;
			return this;
		}
		
		public VoucherBuilder importe(float importe) {
			this.importe = importe;
			return this;
		}
		
		public VoucherBuilder estado(int estado) {
			this.estado = estado;
			return this;
		}
		
		public VoucherBuilder fecha(String fecha) {
			this.fecha = fecha;
			return this;
		}
		
		public VoucherBuilder hora(String hora) {
			this.hora = hora;
			return this;
		}
		
		public  VoucherDTO build() {
			return new VoucherDTO(codigo, secuencia, descripcion, nroDocumento, importe, estado, fecha, hora);
		}
		
	}
}