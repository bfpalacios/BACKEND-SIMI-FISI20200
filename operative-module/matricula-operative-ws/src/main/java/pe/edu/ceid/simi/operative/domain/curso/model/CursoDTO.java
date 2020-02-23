package pe.edu.ceid.simi.operative.domain.curso.model;

public class CursoDTO {
	private int idCurso;
	private int ciclo;
	
	public CursoDTO(int idCurso, int ciclo) {
		super();
		this.idCurso = idCurso;
		this.ciclo = ciclo;
	}

	public int getIdCurso() {
		return idCurso;
	}

	public void setIdCurso(int idCurso) {
		this.idCurso = idCurso;
	}

	public int getCiclo() {
		return ciclo;
	}

	public void setCiclo(int ciclo) {
		this.ciclo = ciclo;
	}
	
}
