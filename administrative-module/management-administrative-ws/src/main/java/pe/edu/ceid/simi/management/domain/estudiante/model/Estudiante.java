package pe.edu.ceid.simi.management.domain.estudiante.model;

public class Estudiante {
	
	private int codEstudiante;
	private int idUsuario;
	private int idTipoEstudiante;
	private int codEstudianteAsm;
	
	public Estudiante(int cestudiante, int cusuario, int ctipoEsudiante, int codEstudianteAsm) {
		super();
		this.codEstudiante = cestudiante;
		this.idUsuario = cusuario;
		this.idTipoEstudiante = ctipoEsudiante;
		this.codEstudianteAsm = codEstudianteAsm;
	}
	
	public int getCodEstudiante() {
		return codEstudiante;
	}
	public void setCodEstudiante(int codEstudiante) {
		this.codEstudiante = codEstudiante;
	}
	public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	public int getIdTipoEsudiante() {
		return idTipoEstudiante;
	}
	public void setIdTipoEsudiante(int idTipoEstudiante) {
		this.idTipoEstudiante = idTipoEstudiante;
	}
	public int getCodEstudianteAsm() {
		return codEstudianteAsm;
	}
	public void setCodEstudianteAsm(int codEstudianteAsm) {
		this.codEstudianteAsm = codEstudianteAsm;
	}
	
}
