package pe.edu.ceid.simi.management.domain.rol.model;

public class Rol {

	private int idRol;
	private String nomRol;
	private String descRol;

	public Rol() {}

	public Rol(int idRol, String nomRol, String descRol) {
		super();
		this.idRol = idRol;
		this.nomRol = nomRol;
		this.descRol = descRol;
	}
	
	public int getIdRol() {
		return idRol;
	}
	public void setIdRol(int idRol) {
		this.idRol = idRol;
	}
	public String getNomRol() {
		return nomRol;
	}
	public void setNomRol(String nomRol) {
		this.nomRol = nomRol;
	}
	public String getDescRol() {
		return descRol;
	}
	public void setDescRol(String descRol) {
		this.descRol = descRol;
	}
	
}
