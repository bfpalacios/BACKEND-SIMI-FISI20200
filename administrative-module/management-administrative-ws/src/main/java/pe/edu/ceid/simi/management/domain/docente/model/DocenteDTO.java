package pe.edu.ceid.simi.management.domain.docente.model;

public class DocenteDTO {

	private int codDocente;
	private int idUsuario;
	private String nombre;			// idUsuario
	private String apellidoPat;		// idUsuario
	private String apellidoMat;		// idUsuario
	private int departamento;
	
	public DocenteDTO(int codDocente, int idUsuario, String nombre, String apellidoPat, String apellidoMat,
			int departamento) {
		super();
		this.codDocente = codDocente;
		this.idUsuario = idUsuario;
		this.nombre = nombre;
		this.apellidoPat = apellidoPat;
		this.apellidoMat = apellidoMat;
		this.departamento = departamento;
	}
	
	public int getCodDocente() {
		return codDocente;
	}
	public void setCodDocente(int codDocente) {
		this.codDocente = codDocente;
	}
	public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidoPat() {
		return apellidoPat;
	}
	public void setApellidoPat(String apellidoPat) {
		this.apellidoPat = apellidoPat;
	}
	public String getApellidoMat() {
		return apellidoMat;
	}
	public void setApellidoMat(String apellidoMat) {
		this.apellidoMat = apellidoMat;
	}
	public int getDepartamento() {
		return departamento;
	}
	public void setDepartamento(int departamento) {
		this.departamento = departamento;
	}
	
}
