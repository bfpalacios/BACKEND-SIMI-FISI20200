package pe.edu.ceid.simi.operative.domain.authentication.model;

public class User {
	private String id;
	private String email;
	private String password;
	private String names;
	private String lastNameP;
	private String lastNameM;
	private String docNumber;
	private String rolId;
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
	
	
	public User(String id, String email, String password, String names, String lastNameP, String lastNameM,
			String docNumber, String rolId, String birthday, String lugarNacDist, String lugarNacProv,
			String lugarNacDep, String nacionalidad, int edad, String genero, String university, String phone,
			String address) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.names = names;
		this.lastNameP = lastNameP;
		this.lastNameM = lastNameM;
		this.docNumber = docNumber;
		this.rolId = rolId;
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


	public User() {
		
	}
	
	

	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getNames() {
		return names;
	}


	public void setNames(String names) {
		this.names = names;
	}


	public String getLastNameP() {
		return lastNameP;
	}


	public void setLastNameP(String lastNameP) {
		this.lastNameP = lastNameP;
	}


	public String getLastNameM() {
		return lastNameM;
	}


	public void setLastNameM(String lastNameM) {
		this.lastNameM = lastNameM;
	}


	public String getDocNumber() {
		return docNumber;
	}


	public void setDocNumber(String docNumber) {
		this.docNumber = docNumber;
	}


	public String getRolId() {
		return rolId;
	}


	public void setRolId(String rolId) {
		this.rolId = rolId;
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
}
