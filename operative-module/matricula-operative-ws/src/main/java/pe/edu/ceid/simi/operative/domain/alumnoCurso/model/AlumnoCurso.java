package pe.edu.ceid.simi.operative.domain.alumnoCurso.model;

public class AlumnoCurso {
	private int idMatricula;
	private int idProg;
	private String codEstudiante;
	private int idUsuario;
	private int idPersona;
	private String estudiante;
	
	public AlumnoCurso(int idMatricula, int idProg, String codEstudiante, int idUsuario, int idPersona, String estudiante) {
		super();
		this.idMatricula = idMatricula;
		this.idProg = idProg;
		this.codEstudiante = codEstudiante;
		this.idUsuario = idUsuario;
		this.idPersona = idPersona;
		this.estudiante = estudiante;
	}

	public int getIdMatricula() {
		return idMatricula;
	}

	public void setIdMatricula(int idMatricula) {
		this.idMatricula = idMatricula;
	}

	public int getIdProg() {
		return idProg;
	}

	public void setIdProg(int idProg) {
		this.idProg = idProg;
	}

	public String getCodEstudiante() {
		return codEstudiante;
	}

	public void setCodEstudiante(String codEstudiante) {
		this.codEstudiante = codEstudiante;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public int getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}

	public String getEstudiante() {
		return estudiante;
	}

	public void setEstudiante(String estudiante) {
		this.estudiante = estudiante;
	}
	
	
}
