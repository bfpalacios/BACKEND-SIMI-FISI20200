package pe.edu.ceid.simi.management.domain.matricula.model;

public class MatriculaDTO {

	private int idMatricula;
	private int codEstudiante;
	private String nombreEstudiante;
	private String apellidoPatEstudiante;
	private String apellidoMatEstudiante;
	private int idProgCurso;
	private String nombreDocente;
	private String apellidoPatDocente;
	private String apellidoMatDocente;
	private String nomIdioma;		// cidioma;
	private String nomNivel ;		// cnivel;
	private String nomPeriodo;		// cperiodo
	private String nomAula;
	private String nomSede;
	private String nomGrupoHorario;
	private String nomEstadoProgCurso;
	private int numVoucher;
	private int idEstadoMatricula;
	private String nomEstadoMatricula;
	
	public MatriculaDTO(int idMatricula, int codEstudiante, String nombreEstudiante, String apellidoPatEstudiante,
			String apellidoMatEstudiante, int idProgCurso, String nombreDocente, String apellidoPatDocente,
			String apellidoMatDocente, String nomIdioma, String nomNivel, String nomPeriodo, String nomAula,
			String nomSede, String nomGrupoHorario, String nomEstadoProgCurso, int numVoucher, int idEstadoMatricula,
			String nomEstadoMatricula) {
		super();
		this.idMatricula = idMatricula;
		this.codEstudiante = codEstudiante;
		this.nombreEstudiante = nombreEstudiante;
		this.apellidoPatEstudiante = apellidoPatEstudiante;
		this.apellidoMatEstudiante = apellidoMatEstudiante;
		this.idProgCurso = idProgCurso;
		this.nombreDocente = nombreDocente;
		this.apellidoPatDocente = apellidoPatDocente;
		this.apellidoMatDocente = apellidoMatDocente;
		this.nomIdioma = nomIdioma;
		this.nomNivel = nomNivel;
		this.nomPeriodo = nomPeriodo;
		this.nomAula = nomAula;
		this.nomSede = nomSede;
		this.nomGrupoHorario = nomGrupoHorario;
		this.nomEstadoProgCurso = nomEstadoProgCurso;
		this.numVoucher = numVoucher;
		this.idEstadoMatricula = idEstadoMatricula;
		this.nomEstadoMatricula = nomEstadoMatricula;
	}

	public MatriculaDTO(int idMatricula, int codEstudiante, int idProgCurso, int numVoucher, int isEstadoMatricula) {
		super();
		this.idMatricula = idMatricula;
		this.codEstudiante = codEstudiante;
		this.idProgCurso = idProgCurso;
		this.numVoucher = numVoucher;
		this.idEstadoMatricula = isEstadoMatricula;
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
	public String getNombreEstudiante() {
		return nombreEstudiante;
	}
	public void setNombreEstudiante(String nombreEstudiante) {
		this.nombreEstudiante = nombreEstudiante;
	}
	public String getApellidoPatEstudiante() {
		return apellidoPatEstudiante;
	}
	public void setApellidoPatEstudiante(String apellidoPatEstudiante) {
		this.apellidoPatEstudiante = apellidoPatEstudiante;
	}
	public String getApellidoMatEstudiante() {
		return apellidoMatEstudiante;
	}
	public void setApellidoMatEstudiante(String apellidoMatEstudiante) {
		this.apellidoMatEstudiante = apellidoMatEstudiante;
	}
	public int getIdProgCurso() {
		return idProgCurso;
	}
	public void setIdProgCurso(int idProgCurso) {
		this.idProgCurso = idProgCurso;
	}
	public String getNombreDocente() {
		return nombreDocente;
	}
	public void setNombreDocente(String nombreDocente) {
		this.nombreDocente = nombreDocente;
	}
	public String getApellidoPatDocente() {
		return apellidoPatDocente;
	}
	public void setApellidoPatDocente(String apellidoPatDocente) {
		this.apellidoPatDocente = apellidoPatDocente;
	}
	public String getApellidoMatDocente() {
		return apellidoMatDocente;
	}
	public void setApellidoMatDocente(String apellidoMatDocente) {
		this.apellidoMatDocente = apellidoMatDocente;
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
	public String getNomGrupoHorario() {
		return nomGrupoHorario;
	}
	public void setNomGrupoHorario(String nomGrupoHorario) {
		this.nomGrupoHorario = nomGrupoHorario;
	}
	public String getNomEstadoProgCurso() {
		return nomEstadoProgCurso;
	}
	public void setNomEstadoProgCurso(String nomEstadoProgCurso) {
		this.nomEstadoProgCurso = nomEstadoProgCurso;
	}
	public int getNumVoucher() {
		return numVoucher;
	}
	public void setNumVoucher(int numVoucher) {
		this.numVoucher = numVoucher;
	}
	public int getIdEstadoMatricula() {
		return idEstadoMatricula;
	}
	public void setIdEstadoMatricula(int idEstadoMatricula) {
		this.idEstadoMatricula = idEstadoMatricula;
	}
	public String getNomEstadoMatricula() {
		return nomEstadoMatricula;
	}
	public void setNomEstadoMatricula(String nomEstadoMatricula) {
		this.nomEstadoMatricula = nomEstadoMatricula;
	}
	
}
