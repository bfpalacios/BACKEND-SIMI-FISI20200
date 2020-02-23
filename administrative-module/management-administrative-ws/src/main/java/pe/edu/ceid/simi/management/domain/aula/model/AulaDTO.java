package pe.edu.ceid.simi.management.domain.aula.model;


public class AulaDTO {

	private int idAula;
	private String nomAula;
	private String refAula;
	private int idSede;
	private String nomSede;
	
	public AulaDTO(int idAula, String nomAula, String refAula, int idSede, String nomSede) {
		super();
		this.idAula = idAula;
		this.nomAula = nomAula;
		this.refAula = refAula;
		this.idSede = idSede;
		this.nomSede = nomSede;
	}
	
	public AulaDTO() {
		super();
	}

	public int getIdAula() {
		return idAula;
	}
	public void setIdAula(int idAula) {
		this.idAula = idAula;
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
	public int getIdSede() {
		return idSede;
	}
	public void setIdSede(int idSede) {
		this.idSede = idSede;
	}
	public String getNomSede() {
		return nomSede;
	}
	public void setNomSede(String nomSede) {
		this.nomSede = nomSede;
	}
	
}
