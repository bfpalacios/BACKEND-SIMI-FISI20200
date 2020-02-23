package pe.edu.ceid.simi.management.domain.tipoestudiante.model;

public class TipoEstudiante {
	
	private int idTipoEstudiante;
	private String nomTipoEstudiante;

	public TipoEstudiante() {}

	public TipoEstudiante(int ctipoEstudiante, String nomTipoEstudiante) {
		super();
		this.idTipoEstudiante = ctipoEstudiante;
		this.nomTipoEstudiante = nomTipoEstudiante;
	}
	
	public int getIdTipoEstudiante() {
		return idTipoEstudiante;
	}
	public void setIdTipoEstudiante(int ctipoEstudiante) {
		this.idTipoEstudiante = ctipoEstudiante;
	}
	public String getNomTipoEstudiante() {
		return nomTipoEstudiante;
	}
	public void setNomTipoEstudiante(String nomTipoEstudiante) {
		this.nomTipoEstudiante = nomTipoEstudiante;
	}
	
}
