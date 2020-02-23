package pe.edu.ceid.simi.management.domain.docente.model;

public class Docente {
	
	private int codDocente;
	private int idUsuario;
	private int departamento;
	
	public Docente(int codDocente, int idUsuario, int departamento) {
		super();
		this.codDocente = codDocente;
		this.idUsuario = idUsuario;
		this.departamento = departamento;
	}
	
	public int getCodDocente() {
		return codDocente;
	}
	public void setCodDocente(int codDocente) {
		this.codDocente = codDocente;
	}
	public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	public int getDepartamento() {
		return departamento;
	}
	public void setDepartamento(int departamento) {
		this.departamento = departamento;
	}
	
}
