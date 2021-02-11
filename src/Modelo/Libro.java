package Modelo;

public abstract class Libro {

	private String titulo;
	private TipoLibro tipo;
	private String editorial;
	private int anio;
	private Autor autorLib;
	

	
	public Libro(String titulo, TipoLibro tipo, String editorial, int anio, Autor autorLib) {
		super();
		this.titulo = titulo;
		this.tipo = tipo;
		this.editorial = editorial;
		this.anio = anio;
		this.autorLib = autorLib;
	}
	
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	public TipoLibro getTipo() {
		return tipo;
	}
	public void setTipo(TipoLibro tipo) {
		this.tipo = tipo;
	}
	public Autor getAutorLib() {
		return autorLib;
	}
	public void setAutorLib(Autor autorLib) {
		this.autorLib = autorLib;
	}
	
	
}
