package pe.edu.ceid.simi.management.domain.horario.model;


public class Horario {

	private int idGrupoHorario;
	private int idDia;
	private int idHora;
	
	public Horario() {}

	public Horario(int idGrupoHorario, int idDia, int idHora) {
		super();
		this.idGrupoHorario = idGrupoHorario;
		this.idDia = idDia;
		this.idHora = idHora;
	}
	
	public int getIdGrupoHorario() {
		return idGrupoHorario;
	}
	public void setIdGrupoHorario(int idGrupoHorario) {
		this.idGrupoHorario = idGrupoHorario;
	}
	public int getIdDia() {
		return idDia;
	}
	public void setIdDia(int idDia) {
		this.idDia = idDia;
	}
	public int getIdHora() {
		return idHora;
	}
	public void setIdHora(int idHora) {
		this.idHora = idHora;
	}
	
	
}
