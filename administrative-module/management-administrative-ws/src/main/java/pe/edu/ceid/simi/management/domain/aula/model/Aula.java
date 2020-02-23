package pe.edu.ceid.simi.management.domain.aula.model;


public class Aula {

	private int idAula;
	private int idSede;
	private String nomAula;
	private String refAula;
		
	public Aula(int idAula, int idSede, String nomAula, String refAula) {
		super();
		this.idAula = idAula;
		this.idSede = idSede;
		this.nomAula = nomAula;
		this.refAula = refAula;
	}
	
	public Aula() {
		super();
	}

	public int getIdAula() {
		return idAula;
	}
	public void setIdAula(int idAula) {
		this.idAula = idAula;
	}
	public int getIdSede() {
		return idSede;
	}
	public void setIdSede(int idSede) {
		this.idSede = idSede;
	}
	public String getNomAula() {
		return nomAula;
	}
	public void setNomAula(String nomAula) {
		this.nomAula = nomAula;
	}
	public String getRefAula() {
		return refAula;
	}
	public void setRefAula(String refAula) {
		this.refAula = refAula;
	}
		
}
