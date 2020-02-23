package pe.edu.ceid.simi.management.domain.matricula.model;

public class Matricula {

	private int idMatricula;
	private int codEstudiante;
	private int idProgCurso;
	private int numVoucher;
	private int idEstadoMatricula;
	
	public Matricula(int idMatricula, int codEstudiante, int idProgCurso, int numVoucher, int idEstadoMatricula) {
		super();
		this.idMatricula = idMatricula;
		this.codEstudiante = codEstudiante;
		this.idProgCurso = idProgCurso;
		this.numVoucher = numVoucher;
		this.idEstadoMatricula = idEstadoMatricula;
	}
	
	public int getIdMatricula() {
		return idMatricula;
	}
	public void setIdMatricula(int idMatricula) {
		this.idMatricula = idMatricula;
	}
	public int getCodEstudiante() {
		return codEstudiante;
	}
	public void setCodEstudiante(int codEstudiante) {
		this.codEstudiante = codEstudiante;
	}
	public int getIdProgCurso() {
		return idProgCurso;
	}
	public void setIdProgCurso(int idProgCurso) {
		this.idProgCurso = idProgCurso;
	}
	public int getNumVoucher() {
		return numVoucher;
	}
	public void setNumVoucher(int numVoucher) {
		this.numVoucher = numVoucher;
	}
	public int getIdEstadoMatricula() {
		return idEstadoMatricula;
	}
	public void setIdEstadoMatricula(int isEstadoMatricula) {
		this.idEstadoMatricula = isEstadoMatricula;
	}
	
}
