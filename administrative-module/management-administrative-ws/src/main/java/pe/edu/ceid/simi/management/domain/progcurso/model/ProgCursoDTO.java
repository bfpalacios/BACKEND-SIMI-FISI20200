package pe.edu.ceid.simi.management.domain.progcurso.model;

public class ProgCursoDTO {
	
	private int idProgCurso;
	private int idProgDocCur;
	private String nombre;
	private String apellidoPat;
	private String apellidoMat;
	private String nomIdioma;		// cidioma;
	private String nomNivel ;		// cnivel;
	private String nomPeriodo;		// cperiodo
	private int idAula;
	private String nomAula;
	private String nomSede;
	private int idGrupoHorario;
	private String nomGrupoHorario;
	private int idEstadoProgCurso;
	private String nomEstado;

	public ProgCursoDTO(int idProgCurso, int idProgDocCur, String nombre, String apellidoPat, String apellidoMat,
			String nomIdioma, String nomNivel, String nomPeriodo, int idAula, String nomAula, String nomSede, int idGrupoHorario,
			String nomGrupoHorario, int idEstadoProgCurso, String nomEstado) {
		super();
		this.idProgCurso = idProgCurso;
		this.idProgDocCur = idProgDocCur;
		this.nombre = nombre;
		this.apellidoPat = apellidoPat;
		this.apellidoMat = apellidoMat;
		this.nomIdioma = nomIdioma;
		this.nomNivel = nomNivel;
		this.nomPeriodo = nomPeriodo;
		this.idAula = idAula;
		this.nomAula = nomAula;
		this.nomSede = nomSede;
		this.idGrupoHorario = idGrupoHorario;
		this.nomGrupoHorario = nomGrupoHorario;
		this.idEstadoProgCurso = idEstadoProgCurso;
		this.nomEstado = nomEstado;
	}
	
	public ProgCursoDTO(int idProgCurso, int idProgDocCur, int idAula, int idGrupoHorario, int idEstadoProgCurso) {
		super();
		this.idProgCurso = idProgCurso;
		this.idProgDocCur = idProgDocCur;
		this.idAula = idAula;
		this.idGrupoHorario = idGrupoHorario;
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
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidoPat() {
		return apellidoPat;
	}
	public void setApellidoPat(String apellidoPat) {
		this.apellidoPat = apellidoPat;
	}
	public String getApellidoMat() {
		return apellidoMat;
	}
	public void setApellidoMat(String apellidoMat) {
		this.apellidoMat = apellidoMat;
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
	public String getNomPeriodo() {
		return nomPeriodo;
	}
	public void setNomPeriodo(String nomPeriodo) {
		this.nomPeriodo = nomPeriodo;
	}
	public int getIdAula() {
		return idAula;
	}
	public void setIdAula(int idAula) {
		this.idAula = idAula;
	}
	public String getNomAula() {
		return nomAula;
	}
	public void setNomAula(String nomAula) {
		this.nomAula = nomAula;
	}
	public String getNomSede() {
		return nomSede;
	}
	public void setNomSede(String nomSede) {
		this.nomSede = nomSede;
	}
	public int getIdGrupoHorario() {
		return idGrupoHorario;
	}
	public void setIdGrupoHorario(int idGrupoHorario) {
		this.idGrupoHorario = idGrupoHorario;
	}
	public String getNomGrupoHorario() {
		return nomGrupoHorario;
	}
	public void setNomGrupoHorario(String nomGrupoHorario) {
		this.nomGrupoHorario = nomGrupoHorario;
	}
	public int getIdEstadoProgCurso() {
		return idEstadoProgCurso;
	}
	public void setIdEstadoProgCurso(int idEstadoProgCurso) {
		this.idEstadoProgCurso = idEstadoProgCurso;
	}
	public String getNomEstado() {
		return nomEstado;
	}
	public void setNomEstado(String nomEstado) {
		this.nomEstado = nomEstado;
	}
	
}