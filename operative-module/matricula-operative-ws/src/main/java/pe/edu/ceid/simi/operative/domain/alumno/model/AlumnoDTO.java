package pe.edu.ceid.simi.operative.domain.alumno.model;

public class AlumnoDTO {
	private int idPersona;
	private String nomPersona;
	private String apPaterno;
	private String apMaterno;
	private int dni;
	private int genero;
	private int edad;
	private int idUsuario;
	private String codUsuario;
	private String email;
	private int idRol;
	private String nomRol;
	private int estado;
	private int idTipo;
	private String nomTipo;
	
	public AlumnoDTO(int idPersona, String nomPersona, String apPaterno, String apMaterno, int dni, int genero,
			int edad, int idUsuario, String codUsuario, String email, int idRol, String nomRol, int estado, int idTipo,
			String nomTipo) {
		super();
		this.idPersona = idPersona;
		this.nomPersona = nomPersona;
		this.apPaterno = apPaterno;
		this.apMaterno = apMaterno;
		this.dni = dni;
		this.genero = genero;
		this.edad = edad;
		this.idUsuario = idUsuario;
		this.codUsuario = codUsuario;
		this.email = email;
		this.idRol = idRol;
		this.nomRol = nomRol;
		this.estado = estado;
		this.idTipo = idTipo;
		this.nomTipo = nomTipo;
	}

	public int getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}

	public String getNomPersona() {
		return nomPersona;
	}

	public void setNomPersona(String nomPersona) {
		this.nomPersona = nomPersona;
	}

	public String getApPaterno() {
		return apPaterno;
	}

	public void setApPaterno(String apPaterno) {
		this.apPaterno = apPaterno;
	}

	public String getApMaterno() {
		return apMaterno;
	}

	public void setApMaterno(String apMaterno) {
		this.apMaterno = apMaterno;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public int getGenero() {
		return genero;
	}

	public void setGenero(int genero) {
		this.genero = genero;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getCodUsuario() {
		return codUsuario;
	}

	public void setCodUsuario(String codUsuario) {
		this.codUsuario = codUsuario;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getIdRol() {
		return idRol;
	}

	public void setIdRol(int idRol) {
		this.idRol = idRol;
	}

	public String getNomRol() {
		return nomRol;
	}

	public void setNomRol(String nomRol) {
		this.nomRol = nomRol;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public int getIdTipo() {
		return idTipo;
	}

	public void setIdTipo(int idTipo) {
		this.idTipo = idTipo;
	}

	public String getNomTipo() {
		return nomTipo;
	}

	public void setNomTipo(String nomTipo) {
		this.nomTipo = nomTipo;
	}
	
}
