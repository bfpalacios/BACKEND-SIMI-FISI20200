package pe.edu.ceid.simi.operative.domain.apertura.model;

public class AperturaDTO {
	private int idApertura;
	private String codEstudiante;
	private int idCurso;
	private int idGrupohorario;
	private int idIdioma;
	private int idNivel;
	private String nomIdioma;
	private String nomNivel;
	private int ciclo;
	private String nomGrupoHorario;
	private String hora;
	private int solicitantes;
	
	public AperturaDTO(int idApertura, String codEstudiante, int idCurso, int idGrupohorario, int idIdioma, int idNivel,
			String nomIdioma, String nomNivel, int ciclo, String nomGrupoHorario, String hora, int solicitantes) {
		super();
		this.idApertura = idApertura;
		this.codEstudiante = codEstudiante;
		this.idCurso = idCurso;
		this.idGrupohorario = idGrupohorario;
		this.idIdioma = idIdioma;
		this.idNivel = idNivel;
		this.nomIdioma = nomIdioma;
		this.nomNivel = nomNivel;
		this.ciclo = ciclo;
		this.nomGrupoHorario = nomGrupoHorario;
		this.hora = hora;
		this.solicitantes = solicitantes;
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

	public int getIdGrupohorario() {
		return idGrupohorario;
	}

	public void setIdGrupohorario(int idGrupohorario) {
		this.idGrupohorario = idGrupohorario;
	}

	public int getIdIdioma() {
		return idIdioma;
	}

	public void setIdIdioma(int idIdioma) {
		this.idIdioma = idIdioma;
	}

	public int getIdNivel() {
		return idNivel;
	}

	public void setIdNivel(int idNivel) {
		this.idNivel = idNivel;
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

	public String getNomGrupoHorario() {
		return nomGrupoHorario;
	}

	public void setNomGrupoHorario(String nomGrupoHorario) {
		this.nomGrupoHorario = nomGrupoHorario;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public int getSolicitantes() {
		return solicitantes;
	}

	public void setSolicitantes(int solicitantes) {
		this.solicitantes = solicitantes;
	}


}
