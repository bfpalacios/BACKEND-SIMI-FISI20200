package pe.edu.ceid.simi.management.domain.estadoprogcurso.model;

public class EstadoProgCurso {

	private int idEstadoProgCurso;
	private String nomEstado;

	public EstadoProgCurso() {}

	public EstadoProgCurso(int idEstadoProgCurso, String nomEstado) {
		super();
		this.idEstadoProgCurso = idEstadoProgCurso;
		this.nomEstado = nomEstado;
	}
	
	public int getIdEstadoProgCurso() {
		return idEstadoProgCurso;
	}
	public void setIdEstadoProgCurso(int idEstadoProgCurso) {
		this.idEstadoProgCurso = idEstadoProgCurso;
	}
	public String getNomEstado() {
		return nomEstado;
	}
	public void setNomEstado(String nomEstado) {
		this.nomEstado = nomEstado;
	}

}
