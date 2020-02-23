package pe.edu.ceid.simi.management.domain.voucher.model;

public class Voucher {

	private int codigo;
	private int secuencia;
	private String descripcion;
	private int t;
	private String nroDocumento;
	private int nr;
	private float importe;
	private int estado;
	private String fecha;
	private String hora;
	private int c;
	private int agencia;
	private int cajero;
	private int filler;
	private int mod_manual;
	
	public Voucher(int codigo, int secuencia, String descripcion, int t, String nroDocumento, int nr, float importe,
			int estado, String fecha, String hora, int c, int agencia, int cajero, int filler, int mod_manual) {
		super();
		this.codigo = codigo;
		this.secuencia = secuencia;
		this.descripcion = descripcion;
		this.t = t;
		this.nroDocumento = nroDocumento;
		this.nr = nr;
		this.importe = importe;
		this.estado = estado;
		this.fecha = fecha;
		this.hora = hora;
		this.c = c;
		this.agencia = agencia;
		this.cajero = cajero;
		this.filler = filler;
		this.mod_manual = mod_manual;
	}

	public Voucher() {
		
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

	public int getT() {
		return t;
	}

	public void setT(int t) {
		this.t = t;
	}

	public int getNr() {
		return nr;
	}

	public void setNr(int nr) {
		this.nr = nr;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getCajero() {
		return cajero;
	}

	public void setCajero(int cajero) {
		this.cajero = cajero;
	}

	public int getFiller() {
		return filler;
	}

	public void setFiller(int filler) {
		this.filler = filler;
	}

	public int getMod_manual() {
		return mod_manual;
	}

	public void setMod_manual(int mod_manual) {
		this.mod_manual = mod_manual;
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
	
}