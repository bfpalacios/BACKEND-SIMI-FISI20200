package pe.edu.ceid.simi.management.domain.horario.model;

public class HorarioDTO {

	private int idHorario;
	private int idGrupoHorario;
	private String nomGrupoHorario;
	private int idHora;
	private String horaInicio;	//idHora
	private String horaSalida;	//idHora

	public HorarioDTO() {}

	public HorarioDTO(int idHorario, int idGrupoHorario, String nomGrupoHorario, int idHora, String horaInicio, String horaSalida) {
		super();
		this.idHorario = idHorario;
		this.idGrupoHorario = idGrupoHorario;
		this.nomGrupoHorario = nomGrupoHorario;
		this.idHora = idHora;
		this.horaInicio = horaInicio;
		this.horaSalida = horaSalida;
	}

	public HorarioDTO(int idHorario, int idGrupoHorario, int idHora) {
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
	public String getNomGrupoHorario() {
		return nomGrupoHorario;
	}
	public void setNomGrupoHorario(String nomGrupoHorario) {
		this.nomGrupoHorario = nomGrupoHorario;
	}
	public int getIdHora() {
		return idHora;
	}
	public void setIdHora(int idHora) {
		this.idHora = idHora;
	}
	public String getHoraInicio() {
		return horaInicio;
	}
	public void setHoraInicio(String horaInicio) {
		this.horaInicio = horaInicio;
	}
	public String getHoraSalida() {
		return horaSalida;
	}
	public void setHoraSalida(String horaSalida) {
		this.horaSalida = horaSalida;
	}

}
