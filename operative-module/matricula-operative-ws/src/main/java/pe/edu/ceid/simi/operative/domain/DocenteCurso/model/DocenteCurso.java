package pe.edu.ceid.simi.operative.domain.DocenteCurso.model;

public class DocenteCurso {

	private int idProg;
	private int idProgCurso;
	private int idUsuario;
	private int idAula;
	private int idHorarios;
	private int idEstado;
	private String nomIdioma;
	private String nomNivel;
	private int ciclo;
	private String hora;
	private int matriculados;
	
	public DocenteCurso(int idProg, int idProgCurso, int idUsuario, int idAula, int idHorarios, int idEstado,
			String nomIdioma, String nomNivel, int ciclo, String hora, int matriculados) {
		super();
		this.idProg = idProg;
		this.idProgCurso = idProgCurso;
		this.idUsuario = idUsuario;
		this.idAula = idAula;
		this.idHorarios = idHorarios;
		this.idEstado = idEstado;
		this.nomIdioma = nomIdioma;
		this.nomNivel = nomNivel;
		this.ciclo = ciclo;
		this.hora = hora;
		this.matriculados = matriculados;
	}

	public int getIdProg() {
		return idProg;
	}

	public void setIdProg(int idProg) {
		this.idProg = idProg;
	}

	public int getIdProgCurso() {
		return idProgCurso;
	}

	public void setIdProgCurso(int idProgCurso) {
		this.idProgCurso = idProgCurso;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public int getIdAula() {
		return idAula;
	}

	public void setIdAula(int idAula) {
		this.idAula = idAula;
	}

	public int getIdHorarios() {
		return idHorarios;
	}

	public void setIdHorarios(int idHorarios) {
		this.idHorarios = idHorarios;
	}

	public int getIdEstado() {
		return idEstado;
	}

	public void setIdEstado(int idEstado) {
		this.idEstado = idEstado;
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

	public int getCiclo() {
		return ciclo;
	}

	public void setCiclo(int ciclo) {
		this.ciclo = ciclo;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public int getMatriculados() {
		return matriculados;
	}

	public void setMatriculados(int matriculados) {
		this.matriculados = matriculados;
	}
	
	
}
