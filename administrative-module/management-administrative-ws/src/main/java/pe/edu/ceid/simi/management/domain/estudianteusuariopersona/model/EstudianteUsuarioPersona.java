package pe.edu.ceid.simi.management.domain.estudianteusuariopersona.model;

import java.sql.Date;

public class EstudianteUsuarioPersona {

	private int idPersona;
	private String nombre;
	private String apellidoPat;
	private String apellidoMat;
	private String dni;
	private int genero;
	private int edad;
	private Date fechaAltaP;

	private String university;
	private String fechaNacimiento; 
	private String lugarNacDist;
	private String lugarNacProv;
	private String lugarNacDep;
	private String nacionalidad;
	private String address;
	private String phone;
	
	private int idUsuario;
	private String email;
	private String contrasenia;
	private int idRol;
	private String nomRol;
	private int estado;
	private Date fechaAltaU;
	private Date fechaBajaU;
	private String codEstudiante;
	private int idTipoEstudiante;

	public EstudianteUsuarioPersona() {}

	public EstudianteUsuarioPersona(int idPersona, String nombre, String apellidoPat, String apellidoMat, String dni,
			int genero, int edad, int idUsuario, String email, String contrasenia, int idRol,
			String nomRol, int estado, String codEstudiante, int idTipoEstudiante) {
		super();
		this.idPersona = idPersona;
		this.nombre = nombre;
		this.apellidoPat = apellidoPat;
		this.apellidoMat = apellidoMat;
		this.dni = dni;
		this.genero = genero;
		this.edad = edad;
		this.idUsuario = idUsuario;
		this.email = email;
		this.contrasenia = contrasenia;
		this.idRol = idRol;
		this.nomRol = nomRol;
		this.estado = estado;
		this.codEstudiante = codEstudiante;
		this.idTipoEstudiante = idTipoEstudiante;
	}

	public EstudianteUsuarioPersona(int idPersona, String nombre, String apellidoPat, String apellidoMat, String dni,
			int genero, int edad, Date fechaAltaP, int idUsuario, String email, String contrasenia, int idRol,
			String nomRol, int estado, Date fechaAltaU, Date fechaBajaU, String codEstudiante, int idTipoEstudiante) {
		super();
		this.idPersona = idPersona;
		this.nombre = nombre;
		this.apellidoPat = apellidoPat;
		this.apellidoMat = apellidoMat;
		this.dni = dni;
		this.genero = genero;
		this.edad = edad;
		this.fechaAltaP = fechaAltaP;
		this.idUsuario = idUsuario;
		this.email = email;
		this.contrasenia = contrasenia;
		this.idRol = idRol;
		this.nomRol = nomRol;
		this.estado = estado;
		this.fechaAltaU = fechaAltaU;
		this.fechaBajaU = fechaBajaU;
		this.codEstudiante = codEstudiante;
		this.idTipoEstudiante = idTipoEstudiante;
	}
	
	public EstudianteUsuarioPersona(int idPersona, String nombre, String apellidoPat, String apellidoMat, String dni,
			int genero, int edad, String university, String fechaNacimiento, String lugarNacDist,
			String lugarNacProv, String lugarNacDep, String nacionalidad, String address, String phone, int idUsuario,
			String email, String contrasenia, int idRol, String nomRol, int estado, String codEstudiante, int idTipoEstudiante) {
		super();
		this.idPersona = idPersona;
		this.nombre = nombre;
		this.apellidoPat = apellidoPat;
		this.apellidoMat = apellidoMat;
		this.dni = dni;
		this.genero = genero;
		this.edad = edad;
		this.university = university;
		this.fechaNacimiento = fechaNacimiento;
		this.lugarNacDist = lugarNacDist;
		this.lugarNacProv = lugarNacProv;
		this.lugarNacDep = lugarNacDep;
		this.nacionalidad = nacionalidad;
		this.address = address;
		this.phone = phone;
		this.idUsuario = idUsuario;
		this.email = email;
		this.contrasenia = contrasenia;
		this.idRol = idRol;
		this.nomRol = nomRol;
		this.estado = estado;
		this.codEstudiante = codEstudiante;
		this.idTipoEstudiante = idTipoEstudiante;
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
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
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
	public Date getFechaAltaP() {
		return fechaAltaP;
	}
	public void setFechaAltaP(Date fechaAltaP) {
		this.fechaAltaP = fechaAltaP;
	}
	public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContrasenia() {
		return contrasenia;
	}
	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
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
	public Date getFechaAltaU() {
		return fechaAltaU;
	}
	public void setFechaAltaU(Date fechaAltaU) {
		this.fechaAltaU = fechaAltaU;
	}
	public Date getFechaBajaU() {
		return fechaBajaU;
	}
	public void setFechaBajaU(Date fechaBajaU) {
		this.fechaBajaU = fechaBajaU;
	}
	public String getCodEstudiante() {
		return codEstudiante;
	}
	public void setCodEstudiante(String codEstudiante) {
		this.codEstudiante = codEstudiante;
	}
	public int getIdTipoEstudiante() {
		return idTipoEstudiante;
	}
	public void setIdTipoEstudiante(int idTipoEstudiante) {
		this.idTipoEstudiante = idTipoEstudiante;
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
