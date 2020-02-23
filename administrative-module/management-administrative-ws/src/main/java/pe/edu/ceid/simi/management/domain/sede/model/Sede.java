package pe.edu.ceid.simi.management.domain.sede.model;

public class Sede {

	private int idSede;
	private String nomSede;
	private String descSede;
	private String dirSede;
		
	public Sede(int idSede, String nomSede, String descSede, String dirSede) {
		super();
		this.idSede = idSede;
		this.nomSede = nomSede;
		this.descSede = descSede;
		this.dirSede = dirSede;
	}
	
	public int getIdSede() {
		return idSede;
	}
	public void setIdSede(int csede) {
		this.idSede = csede;
	}
	public String getDescSede() {
		return descSede;
	}
	public void setDescSede(String descSede) {
		this.descSede = descSede;
	}
	public String getNomSede() {
		return nomSede;
	}
	public void setNomSede(String nomSede) {
		this.nomSede = nomSede;
	}
	public String getDirSede() {
		return dirSede;
	}
	public void setDirSede(String dirSede) {
		this.dirSede = dirSede;
	}
	
}
