package pe.edu.ceid.simi.operative.domain.curso.model;

public class CursoDTO {
	private int idCurso;
	private int ciclo;
	private String nombreCurso;
	private String nombreDocente;
	

	public CursoDTO(int idCurso, int ciclo, String nombreCurso, String nombreDocente) {
		super();
		this.idCurso = idCurso;
		this.ciclo = ciclo;
		this.nombreCurso = nombreCurso;
		this.nombreDocente = nombreDocente;
	}

	public int getIdCurso() {
		return idCurso;
	}

	public void setIdCurso(int idCurso) {
		this.idCurso = idCurso;
	}

	public String getNombreCurso() {
		return nombreCurso;
	}

	public void setNombreCurso(String nombreCurso) {
		this.nombreCurso = nombreCurso;
	}

	public String getNombreDocente() {
		return nombreDocente;
	}

	public void setNombreDocente(String nombreDocente) {
		this.nombreDocente = nombreDocente;
	}

	public int getCiclo() {
		return ciclo;
	}

	public void setCiclo(int ciclo) {
		this.ciclo = ciclo;
	}
	
}
