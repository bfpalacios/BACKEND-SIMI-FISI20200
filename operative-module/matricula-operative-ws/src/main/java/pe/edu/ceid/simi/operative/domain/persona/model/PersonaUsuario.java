package pe.edu.ceid.simi.operative.domain.persona.model;

public class PersonaUsuario {

	private int codUser;
	private String email;
	private String nombre;
	private String apPaterno;
	private String apMaterno;
	private String dni;
	private String birthday;
	private String lugarNacDist;
	private String lugarNacProv;
	private String lugarNacDep;
	private String nacionalidad;
	private int edad;
	private String genero;
	private String university;
	private String phone;
	private String address;

	public PersonaUsuario(int codUser, String email, String nombre, String apPaterno, String apMaterno, String dni,
			String birthday, String lugarNacDist, String lugarNacProv, String lugarNacDep, String nacionalidad,
			int edad, String genero, String university, String phone, String address) {
		this.codUser = codUser;
		this.email = email;
		this.nombre = nombre;
		this.apPaterno = apPaterno;
		this.apMaterno = apMaterno;
		this.dni = dni;
		this.birthday = birthday;
		this.lugarNacDist = lugarNacDist;
		this.lugarNacProv = lugarNacProv;
		this.lugarNacDep = lugarNacDep;
		this.nacionalidad = nacionalidad;
		this.edad = edad;
		this.genero = genero;
		this.university = university;
		this.phone = phone;
		this.address = address;
	}

	public PersonaUsuario() {

	}

	public int getCodUser() {
		return codUser;
	}

	public void setCodUser(int codUser) {
		this.codUser = codUser;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
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

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
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

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public static PersonaUsuarioBuilder builder() {
		return new PersonaUsuarioBuilder();
	}
	public static class PersonaUsuarioBuilder {
		private int codUser;
		private String email;
		private String nombre;
		private String apPaterno;
		private String apMaterno;
		private String dni;
		private String birthday;
		private String lugarNacDist;
		private String lugarNacProv;
		private String lugarNacDep;
		private String nacionalidad;
		private int edad;
		private String genero;
		private String university;
		private String phone;
		private String address;

		public PersonaUsuarioBuilder codUser(int codUser) {
			this.codUser = codUser;
			return this;
		}

		public PersonaUsuarioBuilder email(String email) {
			this.email = email;
			return this;
		}

		public PersonaUsuarioBuilder nombre(String nombre) {
			this.nombre = nombre;
			return this;
		}

		public PersonaUsuarioBuilder apPaterno(String apPaterno) {
			this.apPaterno = apPaterno;
			return this;
		}

		public PersonaUsuarioBuilder apMaterno(String apMaterno) {
			this.apMaterno = apMaterno;
			return this;
		}

		public PersonaUsuarioBuilder birthday(String birthday) {
			this.birthday = birthday;
			return this;
		}

		public PersonaUsuarioBuilder dni(String dni) {
			this.dni = dni;
			return this;
		}

		public PersonaUsuarioBuilder lugarNacDist(String lugarNacDist) {
			this.lugarNacDist = lugarNacDist;
			return this;
		}

		public PersonaUsuarioBuilder lugarNacProv(String lugarNacProv) {
			this.lugarNacProv = lugarNacProv;
			return this;
		}

		public PersonaUsuarioBuilder lugarNacDep(String lugarNacDep) {
			this.lugarNacDep = lugarNacDep;
			return this;
		}

		public PersonaUsuarioBuilder nacionalidad(String nacionalidad) {
			this.nacionalidad = nacionalidad;
			return this;
		}

		public PersonaUsuarioBuilder edad(int edad) {
			this.edad = edad;
			return this;
		}

		public PersonaUsuarioBuilder genero(String genero) {
			this.genero = genero;
			return this;
		}

		public PersonaUsuarioBuilder university(String university) {
			this.university = university;
			return this;
		}

		public PersonaUsuarioBuilder phone(String phone) {
			this.phone = phone;
			return this;
		}

		public PersonaUsuarioBuilder address(String address) {
			this.address = address;
			return this;
		}

		public PersonaUsuario build() {
			return new PersonaUsuario(codUser, email, nombre, apPaterno, apMaterno, dni, birthday, lugarNacDist, lugarNacProv, lugarNacDep, nacionalidad, edad, genero, university, phone, address);
		}
	}

}
