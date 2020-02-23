package pe.edu.ceid.simi.management.domain.curso.model;


public class Curso {

	private int idCurso;
	private int idIdioma;
	private int idNivel;
	private int ciclo;
	private String libro;
	
	public Curso(int ccurso, int cidioma, int cnivel, int ciclo, String libro) {
		super();
		this.idCurso = ccurso;
		this.idIdioma = cidioma;
		this.idNivel = cnivel;
		this.ciclo = ciclo;
		this.libro = libro;
	}
	
	public Curso(int ccurso, int cidioma, int cnivel, int ciclo) {
		super();
		this.idCurso = ccurso;
		this.idIdioma = cidioma;
		this.idNivel = cnivel;
		this.ciclo = ciclo;
	}
	
	public Curso() {
		super();
	}

	public int getIdCurso() {
		return idCurso;
	}
	public void setIdCurso(int ccurso) {
		this.idCurso = ccurso;
	}
	public int getIdIdioma() {
		return idIdioma;
	}
	public void setIdIdioma(int cidioma) {
		this.idIdioma = cidioma;
	}
	public int getIdNivel() {
		return idNivel;
	}
	public void setIdNivel(int cnivel) {
		this.idNivel = cnivel;
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
