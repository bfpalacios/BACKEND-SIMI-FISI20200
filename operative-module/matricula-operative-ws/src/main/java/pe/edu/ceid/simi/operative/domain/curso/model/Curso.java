package pe.edu.ceid.simi.operative.domain.curso.model;

public class Curso {
	private int idCurso;
	private int idIdioma;
	private int idNivel;
	private int ciclo;
	
	public Curso(int idCurso, int idIdioma, int idNivel, int ciclo) {
		super();
		this.idCurso = idCurso;
		this.idIdioma = idIdioma;
		this.idNivel = idNivel;
		this.ciclo = ciclo;
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
	
}
