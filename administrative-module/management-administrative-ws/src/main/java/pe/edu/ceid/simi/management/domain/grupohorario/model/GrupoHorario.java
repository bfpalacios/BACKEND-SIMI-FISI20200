package pe.edu.ceid.simi.management.domain.grupohorario.model;

public class GrupoHorario {

	private int idGrupoHorario;
	private String nomGrupoHorario;

	public GrupoHorario() {}

	public GrupoHorario(int cgrupoHorario, String nomGrupoHorario) {
		super();
		this.idGrupoHorario = cgrupoHorario;
		this.nomGrupoHorario = nomGrupoHorario;
	}
	
	public int getIdGrupoHorario() {
		return idGrupoHorario;
	}
	public void setIdGrupoHorario(int cgrupoHorario) {
		this.idGrupoHorario = cgrupoHorario;
	}
	public String getNomGrupoHorario() {
		return nomGrupoHorario;
	}
	public void setNomGrupoHorario(String nomGrupoHorario) {
		this.nomGrupoHorario = nomGrupoHorario;
	}
	
}
