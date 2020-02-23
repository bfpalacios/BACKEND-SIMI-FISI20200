package pe.edu.ceid.simi.management.domain.horasclase.model;

public class HorasClase {

	private int idHora;
	private String horaInicio;
	private String horaSalida;

	public HorasClase() {}

	public HorasClase(int chora, String horaInicio, String horaSalida) {
		super();
		this.idHora = chora;
		this.horaInicio = horaInicio;
		this.horaSalida = horaSalida;
	}

	public int getIdHora() {
		return idHora;
	}
	public void setIdHora(int chora) {
		this.idHora = chora;
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
