package pe.edu.ceid.simi.management.domain.tipocontrato.model;

public class TipoContrato {
	
	private int idTipoContrato;
	private String nomTipoContrato;
	
	public TipoContrato(int ctipoContrato, String nomTipoContrato) {
		super();
		this.idTipoContrato = ctipoContrato;
		this.nomTipoContrato = nomTipoContrato;
	}
	
	public int getIdTipoContrato() {
		return idTipoContrato;
	}
	public void setIdTipoContrato(int ctipoContrato) {
		this.idTipoContrato = ctipoContrato;
	}
	public String getNomTipoContrato() {
		return nomTipoContrato;
	}
	public void setNomTipoContrato(String nomTipoContrato) {
		this.nomTipoContrato = nomTipoContrato;
	}
	
}
