package Modelo;

import java.util.ArrayList;


public class Biblioteca {

	private ArrayList<Copia> StockDisponible = new ArrayList<Copia>();
	

	public ArrayList<Copia> getCopias() {
		return StockDisponible;
	}

	public void setCopias(ArrayList<Copia> libros) {
		this.StockDisponible = libros;
	}
	
	
	
	//métodos
     
     public void PrestarLibro(){
       }
	
	
	
}
