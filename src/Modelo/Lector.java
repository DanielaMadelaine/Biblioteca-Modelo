package Modelo;

import java.util.ArrayList;

public class Lector {

	private int nSocio;
	private String nombre;
	private String telefono;
	private String direccion;
	private ArrayList<Multa> multas =new ArrayList<Multa>();
	
	
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



       public ArrayList<Multa> getMultas() {
		return multas;
	}


	public void setMultas(ArrayList<Multa> multas) {
		this.multas = multas;
	}


	@Override
	public String toString() {
		return "Lector: " + nombre +"  " +"Nº de socio: "+ nSocio +"  "+ "Telefono: " + telefono +"  "+ "Direccion: " + direccion;
	}


	public void DevolverLibro() {
        }
	
	
	
	
}
