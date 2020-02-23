package pe.edu.ceid.simi.management.domain.diasclase.model;

public class DiasClase {

	private int idDia;
	private String nomDia;

	public DiasClase() {}

	public DiasClase(int cdia, String nomDia) {
		super();
		this.idDia = cdia;
		this.nomDia = nomDia;
	}
	
	public int getIdDia() {
		return idDia;
	}
	public void setIdDia(int cdia) {
		this.idDia = cdia;
	}
	public String getNomDia() {
		return nomDia;
	}
	public void setNomDia(String nomDia) {
		this.nomDia = nomDia;
	}
	
}
