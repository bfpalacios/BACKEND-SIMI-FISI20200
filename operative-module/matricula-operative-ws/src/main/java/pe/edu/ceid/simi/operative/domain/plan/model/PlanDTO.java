package pe.edu.ceid.simi.operative.domain.plan.model;

public class PlanDTO {
	private int idCurso;
	private int idIdioma;
	private int idNivel;
	private int ciclo;
	private String nomIdioma;
	private String nomNivel;
	private int countCiclo;
	private String libro;
	
	public PlanDTO(int idCurso, int idIdioma, int idNivel, int ciclo, String nomIdioma, String nomNivel, int countCiclo,
			String libro) {
		super();
		this.idCurso = idCurso;
		this.idIdioma = idIdioma;
		this.idNivel = idNivel;
		this.ciclo = ciclo;
		this.nomIdioma = nomIdioma;
		this.nomNivel = nomNivel;
		this.countCiclo = countCiclo;
		this.libro = libro;
	}

	public int getIdCurso() {
		return idCurso;
	}

	public void setIdCurso(int idCurso) {
		this.idCurso = idCurso;
	}

	public int getIdIdioma() {
		return idIdioma;
	}

	public void setIdIdioma(int idIdioma) {
		this.idIdioma = idIdioma;
	}

	public int getIdNivel() {
		return idNivel;
	}

	public void setIdNivel(int idNivel) {
		this.idNivel = idNivel;
	}

	public int getCiclo() {
		return ciclo;
	}

	public void setCiclo(int ciclo) {
		this.ciclo = ciclo;
	}

	public String getNomIdioma() {
		return nomIdioma;
	}

	public void setNomIdioma(String nomIdioma) {
		this.nomIdioma = nomIdioma;
	}

	public String getNomNivel() {
		return nomNivel;
	}

	public void setNomNivel(String nomNivel) {
		this.nomNivel = nomNivel;
	}

	public int getCountCiclo() {
		return countCiclo;
	}

	public void setCountCiclo(int countCiclo) {
		this.countCiclo = countCiclo;
	}

	public String getLibro() {
		return libro;
	}

	public void setLibro(String libro) {
		this.libro = libro;
	}
	
}
