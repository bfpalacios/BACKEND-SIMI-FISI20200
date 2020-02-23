package pe.edu.ceid.simi.operative.domain.programacion.model;

public class Programacion {
	private int idProgramacionCurso;
	private int idDocProg;
	private int idAula;
	private int idGrupohorario;
	private int estadoProg;
	
	public Programacion(int idProgramacionCurso, int idDocProg, int idAula, int idGrupohorario, int estadoProg) {
		super();
		this.idProgramacionCurso = idProgramacionCurso;
		this.idDocProg = idDocProg;
		this.idAula = idAula;
		this.idGrupohorario = idGrupohorario;
		this.estadoProg = estadoProg;
	}

	public int getIdProgramacionCurso() {
		return idProgramacionCurso;
	}

	public void setIdProgramacionCurso(int idProgramacionCurso) {
		this.idProgramacionCurso = idProgramacionCurso;
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
	
	
}
