package pe.edu.ceid.simi.management.domain.horario.model;

public class HorarioDTO {

	private int idGrupoHorario;
	private int idDia;
	private String nomDia;	//cdia
	private int idHora;
	private String horaInicio;	//chora
	private String horaSalida;	//chora

	public HorarioDTO() {}

	public HorarioDTO(int idGrupoHorario, int idDia, String nomDia, int idHora, String horaInicio, String horaSalida) {
		super();
		this.idGrupoHorario = idGrupoHorario;
		this.idDia = idDia;
		this.nomDia = nomDia;
		this.idHora = idHora;
		this.horaInicio = horaInicio;
		this.horaSalida = horaSalida;
	}

	public HorarioDTO(int chorario, int cdia, int chora) {
		super();
		this.idGrupoHorario = chorario;
		this.idDia = cdia;
		this.idHora = chora;
	}

	public int getIdGrupoHorario() {
		return idGrupoHorario;
	}
	public void setIdGrupoHorario(int idGrupoHorario) {
		this.idGrupoHorario = idGrupoHorario;
	} int getIdDia() {
		return idDia;
	}
	public void setIdDia(int idDia) {
		this.idDia = idDia;
	}
	public String getNomDia() {
		return nomDia;
	}
	public void setNomDia(String nomDia) {
		this.nomDia = nomDia;
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
		this.horaInicio = horaSalida;
	}
	
	
}
