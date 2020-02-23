package pe.edu.ceid.simi.management.domain.progdoccurso.model;

public class ProgDocCurso {

	private int idProgDocCur;
	private String idDocente;
	private int idCurso;
	private int tiene;

	public ProgDocCurso() {}

	public ProgDocCurso(int idProgDocCur, String idDocente, int idCurso, int idPeriodo) {
		super();
		this.idProgDocCur = idProgDocCur;
		this.idDocente = idDocente;
		this.idCurso = idCurso;
		this.idPeriodo = idPeriodo;
	}
	
	public int getIdProgDocCur() {
		return idProgDocCur;
	}
	public void setIdProgDocCur(int idProgDocCur) {
		this.idProgDocCur = idProgDocCur;
	}
	public String getIdDocente() {
		return idDocente;
	}
	public void setIdDocente(String idDocente) {
		this.idDocente = idDocente;
	}
	public int getIdCurso() {
		return idCurso;
	}
	public void setIdCurso(int idCurso) {
		this.idCurso = idCurso;
	}
	public int getIdPeriodo() {
		return idPeriodo;
	}
	public void setIdPeriodo(int idPeriodo) {
		this.idPeriodo = idPeriodo;
	}
	
}
