package pe.edu.ceid.simi.management.domain.usuario.model;

import java.sql.Date;

public class UsuarioDTO {
	
	private int idUsuario;
	private String codUsuario;
	private int idPersona;
	private String nombre;
	private String apellidoPat;
	private String apellidoMat;
	private String email;
	private String contrasenia;
	private int idRol;
	private String nomRol;
	private int estado;
	private Date fechaAlta;
	private Date fechaBaja;
	private Date fechaMod;
	private int idUsuarioMod;
	
	public UsuarioDTO(int idUsuario, String codUsuario, int idPersona, String nombre, String apellidoPat,
			String apellidoMat, String email, String contrasenia, int idRol, String nomRol, int estado, Date fechaAlta,
			Date fechaBaja, Date fechaMod, int idUsuarioMod) {
		super();
		this.idUsuario = idUsuario;
		this.codUsuario = codUsuario;
		this.idPersona = idPersona;
		this.nombre = nombre;
		this.apellidoPat = apellidoPat;
		this.apellidoMat = apellidoMat;
		this.email = email;
		this.contrasenia = contrasenia;
		this.idRol = idRol;
		this.nomRol = nomRol;
		this.estado = estado;
		this.fechaAlta = fechaAlta;
		this.fechaBaja = fechaBaja;
		this.fechaMod = fechaMod;
		this.idUsuarioMod = idUsuarioMod;
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
	public Date getFechaAlta() {
		return fechaAlta;
	}
	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}
	public Date getFechaBaja() {
		return fechaBaja;
	}
	public void setFechaBaja(Date fechaBaja) {
		this.fechaBaja = fechaBaja;
	}
	public Date getFechaMod() {
		return fechaMod;
	}
	public void setFechaMod(Date fechaMod) {
		this.fechaMod = fechaMod;
	}
	public int getIdUsuarioMod() {
		return idUsuarioMod;
	}
	public void setIdUsuarioMod(int idUsuarioMod) {
		this.idUsuarioMod = idUsuarioMod;
	}
	
}
