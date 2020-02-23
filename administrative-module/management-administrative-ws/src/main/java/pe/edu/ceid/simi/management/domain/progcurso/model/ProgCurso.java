package pe.edu.ceid.simi.management.domain.progcurso.model;

public class ProgCurso {
	
	private int idProgCurso;
	private int idProgDocCur;
	private Integer idAula;
	private int idHorarioGrupoHorario;
	private int idEstadoProgCurso;

	public ProgCurso() {}

	public ProgCurso(int idProgCurso, int idProgDocCur, Integer idAula, int idHorarioGrupoHorario, int idEstadoProgCurso) {
		super();
		this.idProgCurso = idProgCurso;
		this.idProgDocCur = idProgDocCur;
		this.idAula = idAula;
		this.idHorarioGrupoHorario = idHorarioGrupoHorario;
		this.idEstadoProgCurso = idEstadoProgCurso;
	}
	
	public int getIdProgCurso() {
		return idProgCurso;
	}
	public void setIdProgCurso(int idProgCurso) {
		this.idProgCurso = idProgCurso;
	}
	public int getIdProgDocCur() {
		return idProgDocCur;
	}
	public void setIdProgDocCur(int idProgDocCur) {
		this.idProgDocCur = idProgDocCur;
	}
	public Integer getIdAula() {
		return idAula;
	}
	public void setIdAula(Integer idAula) {
		this.idAula = idAula;
	}
	public int getIdHorarioGrupoHorario() {
		return idHorarioGrupoHorario;
	}
	public void setIdHorarioGrupoHorario(int idHorarioGrupoHorario) {
		this.idHorarioGrupoHorario = idHorarioGrupoHorario;
	}
	public int getIdEstadoProgCurso() {
		return idEstadoProgCurso;
	}
	public void setIdEstadoProgCurso(int idEstadoProgCurso) {
		this.idEstadoProgCurso = idEstadoProgCurso;
	}
	
}
