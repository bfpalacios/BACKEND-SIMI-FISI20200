package pe.edu.ceid.simi.operative.domain.alumno.model;

public class Alumno {
	private int idPersona;
	private String nomPersona;
	private String apPaterno;
	private String apMaterno;
	private int dni;
	private int genero;
	private int edad;
	
	public Alumno(int idPersona, String nomPersona, String apPaterno, String apMaterno, int dni, int genero, int edad) {
		super();
		this.idPersona = idPersona;
		this.nomPersona = nomPersona;
		this.apPaterno = apPaterno;
		this.apMaterno = apMaterno;
		this.dni = dni;
		this.genero = genero;
		this.edad = edad;
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
	
	
}
