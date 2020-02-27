package pe.edu.ceid.simi.management.domain.alumnosm.model;

public class AlumnoSM {

	private String codAsm;
	private String dniAsm;
	private String nombreAsm;
	private String apellidoPatAsm;
	private String apellidoMatAsm;
	private String emailAsm;
	private String facultadAsm;
	private int generoAsm;
	private int idEstadoAsm;
	private String nomEstadoAsm;
	
	public AlumnoSM() {}
	
	public AlumnoSM(String codAsm, String dniAsm, String nombreAsm, String apellidoPatAsm, String apellidoMatAsm,
			String emailAsm, String facultadAsm, int generoAsm, int idEstadoAsm, String nomEstadoAsm) {
		super();
		this.codAsm = codAsm;
		this.dniAsm = dniAsm;
		this.nombreAsm = nombreAsm;
		this.apellidoPatAsm = apellidoPatAsm;
		this.apellidoMatAsm = apellidoMatAsm;
		this.emailAsm = emailAsm;
		this.facultadAsm = facultadAsm;
		this.generoAsm = generoAsm;
		this.idEstadoAsm = idEstadoAsm;
		this.nomEstadoAsm = nomEstadoAsm;
	}
	
	public String getCodAsm() {
		return codAsm;
	}
	public void setCodAsm(String codAsm) {
		this.codAsm = codAsm;
	}
	public String getDniAsm() {
		return dniAsm;
	}
	public void setDniAsm(String dniAsm) {
		this.dniAsm = dniAsm;
	}
	public String getNombreAsm() {
		return nombreAsm;
	}
	public void setNombreAsm(String nombreAsm) {
		this.nombreAsm = nombreAsm;
	}
	public String getApellidoPatAsm() {
		return apellidoPatAsm;
	}
	public void setApellidoPatAsm(String apellidoPatAsm) {
		this.apellidoPatAsm = apellidoPatAsm;
	}
	public String getApellidoMatAsm() {
		return apellidoMatAsm;
	}
	public void setApellidoMatAsm(String apellidoMatAsm) {
		this.apellidoMatAsm = apellidoMatAsm;
	}
	public String getEmailAsm() {
		return emailAsm;
	}
	public void setEmailAsm(String emailAsm) {
		this.emailAsm = emailAsm;
	}
	public String getFacultadAsm() {
		return facultadAsm;
	}
	public void setFacultadAsm(String facultadAsm) {
		this.facultadAsm = facultadAsm;
	}
	public int getGeneroAsm() {
		return generoAsm;
	}
	public void setGeneroAsm(int generoAsm) {
		this.generoAsm = generoAsm;
	}
	public int getIdEstadoAsm() {
		return idEstadoAsm;
	}
	public void setIdEstadoAsm(int idEstadoAsm) {
		this.idEstadoAsm = idEstadoAsm;
	}
	public String getNomEstadoAsm() {
		return nomEstadoAsm;
	}
	public void setNomEstadoAsm(String nomEstadoAsm) {
		this.nomEstadoAsm = nomEstadoAsm;
	}

}
