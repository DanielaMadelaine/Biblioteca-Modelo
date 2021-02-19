package Modelo;

import java.util.ArrayList;
import java.util.Date;


public class Biblioteca {

	private ArrayList<Copia> StockDisponible = new ArrayList<Copia>();
	

	public ArrayList<Copia> getCopias() {
		return StockDisponible;
	}

	public void setCopias(ArrayList<Copia> libros) {
		this.StockDisponible = libros;
	}
	
	
	
	//metodos
     
     public void PrestarLibro(int idLibro,int idLector, Date cuando){
    	 
    	 
       }
	
	
	
}
