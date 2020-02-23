package pe.edu.ceid.simi.operative.domain.programacion.model;

public class ProgramacionDTO {
	private int idpProgramacionCurso;
	private int idDocProg;
	private int idAula;
	private int idGrupohorario;
	private int estadoProg;
	private String nomIdioma;
	private String nomNivel;
	private int ciclo;
	private String docente;
	private String nomGrupoH;
	private String hora;
	private int matriculados;
	
	public ProgramacionDTO(int idpProgramacionCurso, int idDocProg, int idAula, int idGrupohorario, int estadoProg,
			String nomIdioma, String nomNivel, int ciclo, String docente, String nomGrupoH, String hora,
			int matriculados) {
		super();
		this.idpProgramacionCurso = idpProgramacionCurso;
		this.idDocProg = idDocProg;
		this.idAula = idAula;
		this.idGrupohorario = idGrupohorario;
		this.estadoProg = estadoProg;
		this.nomIdioma = nomIdioma;
		this.nomNivel = nomNivel;
		this.ciclo = ciclo;
		this.docente = docente;
		this.nomGrupoH = nomGrupoH;
		this.hora = hora;
		this.matriculados = matriculados;
	}
	
	public int getIdpProgramacionCurso() {
		return idpProgramacionCurso;
	}
	public void setIdpProgramacionCurso(int idpProgramacionCurso) {
		this.idpProgramacionCurso = idpProgramacionCurso;
	}
	public int getIdDocProg() {
		return idDocProg;
	}
	public void setIdDocProg(int idDocProg) {
		this.idDocProg = idDocProg;
	}
	public int getIdAula() {
		return idAula;
	}
	public void setIdAula(int idAula) {
		this.idAula = idAula;
	}
	public int getIdGrupohorario() {
		return idGrupohorario;
	}
	public void setIdGrupohorario(int idGrupohorario) {
		this.idGrupohorario = idGrupohorario;
	}
	public int getEstadoProg() {
		return estadoProg;
	}
	public void setEstadoProg(int estadoProg) {
		this.estadoProg = estadoProg;
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
	public String getDocente() {
		return docente;
	}
	public void setDocente(String docente) {
		this.docente = docente;
	}
	public String getNomGrupoH() {
		return nomGrupoH;
	}
	public void setNomGrupoH(String nomGrupoH) {
		this.nomGrupoH = nomGrupoH;
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
