package pe.edu.ceid.simi.management.domain.matricula.model;

import java.sql.Date;

public class Matricula {

	private int idMatricula;
	private String codEstudiante;
	private int idProgCurso;
	private int numVoucher;
	private int idEstadoMatricula;
	private Date fechaMatricula;

	public Matricula() {}

	public Matricula(int idMatricula, String codEstudiante, int idProgCurso, int numVoucher, int idEstadoMatricula) {
		super();
		this.idMatricula = idMatricula;
		this.codEstudiante = codEstudiante;
		this.idProgCurso = idProgCurso;
		this.numVoucher = numVoucher;
		this.idEstadoMatricula = idEstadoMatricula;
	}

	public Matricula(int idMatricula, String codEstudiante, int idProgCurso, int numVoucher, int idEstadoMatricula,
			Date fechaMatricula) {
		super();
		this.idMatricula = idMatricula;
		this.codEstudiante = codEstudiante;
		this.idProgCurso = idProgCurso;
		this.numVoucher = numVoucher;
		this.idEstadoMatricula = idEstadoMatricula;
		this.fechaMatricula = fechaMatricula;
	}

	public int getIdMatricula() {
		return idMatricula;
	}
	public void setIdMatricula(int idMatricula) {
		this.idMatricula = idMatricula;
	}
	public String getCodEstudiante() {
		return codEstudiante;
	}
	public void setCodEstudiante(String codEstudiante) {
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
	public Date getFechaMatricula() {
		return fechaMatricula;
	}
	public void setFechaMatricula(Date fechaMatricula) {
		this.fechaMatricula = fechaMatricula;
	}
	
}
