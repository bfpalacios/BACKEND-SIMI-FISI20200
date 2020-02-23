package pe.edu.ceid.simi.operative.domain.nivel.model;

public class NivelDTO {
	private int idNivel;
	private String nomNivel;
	
	public NivelDTO(int idNivel, String nomNivel) {
		super();
		this.idNivel = idNivel;
		this.nomNivel = nomNivel;
	}

	public int getIdNivel() {
		return idNivel;
	}

	public void setIdNivel(int idNivel) {
		this.idNivel = idNivel;
	}

	public String getNomNivel() {
		return nomNivel;
	}

	public void setNomNivel(String nomNivel) {
		this.nomNivel = nomNivel;
	}
}
