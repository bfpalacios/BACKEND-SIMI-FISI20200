package pe.edu.ceid.simi.management.domain.nivel.model;

public class Nivel {

	private int idNivel;
	private String nomNivel;
	
	public Nivel(int idNivel, String nomNivel) {
		super();
		this.idNivel = idNivel;
		this.nomNivel = nomNivel;
	}

	public int getIdNivel() {
		return idNivel;
	}
	public void setIdNivel(int cnivel) {
		this.idNivel = cnivel;
	}
	public String getNomNivel() {
		return nomNivel;
	}
	public void setNomNivel(String nomNivel) {
		this.nomNivel = nomNivel;
	}
	
}
