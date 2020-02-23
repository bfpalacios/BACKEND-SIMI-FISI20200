package pe.edu.ceid.simi.management.domain.estudiante.model;

public class EstudianteDTO {
	
	private int codEstudiante;
	private int idUsuario;
	private String nombre;				// idUsuario -> idPersona
	private String apellidoPat;			// idUsuario -> idPersona
	private String apellidoMat;			// idUsuario -> idPersona
	private int idTipoEstudiante;
	private String nomTipoEstudiante;	// idTipoEstudiante
	private int codEstudianteAsm;
	
	public EstudianteDTO(int cestudiante, int cusuario, String nombre, String apellidoPat, String apellidoMat,
			int ctipoEsudiante, String nomTipoEstudiante, int codEstudianteAsm) {
		super();
		this.codEstudiante = cestudiante;
		this.idUsuario = cusuario;
		this.nombre = nombre;
		this.apellidoPat = apellidoPat;
		this.apellidoMat = apellidoMat;
		this.idTipoEstudiante = ctipoEsudiante;
		this.nomTipoEstudiante = nomTipoEstudiante;
		this.codEstudianteAsm = codEstudianteAsm;
	}
	
	public EstudianteDTO(int cestudiante, int cusuario, int ctipoEsudiante, int codEstudianteAsm) {
		super();
		this.codEstudiante = cestudiante;
		this.idUsuario = cusuario;
		this.idTipoEstudiante = ctipoEsudiante;
		this.codEstudianteAsm = codEstudianteAsm;
	}
	
	public int getCodEstudiante() {
		return codEstudiante;
	}
	public void setCodEstudiante(int cestudiante) {
		this.codEstudiante = cestudiante;
	}
	public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(int cusuario) {
		this.idUsuario = cusuario;
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
	public int getIdTipoEsudiante() {
		return idTipoEstudiante;
	}
	public void setIdTipoEsudiante(int ctipoEsudiante) {
		this.idTipoEstudiante = ctipoEsudiante;
	}
	public String getNomTipoEstudiante() {
		return nomTipoEstudiante;
	}
	public void setNomTipoEstudiante(String nomTipoEstudiante) {
		this.nomTipoEstudiante = nomTipoEstudiante;
	}
	public int getCodEstudianteAsm() {
		return codEstudianteAsm;
	}
	public void setCodEstudianteAsm(int codEstudianteAsm) {
		this.codEstudianteAsm = codEstudianteAsm;
	}
	
}
