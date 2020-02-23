package pe.edu.ceid.simi.operative.domain.hora.model;

public class Hora {
	private int idHora;
	private String horaInicio;
	private String horaSalida;
	
	public Hora(int idHora, String horaInicio, String horaSalida) {
		super();
		this.idHora = idHora;
		this.horaInicio = horaInicio;
		this.horaSalida = horaSalida;
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
