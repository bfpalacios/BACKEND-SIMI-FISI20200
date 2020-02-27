package pe.edu.ceid.simi.operative.domain.authentication.model;

public class Authentication {

	private String id;
	private String email;
	private String password;
	private String rolId;
	
	public Authentication(String id, String rolId, String email, String password) {
		this.id = id;
		this.rolId = rolId;
		this.email = email;
		this.password = password;
	}
	
	public Authentication() {}
	
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
	
	public String getRolId() {
		return rolId;
	}

	public void setRolId(String rolId) {
		this.rolId = rolId;
	}

	public static AuthenticationBuilder builder() {
		return new AuthenticationBuilder();
	}
	
	public static class AuthenticationBuilder {
		
		private String id;
		private String rolId;
		private String email;
		private String password;
		
		public AuthenticationBuilder() {
		}
		
		public AuthenticationBuilder id(String id) {
			this.id = id;
			return this;
		}
		
		public AuthenticationBuilder email(String email) {
			this.email = email;
			return this;
		}
		
		public AuthenticationBuilder password(String password) {
			this.password = password;
			return this;
		}
		
		public AuthenticationBuilder rolId(String rolId) {
			this.rolId = rolId;
			return this;
		}
		
		public Authentication build() {
			return new Authentication(id, rolId, email, password);
		}
	}
}
