package pe.edu.ceid.simi.operative.domain.grupo.model;

public class Grupo {
	private int idGrupo;
	private String nomGrupo;
	
	public Grupo(int idGrupo, String nomGrupo) {
		super();
		this.idGrupo = idGrupo;
		this.nomGrupo = nomGrupo;
	}

	public int getIdGrupo() {
		return idGrupo;
	}

	public void setIdGrupo(int idGrupo) {
		this.idGrupo = idGrupo;
	}

	public String getNomGrupo() {
		return nomGrupo;
	}

	public void setNomGrupo(String nomGrupo) {
		this.nomGrupo = nomGrupo;
	}
	
}
