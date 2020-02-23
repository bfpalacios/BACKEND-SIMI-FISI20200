package pe.edu.ceid.simi.operative.domain.matricula.model;

public class Matricula {
	private int idMatricula;
	private int codEstudiante;
	private int idProgcurso;
	private int numvouvher;
	private int estadoMat;
	private String fechaMat;
	
	public Matricula(int idMatricula, int codEstudiante, int idProgcurso, int numvouvher, int estadoMat,
			String fechaMat) {
		super();
		this.idMatricula = idMatricula;
		this.codEstudiante = codEstudiante;
		this.idProgcurso = idProgcurso;
		this.numvouvher = numvouvher;
		this.estadoMat = estadoMat;
		this.fechaMat = fechaMat;
	}

	public int getIdMatricula() {
		return idMatricula;
	}

	public void setIdMatricula(int idMatricula) {
		this.idMatricula = idMatricula;
	}

	public int getCodEstudiante() {
		return codEstudiante;
	}

	public void setCodEstudiante(int codEstudiante) {
		this.codEstudiante = codEstudiante;
	}

	public int getIdProgcurso() {
		return idProgcurso;
	}

	public void setIdProgcurso(int idProgcurso) {
		this.idProgcurso = idProgcurso;
	}

	public int getNumvouvher() {
		return numvouvher;
	}

	public void setNumvouvher(int numvouvher) {
		this.numvouvher = numvouvher;
	}

	public int getEstadoMat() {
		return estadoMat;
	}

	public void setEstadoMat(int estadoMat) {
		this.estadoMat = estadoMat;
	}

	public String getFechaMat() {
		return fechaMat;
	}

	public void setFechaMat(String fechaMat) {
		this.fechaMat = fechaMat;
	}

}
