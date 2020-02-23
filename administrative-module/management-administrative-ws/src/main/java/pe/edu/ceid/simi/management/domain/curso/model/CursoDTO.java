package pe.edu.ceid.simi.management.domain.curso.model;

public class CursoDTO {
	
	private int idCurso;
	private int idIdioma;
	private String nomIdioma;	// idIdioma;
	private int idNivel;
	private String nomNivel;	//idNivel;
	private int ciclo;
	private String libro;
	
	public CursoDTO(int ccurso, int cidioma, String nomIdioma, int cnivel, String nomNivel,
			int ciclo, String libro) {
		super();
		this.idCurso = ccurso;
		this.idIdioma = cidioma;
		this.nomIdioma = nomIdioma;
		this.idNivel = cnivel;
		this.nomNivel = nomNivel;
		this.ciclo = ciclo;
		this.libro = libro;
	}

	public CursoDTO() {
		super();
	}

	public int getIdCurso() {
		return idCurso;
	}
	public void setIdCurso(int ccurso) {
		this.idCurso = ccurso;
	}
	public int getidIdioma() {
		return idIdioma;
	}
	public void setidIdioma(int cidioma) {
		this.idIdioma = cidioma;
	}
	public String getNomIdioma() {
		return nomIdioma;
	}
	public void setNomIdioma(String nomIdioma) {
		this.nomIdioma = nomIdioma;
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
	public int getCiclo() {
		return ciclo;
	}
	public void setCiclo(int ciclo) {
		this.ciclo = ciclo;
	}
	public String getLibro() {
		return libro;
	}
	public void setLibro(String libro) {
		this.libro = libro;
	}
	
}
