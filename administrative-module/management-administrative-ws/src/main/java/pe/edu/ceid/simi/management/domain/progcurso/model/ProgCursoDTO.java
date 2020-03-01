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
	private int ciclo;
	private int idAula;
	private String nomAula;
	private String nomSede;
	private int idHorarioGrupoHorario;
	private String nomGrupoHorario;
	private String horaInicio;
	private String horaSalida;
	private int idEstadoProgCurso;
	private String nomEstado;

	private int idSede, idPeriodo , idCurso;
	private String codDocenteCI;
	
	public ProgCursoDTO() {}

	public ProgCursoDTO(int idProgCurso, int idProgDocCur, String nombre, String apellidoPat, String apellidoMat,
			String nomIdioma, String nomNivel, String nomPeriodo, int ciclo, int idAula, String nomAula, String nomSede,
			int idHorarioGrupoHorario, String nomGrupoHorario, String horaInicio, String horaSalida,
			int idEstadoProgCurso, String nomEstado) {
		super();
		this.idProgCurso = idProgCurso;
		this.idProgDocCur = idProgDocCur;
		this.nombre = nombre;
		this.apellidoPat = apellidoPat;
		this.apellidoMat = apellidoMat;
		this.nomIdioma = nomIdioma;
		this.nomNivel = nomNivel;
		this.nomPeriodo = nomPeriodo;
		this.ciclo = ciclo;
		this.idAula = idAula;
		this.nomAula = nomAula;
		this.nomSede = nomSede;
		this.idHorarioGrupoHorario = idHorarioGrupoHorario;
		this.nomGrupoHorario = nomGrupoHorario;
		this.horaInicio = horaInicio;
		this.horaSalida = horaSalida;
		this.idEstadoProgCurso = idEstadoProgCurso;
		this.nomEstado = nomEstado;
	}
	

	public ProgCursoDTO(int idProgCurso, int idProgDocCur, String nombre, String apellidoPat, String apellidoMat,
			String nomIdioma, String nomNivel, String nomPeriodo, int ciclo, int idAula, String nomAula, String nomSede,
			int idHorarioGrupoHorario, String nomGrupoHorario, int idEstadoProgCurso, String nomEstado) {
		super();
		this.idProgCurso = idProgCurso;
		this.idProgDocCur = idProgDocCur;
		this.nombre = nombre;
		this.apellidoPat = apellidoPat;
		this.apellidoMat = apellidoMat;
		this.nomIdioma = nomIdioma;
		this.nomNivel = nomNivel;
		this.nomPeriodo = nomPeriodo;
		this.ciclo = ciclo;
		this.idAula = idAula;
		this.nomAula = nomAula;
		this.nomSede = nomSede;
		this.idHorarioGrupoHorario = idHorarioGrupoHorario;
		this.nomGrupoHorario = nomGrupoHorario;
		this.idEstadoProgCurso = idEstadoProgCurso;
		this.nomEstado = nomEstado;
	}
	
	public ProgCursoDTO(int idProgCurso, int idProgDocCur, int idAula, int idHorarioGrupoHorario, int idEstadoProgCurso) {
		super();
		this.idProgCurso = idProgCurso;
		this.idProgDocCur = idProgDocCur;
		this.idAula = idAula;
		this.idHorarioGrupoHorario = idHorarioGrupoHorario;
		this.idEstadoProgCurso = idEstadoProgCurso;
	}
	
	
	
	public ProgCursoDTO(int idProgCurso, int idProgDocCur, String nombre, String apellidoPat, String apellidoMat,
			String nomIdioma, String nomNivel, String nomPeriodo, int ciclo, int idAula, String nomAula, String nomSede,
			int idHorarioGrupoHorario, String nomGrupoHorario, String horaInicio, String horaSalida,
			int idEstadoProgCurso, String nomEstado, int idSede, int idPeriodo, int idCurso, String codDocenteCI) {
		super();
		this.idProgCurso = idProgCurso;
		this.idProgDocCur = idProgDocCur;
		this.nombre = nombre;
		this.apellidoPat = apellidoPat;
		this.apellidoMat = apellidoMat;
		this.nomIdioma = nomIdioma;
		this.nomNivel = nomNivel;
		this.nomPeriodo = nomPeriodo;
		this.ciclo = ciclo;
		this.idAula = idAula;
		this.nomAula = nomAula;
		this.nomSede = nomSede;
		this.idHorarioGrupoHorario = idHorarioGrupoHorario;
		this.nomGrupoHorario = nomGrupoHorario;
		this.horaInicio = horaInicio;
		this.horaSalida = horaSalida;
		this.idEstadoProgCurso = idEstadoProgCurso;
		this.nomEstado = nomEstado;
		this.idSede = idSede;
		this.idPeriodo = idPeriodo;
		this.idCurso = idCurso;
		this.codDocenteCI = codDocenteCI;
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
	public int getCiclo() {
		return ciclo;
	}
	public void setCiclo(int ciclo) {
		this.ciclo = ciclo;
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
	public int getIdHorarioGrupoHorario() {
		return idHorarioGrupoHorario;
	}
	public void setIdHorarioGrupoHorario(int idHorarioGrupoHorario) {
		this.idHorarioGrupoHorario = idHorarioGrupoHorario;
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

	public String getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(String horaInicio) {
		this.horaInicio = horaInicio;
	}
	public String getHoraSalida() {
		return horaSalida;
	}
	public void setHoraSalida(String horaSalida) {
		this.horaSalida = horaSalida;
	}

	public int getIdSede() {
		return idSede;
	}

	public void setIdSede(int idSede) {
		this.idSede = idSede;
	}

	public int getIdPeriodo() {
		return idPeriodo;
	}

	public void setIdPeriodo(int idPeriodo) {
		this.idPeriodo = idPeriodo;
	}

	public int getIdCurso() {
		return idCurso;
	}

	public void setIdCurso(int idCurso) {
		this.idCurso = idCurso;
	}

	public String getCodDocenteCI() {
		return codDocenteCI;
	}

	public void setCodDocenteCI(String codDocenteCI) {
		this.codDocenteCI = codDocenteCI;
	}
	
	
	
	
	
}
