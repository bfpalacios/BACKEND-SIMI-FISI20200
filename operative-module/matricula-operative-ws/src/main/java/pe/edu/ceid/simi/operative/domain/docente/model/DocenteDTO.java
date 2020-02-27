package pe.edu.ceid.simi.operative.domain.docente.model;

public class DocenteDTO {

	private String codDocente;
	private int idUsuario;
	private String nombre;			// idUsuario
	private String apellidoPat;		// idUsuario
	private String apellidoMat;		// idUsuario
	private String departamento;
	
	public DocenteDTO(String codDocente, int idUsuario, String nombre, String apellidoPat, String apellidoMat,
			String departamento) {
		super();
		this.codDocente = codDocente;
		this.idUsuario = idUsuario;
		this.nombre = nombre;
		this.apellidoPat = apellidoPat;
		this.apellidoMat = apellidoMat;
		this.departamento = departamento;
	}

	public String getCodDocente() {
		return codDocente;
	}

	public void setCodDocente(String codDocente) {
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

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
}
