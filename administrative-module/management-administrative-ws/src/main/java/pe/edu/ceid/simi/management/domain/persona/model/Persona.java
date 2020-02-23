package pe.edu.ceid.simi.management.domain.persona.model;

import java.sql.Date;

public class Persona {

	private int idPersona;
	private String nombre;
	private String apellidoPat;
	private String apellidoMat;
	private int dni;
	private int genero;
	private int edad;
	private Date fechaAlta;
	private Date fechaMod;

	private String university;
	private String fechaNacimiento; 
	private String lugarNacDist;
	private String lugarNacProv;
	private String lugarNacDep;
	private String nacionalidad;
	private String address;
	private String phone;
	
	public Persona(int idPersona, String nombre, String apellidoPat, String apellidoMat, int dni, int genero, int edad,
			Date fechaAlta, Date fechaMod, String university, String fechaNacimiento, String lugarNacDist,
			String lugarNacProv, String lugarNacDep, String nacionalidad, String address, String phone) {
		super();
		this.idPersona = idPersona;
		this.nombre = nombre;
		this.apellidoPat = apellidoPat;
		this.apellidoMat = apellidoMat;
		this.dni = dni;
		this.genero = genero;
		this.edad = edad;
		this.fechaAlta = fechaAlta;
		this.fechaMod = fechaMod;
		this.university = university;
		this.fechaNacimiento = fechaNacimiento;
		this.lugarNacDist = lugarNacDist;
		this.lugarNacProv = lugarNacProv;
		this.lugarNacDep = lugarNacDep;
		this.nacionalidad = nacionalidad;
		this.address = address;
		this.phone = phone;
	}

	public Persona(int idPersona, String nombre, String apellidoPat, String apellidoMat, int dni, int genero,
			int edad, Date fechaAlta, Date fechaMod) {
		super();
		this.idPersona = idPersona;
		this.nombre = nombre;
		this.apellidoPat = apellidoPat;
		this.apellidoMat = apellidoMat;
		this.dni = dni;
		this.genero = genero;
		this.edad = edad;
		this.fechaAlta = fechaAlta;
		this.fechaMod = fechaMod;
	}
	
	public int getIdPersona() {
		return idPersona;
	}
	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
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
	public Date getFechaAlta() {
		return fechaAlta;
	}
	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}
	public Date getFechaMod() {
		return fechaMod;
	}
	public void setFechaMod(Date fechaMod) {
		this.fechaMod = fechaMod;
	}
	public String getUniversity() {
		return university;
	}
	public void setUniversity(String university) {
		this.university = university;
	}
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getLugarNacDist() {
		return lugarNacDist;
	}
	public void setLugarNacDist(String lugarNacDist) {
		this.lugarNacDist = lugarNacDist;
	}
	public String getLugarNacProv() {
		return lugarNacProv;
	}
	public void setLugarNacProv(String lugarNacProv) {
		this.lugarNacProv = lugarNacProv;
	}
	public String getLugarNacDep() {
		return lugarNacDep;
	}
	public void setLugarNacDep(String lugarNacDep) {
		this.lugarNacDep = lugarNacDep;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}
