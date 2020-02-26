package pe.edu.ceid.simi.management.domain.estadomatricula.model;

public class EstadoMatricula {

	private int idEstadoMatricula;
	private String nomEstadoMatricula;
	
	public EstadoMatricula() {}
	
	public EstadoMatricula(int idEstadoMatricula, String nomEstadoMatricula) {
		super();
		this.idEstadoMatricula = idEstadoMatricula;
		this.nomEstadoMatricula = nomEstadoMatricula;
	}
	
	public int getIdEstadoMatricula() {
		return idEstadoMatricula;
	}
	public void setIdEstadoMatricula(int idEstadoMatricula) {
		this.idEstadoMatricula = idEstadoMatricula;
	}
	public String getNomEstadoMatricula() {
		return nomEstadoMatricula;
	}
	public void setNomEstadoMatricula(String nomEstadoMatricula) {
		this.nomEstadoMatricula = nomEstadoMatricula;
	}
	
}
