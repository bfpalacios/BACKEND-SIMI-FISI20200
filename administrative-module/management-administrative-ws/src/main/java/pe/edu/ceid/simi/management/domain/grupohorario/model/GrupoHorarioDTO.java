package pe.edu.ceid.simi.management.domain.grupohorario.model;

public class GrupoHorarioDTO {

	private int idGrupoHorario;
	private String nomGrupoHorario;
	private String listaHorarios;
	
	public GrupoHorarioDTO(int idGrupoHorario, String nomGrupoHorario, String listaHorarios) {
		super();
		this.idGrupoHorario = idGrupoHorario;
		this.nomGrupoHorario = nomGrupoHorario;
		this.listaHorarios = listaHorarios;
	}
	
	public int getIdGrupoHorario() {
		return idGrupoHorario;
	}
	public void setIdGrupoHorario(int idGrupoHorario) {
		this.idGrupoHorario = idGrupoHorario;
	}
	public String getNomGrupoHorario() {
		return nomGrupoHorario;
	}
	public void setNomGrupoHorario(String nomGrupoHorario) {
		this.nomGrupoHorario = nomGrupoHorario;
	}
	public String getListaHorarios() {
		return listaHorarios;
	}
	public void setListaHorarios(String listaHorarios) {
		this.listaHorarios = listaHorarios;
	}
	
}
