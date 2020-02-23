package pe.edu.ceid.simi.operative.domain.idioma.model;

public class Idioma {
	private int idIdioma;
	private String nomIdioma;
	private String descIdioma;

	public Idioma(int idIdioma, String nomIdioma, String descIdioma) {
		super();
		this.idIdioma = idIdioma;
		this.nomIdioma = nomIdioma;
		this.descIdioma = descIdioma;
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

	public String getDescIdioma() {
		return descIdioma;
	}

	public void setDescIdioma(String descIdioma) {
		this.descIdioma = descIdioma;
	}

}
