package Modelo;

public class TipoLibro {

	private int idTipo;
	private String descripcion;
	
	
	public TipoLibro(int idTipo, String descripcion) {
		super();
		this.idTipo = idTipo;
		this.descripcion = descripcion;
	}
	
	
	
	public int getIdTipo() {
		return idTipo;
	}
	public void setIdTipo(int idTipo) {
		this.idTipo = idTipo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}



	@Override
	public String toString() {
		return "TipoLibro =  id :" + idTipo + " descripcion: " + descripcion ;
	}
	
	
	
}
