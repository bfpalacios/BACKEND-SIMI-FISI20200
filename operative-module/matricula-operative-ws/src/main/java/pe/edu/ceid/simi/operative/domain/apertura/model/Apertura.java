package pe.edu.ceid.simi.operative.domain.apertura.model;

public class Apertura {
	private int idApertura;
	private String codEstudiante;
	private int idCurso;
	private int idHorarioGrupohorario;
	
	public Apertura() {}
	
	public Apertura(int idApertura, String codEstudiante, int idCurso, int idHorarioGrupohorario) {
		super();
		this.idApertura = idApertura;
		this.codEstudiante = codEstudiante;
		this.idCurso = idCurso;
		this.idHorarioGrupohorario = idHorarioGrupohorario;
	}

	public int getIdApertura() {
		return idApertura;
	}

	public void setIdApertura(int idApertura) {
		this.idApertura = idApertura;
	}

	public String getCodEstudiante() {
		return codEstudiante;
	}

	public void setCodEstudiante(String codEstudiante) {
		this.codEstudiante = codEstudiante;
	}

	public int getIdCurso() {
		return idCurso;
	}

	public void setIdCurso(int idCurso) {
		this.idCurso = idCurso;
	}

	public int getIdHorarioGrupohorario() {
		return idHorarioGrupohorario;
	}

	public void setIdHorarioGrupohorario(int idHorarioGrupohorario) {
		this.idHorarioGrupohorario = idHorarioGrupohorario;
	}
	
	
}
