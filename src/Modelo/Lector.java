package Modelo;

import java.util.ArrayList;

public class Lector {

	private int nSocio;
	private String nombre;
	private String telefono;
	private String direccion;
	private Multa multa;
	private ArrayList<Prestamo> prestamo = new ArrayList<Prestamo>();
     
	
	
	public Lector(int nSocio, String nombre, String telefono, String direccion) {
		super();
		this.nSocio = nSocio;
		this.nombre = nombre;
		this.telefono = telefono;
		this.direccion = direccion;
	}
	
	
	public int getnSocio() {
		return nSocio;
	}
	public void setnSocio(int nSocio) {
		this.nSocio = nSocio;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public Multa getMulta() {
		return multa;
	}


	public void setMulta(Multa multa) {
		this.multa = multa;
	}


	public ArrayList<Prestamo> getPrestamo() {
		return prestamo;
	}


	public void setPrestamo(ArrayList<Prestamo> prestamo) {
		this.prestamo = prestamo;
	}


	@Override
	public String toString() {
		return "Lector: " + nombre +"  " +"Nº de socio: "+ nSocio +"  "+ "Telefono: " + telefono +"  "+ "Direccion: " + direccion;
	}

	 public Prestamo buscarCopiaEnPrestamo(Copia copia) {
		 
	 		int i = 0;
	 		Prestamo encontrado = null;
	 		
	 		
			while (prestamo.size() > i && encontrado == null ) {
	 			if (prestamo.get(i).getUnLibro().getIdCopia() == copia.getIdCopia()) {				
	 				encontrado= prestamo.get(i);
	 			}
	 			i++;
	 		}
	 		return encontrado;
	 	}
	
}
