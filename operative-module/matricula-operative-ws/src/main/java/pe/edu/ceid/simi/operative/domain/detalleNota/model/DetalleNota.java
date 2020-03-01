package pe.edu.ceid.simi.operative.domain.detalleNota.model;

public class DetalleNota {
	private int idDetalle;
	private int idNota;
	private String descripcion;
	private int porcentaje;
	private int nota;
	
	public DetalleNota() {};
	
	public DetalleNota(int idDetalle, int idNota, String descripcion, int porcentaje, int nota) {
		super();
		this.idDetalle = idDetalle;
		this.idNota = idNota;
		this.descripcion = descripcion;
		this.porcentaje = porcentaje;
		this.nota = nota;
	}

	public int getIdDetalle() {
		return idDetalle;
	}

	public void setIdDetalle(int idDetalle) {
		this.idDetalle = idDetalle;
	}

	public int getIdNota() {
		return idNota;
	}

	public void setIdNota(int idNota) {
		this.idNota = idNota;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getPorcentaje() {
		return porcentaje;
	}

	public void setPorcentaje(int porcentaje) {
		this.porcentaje = porcentaje;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}
	
}
