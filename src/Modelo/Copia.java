package Modelo;

public class Copia extends Libro {

	
	private int idCopia;
	private EstadoCopia estado;
	
	public Copia(String titulo, TipoLibro tipo, String editorial, int anio, Autor autorLib,EstadoCopia estado,int id) {
		super(titulo, tipo, editorial, anio, autorLib);
		// TODO Auto-generated constructor stub
		
		this.estado =estado;
		this.idCopia=id;
		
	}
	

	
	public int getIdCopia() {
		return idCopia;
	}
	public void setIdCopia(int idCopia) {
		this.idCopia = idCopia+1;
	}
	public EstadoCopia getEstado() {
		return estado;
	}
	public void setEstado(EstadoCopia estado) {
		this.estado = estado;
	}



	@Override
	public String toString() {
		return "Libros : " + getTitulo() +"  "+ "Editorial:" + getEditorial()+"  " + "Año:"
				+getAnio() + "  " + getTipo() + "  " + getAutorLib();
	}
	
	
	
}
