package pe.edu.ceid.simi.management.domain.periodoacademico.model;

import java.sql.Date;

public class PeriodoAcademico {

	private int idPeriodo;
	private String nomPeriodo;
	private Date fechaInicio;
	private Date fechaFin;
	
	public PeriodoAcademico(int idPeriodo, String nomPeriodo, Date fechaInicio, Date fechaFin) {
		super();
		this.idPeriodo = idPeriodo;
		this.nomPeriodo = nomPeriodo;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
	}
	
	
	public PeriodoAcademico() {
		super();
	}


	public int getIdPeriodo() {
		return idPeriodo;
	}
	public void setIdPeriodo(int idPeriodo) {
		this.idPeriodo = idPeriodo;
	}
	public String getNomPeriodo() {
		return nomPeriodo;
	}
	public void setNomPeriodo(String nomPeriodo) {
		this.nomPeriodo = nomPeriodo;
	}
	public Date getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public Date getFechaFin() {
		return fechaFin;
	}
	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}
	
}
