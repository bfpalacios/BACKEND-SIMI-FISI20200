package pe.edu.ceid.simi.operative.domain.matricula.model;

public class MatriculaDTO {
	private int idMatricula;
	private int codEstudiante;
	private int idProgcurso;
	private int numvouvher;
	private int estadoMat;
	private String fechaMat;
	private String nomEstado;
	private String nomIdioma;
	private String nomNivel;
	private String nomDocente;
	private String appatDocente;
	private String apmatDocente;
	private String nomGrupoH;
	private String horaInicio;
	private String horaFin;
	
	public MatriculaDTO(int idMatricula, int codEstudiante, int idProgcurso, int numvouvher, int estadoMat,
			String fechaMat, String nomEstado, String nomIdioma, String nomNivel, String nomDocente, String appatDocente,
			String apmatDocente, String nomGrupoH, String horaInicio, String horaFin) {
		super();
		this.idMatricula = idMatricula;
		this.codEstudiante = codEstudiante;
		this.idProgcurso = idProgcurso;
		this.numvouvher = numvouvher;
		this.estadoMat = estadoMat;
		this.fechaMat = fechaMat;
		this.nomEstado = nomEstado;
		this.nomIdioma = nomIdioma;
		this.nomNivel = nomNivel;
		this.nomDocente = nomDocente;
		this.appatDocente = appatDocente;
		this.apmatDocente = apmatDocente;
		this.nomGrupoH = nomGrupoH;
		this.horaInicio = horaInicio;
		this.horaFin = horaFin;
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

	public String getNomEstado() {
		return nomEstado;
	}

	public void setNomEstado(String nomEstado) {
		this.nomEstado = nomEstado;
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

	public String getNomDocente() {
		return nomDocente;
	}

	public void setNomDocente(String nomDocente) {
		this.nomDocente = nomDocente;
	}

	public String getAppatDocente() {
		return appatDocente;
	}

	public void setAppatDocente(String appatDocente) {
		this.appatDocente = appatDocente;
	}

	public String getApmatDocente() {
		return apmatDocente;
	}

	public void setApmatDocente(String apmatDocente) {
		this.apmatDocente = apmatDocente;
	}

	public String getNomGrupoH() {
		return nomGrupoH;
	}

	public void setNomGrupoH(String nomGrupoH) {
		this.nomGrupoH = nomGrupoH;
	}

	public String getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(String horaInicio) {
		this.horaInicio = horaInicio;
	}

	public String getHoraFin() {
		return horaFin;
	}

	public void setHoraFin(String horaFin) {
		this.horaFin = horaFin;
	}
	
}
