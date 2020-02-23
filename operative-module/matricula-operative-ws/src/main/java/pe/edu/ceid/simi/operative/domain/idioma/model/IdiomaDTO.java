package pe.edu.ceid.simi.operative.domain.idioma.model;

public class IdiomaDTO {
	private int idIdioma;
	private String nomIdioma;
	
	public IdiomaDTO(int idIdioma, String nomIdioma) {
		super();
		this.idIdioma = idIdioma;
		this.nomIdioma = nomIdioma;
	}

	public int getIdIdioma() {
		return idIdioma;
	}

	public void setIdIdioma(int idIdioma) {
		this.idIdioma = idIdioma;
	}

	public String getNomIdioma() {
		return nomIdioma;
	}

	public void setNomIdioma(String nomIdioma) {
		this.nomIdioma = nomIdioma;
	}
	
}
