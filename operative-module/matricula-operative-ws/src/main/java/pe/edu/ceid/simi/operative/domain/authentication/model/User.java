package pe.edu.ceid.simi.operative.domain.authentication.model;

public class User {
	private String id;
	private String email;
	private String password;
	private String passwordConfirm;
	private String names;
	private String lastNameP;
	private String lastNameM;
	private String docNumber;
	private String rolId;
	public User(String id, String email, String password, String passwordConfirm, String nombres, String lastNameP,
			String lastNameM, String dni, String rolId) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.passwordConfirm = passwordConfirm;
		this.names = nombres;
		this.lastNameP = lastNameP;
		this.lastNameM = lastNameM;
		this.docNumber = dni;
		this.rolId = rolId;
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

	public String getPasswordConfirm() {
		return passwordConfirm;
	}

	public void setPasswordConfirm(String passwordConfirm) {
		this.passwordConfirm = passwordConfirm;
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

	public static UserBuilder builder() {
		return new UserBuilder();
	}
	
	public static class UserBuilder {
		private String id;
		private String email;
		private String password;
		private String passwordConfirm;
		private String nombres;
		private String apPaterno;
		private String apMaterno;
		private String dni;
		private String rolId;
		
		public UserBuilder id(String id) {
			this.id = id;
			return this;
		}
		public UserBuilder email(String email) {
			this.email = email;
			return this;
		}
		public UserBuilder password(String password) {
			this.password = password;
			return this;
		}
		public UserBuilder passwordConfirm(String passwordConfirm) {
			this.passwordConfirm = passwordConfirm;
			return this;
		}
		public UserBuilder nombres(String nombres) {
			this.nombres = nombres;
			return this;
		}
		public UserBuilder apPaterno(String apPaterno) {
			this.apPaterno = apPaterno;
			return this;
		}
		public UserBuilder apMaterno(String apMaterno) {
			this.apMaterno = apMaterno;
			return this;
		}
		public UserBuilder dni(String dni) {
			this.dni = dni;
			return this;
		}
		public UserBuilder rolId(String rolId) {
			this.rolId = rolId;
			return this;
		}
		
		public User build() {
			return new User(id, email, password, passwordConfirm, nombres, apPaterno, apMaterno, dni, rolId);
		}
	}
}
