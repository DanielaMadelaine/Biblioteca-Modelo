package Modelo;

public class Copia extends Libro {

	
	private int idCopia;
	private EstadoCopia estado;
	
	public Copia(String titulo, TipoLibro tipo, String editorial, int anio, Autor autorLib) {
		super(titulo, tipo, editorial, anio, autorLib);
		// TODO Auto-generated constructor stub
	}
	

	
	public int getIdCopia() {
		return idCopia;
	}
	public void setIdCopia(int idCopia) {
		this.idCopia = idCopia;
	}
	public EstadoCopia getEstado() {
		return estado;
	}
	public void setEstado(EstadoCopia estado) {
		this.estado = estado;
	}



	@Override
	public String toString() {
		return "Copia [idCopia=" + idCopia + ", estado=" + estado + ", getIdCopia()=" + getIdCopia() + ", getEstado()="
				+ getEstado() + ", getTitulo()=" + getTitulo() + ", getEditorial()=" + getEditorial() + ", getAnio()="
				+ getAnio() + ", getTipo()=" + getTipo() + ", getAutorLib()=" + getAutorLib() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
}
