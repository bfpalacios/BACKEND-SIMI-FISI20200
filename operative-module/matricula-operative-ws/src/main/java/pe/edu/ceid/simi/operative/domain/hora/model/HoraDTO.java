package pe.edu.ceid.simi.operative.domain.hora.model;

public class HoraDTO {
	private int idHorario;
	private String horario;
	
	public HoraDTO(int idHorario, String horario) {
		super();
		this.idHorario = idHorario;
		this.horario = horario;
	}
	
	public int getIdHorario() {
		return idHorario;
	}
	public void setIdHorario(int idHorario) {
		this.idHorario = idHorario;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}

}
