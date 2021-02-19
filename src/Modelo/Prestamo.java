package Modelo;

import java.util.ArrayList;
import java.util.Date;

public class Prestamo {

	private Date finicioPrestamo;
	private Date FfinPrestamo;
	
	private ArrayList<Lector> lectores= new ArrayList<Lector>();
	
	public Date getFinicioPrestamo() {
		return finicioPrestamo;
	}
	public void setFinicioPrestamo(Date finicioPrestamo) {
		this.finicioPrestamo = finicioPrestamo;
	}
	public Date getFfinPrestamo() {
		return FfinPrestamo;
	}
	public void setFfinPrestamo(Date ffinPrestamo) {
		FfinPrestamo = ffinPrestamo;
	}
	
	

       // agregar metodos
	
}
