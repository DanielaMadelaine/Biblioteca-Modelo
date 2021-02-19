package Modelo;

import java.util.ArrayList;
import java.util.Date;


public class Biblioteca {

	private ArrayList<Copia> StockDisponible = new ArrayList<Copia>();
	private ArrayList<Prestamo> prestamos =new ArrayList<Prestamo>();

	public ArrayList<Copia> getCopias() {
		return StockDisponible;
	}

	public void setCopias(ArrayList<Copia> libros) {
		this.StockDisponible = libros;
	}
	
	
	
	//metodos
	
	public Copia buscarCopiaDisponible(Copia copia) {
		int i = 0;
		Copia copiaBuscada = null;
		
		while (StockDisponible.size() > i && copiaBuscada == null) {
			if (StockDisponible.get(i).getIdCopia() == copia.getIdCopia() && StockDisponible.get(i).getEstado() == EstadoCopia.Biblioteca) {				
				copiaBuscada =StockDisponible.get(i);
			}
			i++;
		}
		return copiaBuscada;
	}
     
     public boolean PrestarLibro(Copia unLibro,Lector unLector){
    	 
    	 boolean pudo = false;
    	 
 		Copia copiaDisponible = buscarCopiaDisponible(unLibro);
 		if (copiaDisponible == null)
 		{
 			System.out.println("Este libro no esta disponible");
 		}//else if (//tiene multas el lector? )
 			
 				//fijarme si el lector tiene 3 libros en prestamo	
 			
 		/*if (lector.NoPuedePedir()) {
 		} else if (copiaEnBib == null) {
 			throw new NoTieneLaCopia("Ese libro no esta Disponible");
 		} else if (TienePrestamosVencidos(lector)) {
 			System.out.println("Posee Prestamos Vencidos");
 		} else {
 			lector.getPrestamos().add(new Prestamo(hoy, lector, copia));
 			estadoCopia(copiaEnBib, estadoCopia.PRESTADO);
 			pudo = true;
 		*/
 		return pudo;
    	 
    	 
       }
     
     public void listarLibros() {
 		
 		System.out.println("Listado de libros en stock: ");
 		System.out.println("");
 		//Copia c;
 		
 		//if(c.getEstado() != "Prestado")
 			//podria poner condicion si no esta prestado es xq esta disponible
 		for (Copia copia : StockDisponible) {
 			System.out.println("Nombre:" + copia.getTitulo() +"  " +"ID:" + copia.getIdCopia());
 		}
 	}
	
     private void multarLector(Lector lector, Copia copias)  {
 		lector.getMultas().add(new Multa(lector));
 		copias.setEstado(EstadoCopia.Retraso);
 	}
     
     public int ContarPrestamos() {
 		int contador = prestamos.size();
 		return contador;
 	}
	
}
