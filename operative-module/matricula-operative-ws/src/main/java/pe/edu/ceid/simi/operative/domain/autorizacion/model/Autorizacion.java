package pe.edu.ceid.simi.operative.domain.autorizacion.model;

public class Autorizacion {

	private String email;
	private int codigo;
	private int codPersona;
	private int tipo;
	
	public Autorizacion(String email, int codigo, int codPersona, int tipo) {
		this.email = email;
		this.codPersona = codPersona;
		this.codigo = codigo;
		this.tipo = tipo;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public int getCodPersona() {
		return codPersona;
	}

	public void setCodPersona(int codPersona) {
		this.codPersona = codPersona;
	}

	public int getTipo() {
		return tipo;
	}
	public void setTipo(int ctipousuario) {
		this.tipo = ctipousuario;
	}
	
	public static AutorizacionBuilder builder() {
		return new AutorizacionBuilder();
	}
	
	public static class AutorizacionBuilder {
		
		private String email;
		private int codigo;
		private int codPersona;
		private int tipo;
		
		public AutorizacionBuilder() {
		}
		
		public AutorizacionBuilder email(String email) {
			this.email = email;
			return this;
		}
		
		public AutorizacionBuilder codigo(int codigo) {
			this.codigo = codigo;
			return this;
		}
		
		public AutorizacionBuilder tipo(int tipo) {
			this.tipo = tipo;
			return this;
		}
		
		public AutorizacionBuilder codPersona(int codPersona) {
			this.codPersona = codPersona;
			return this;
		}
		
		public Autorizacion build() {
			return new Autorizacion(email, codigo, codPersona, tipo);
		}
	}
}
