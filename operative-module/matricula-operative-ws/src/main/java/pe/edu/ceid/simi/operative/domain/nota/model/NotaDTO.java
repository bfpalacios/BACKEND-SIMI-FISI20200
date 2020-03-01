package pe.edu.ceid.simi.operative.domain.nota.model;

public class NotaDTO {
	private int idNota;
	private int idMatricula;
	private String codEstudiante;
	private String nomPeriodo;
	private String nomIdioma;
	private String nomNivel;
	private int ciclo;
	private String hora;
	private int promedio;
	
	public NotaDTO(int idNota, int idMatricula, String codEstudiante, String nomPeriodo, String nomIdioma,
			String nomNivel, int ciclo, String hora, int promedio) {
		super();
		this.idNota = idNota;
		this.idMatricula = idMatricula;
		this.codEstudiante = codEstudiante;
		this.nomPeriodo = nomPeriodo;
		this.nomIdioma = nomIdioma;
		this.nomNivel = nomNivel;
		this.ciclo = ciclo;
		this.hora = hora;
		this.promedio = promedio;
	}

	public int getIdNota() {
		return idNota;
	}

	public void setIdNota(int idNota) {
		this.idNota = idNota;
	}

	public int getIdMatricula() {
		return idMatricula;
	}

	public void setIdMatricula(int idMatricula) {
		this.idMatricula = idMatricula;
	}

	public String getCodEstudiante() {
		return codEstudiante;
	}

	public void setCodEstudiante(String codEstudiante) {
		this.codEstudiante = codEstudiante;
	}

	public String getNomPeriodo() {
		return nomPeriodo;
	}

	public void setNomPeriodo(String nomPeriodo) {
		this.nomPeriodo = nomPeriodo;
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

	public int getPromedio() {
		return promedio;
	}

	public void setPromedio(int promedio) {
		this.promedio = promedio;
	}
	
	
}
