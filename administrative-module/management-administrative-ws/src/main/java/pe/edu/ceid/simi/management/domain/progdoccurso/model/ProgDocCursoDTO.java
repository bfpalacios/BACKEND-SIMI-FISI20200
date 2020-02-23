package pe.edu.ceid.simi.management.domain.progdoccurso.model;

public class ProgDocCursoDTO {

	private int idProgDocCur;
	private String idDocente;
	private String nombre;			// cusuario
	private String apellidoPat;		// cusuario
	private String apellidoMat;		// cusuario
	private String email;
	private int idCurso;
	private String nomIdioma;		// cidioma;
	private String nomNivel ;		// cnivel;
	private int ciclo;
	private int idPeriodo;
	private String nomPeriodo;		// cperiodo

	public ProgDocCursoDTO() {}

	public ProgDocCursoDTO(int idProgDocCur, String idDocente, String nombre, String apellidoPat, String apellidoMat,
			String email, int idCurso, String nomIdioma, String nomNivel, int ciclo, int idPeriodo, String nomPeriodo) {
		super();
		this.idProgDocCur = idProgDocCur;
		this.idDocente = idDocente;
		this.nombre = nombre;
		this.apellidoPat = apellidoPat;
		this.apellidoMat = apellidoMat;
		this.email = email;
		this.idCurso = idCurso;
		this.nomIdioma = nomIdioma;
		this.nomNivel = nomNivel;
		this.ciclo = ciclo;
		this.idPeriodo = idPeriodo;
		this.nomPeriodo = nomPeriodo;
	}

	public ProgDocCursoDTO(int idProgDocCur, String idDocente, int idCurso, int idPeriodo) {
		super();
		this.idProgDocCur = idProgDocCur;
		this.idDocente = idDocente;
		this.idCurso = idCurso;
		this.idPeriodo = idPeriodo;
	}
	
	public int getIdProgDocCur() {
		return idProgDocCur;
	}
	public void setIdProgDocCur(int idProgDocCur) {
		this.idProgDocCur = idProgDocCur;
	}
	public String getIdDocente() {
		return idDocente;
	}
	public void setIdDocente(String idDocente) {
		this.idDocente = idDocente;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getIdCurso() {
		return idCurso;
	}
	public void setIdCurso(int ccurso) {
		this.idCurso = ccurso;
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
	public int getIdPeriodo() {
		return idPeriodo;
	}
	public void setIdPeriodo(int idPeriodo) {
		this.idPeriodo = idPeriodo;
	}
	public String getNomPeriodo() {
		return nomPeriodo;
	}
	public void setNomPeriodo(String nomPeriodo) {
		this.nomPeriodo = nomPeriodo;
	}
}
