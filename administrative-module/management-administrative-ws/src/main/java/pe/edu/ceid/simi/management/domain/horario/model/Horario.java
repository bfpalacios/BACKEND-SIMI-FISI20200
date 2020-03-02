package pe.edu.ceid.simi.management.domain.horario.model;


public class Horario {

	private int idHorario;
	private int idGrupoHorario;
	private int idHora;
	
	public Horario() {}

	public Horario(int idHorario, int idGrupoHorario, int idHora) {
		super();
		this.idHorario = idHorario;
		this.idGrupoHorario = idGrupoHorario;
		this.idHora = idHora;
	}
	
	public int getIdHorario() {
		return idHorario;
	}
	public void setIdHorario(int idHorario) {
		this.idHorario = idHorario;
	}
	public int getIdGrupoHorario() {
		return idGrupoHorario;
	}
	public void setIdGrupoHorario(int idGrupoHorario) {
		this.idGrupoHorario = idGrupoHorario;
	}
	public int getIdHora() {
		return idHora;
	}
	public void setIdHora(int idHora) {
		this.idHora = idHora;
	}
	
	
}
