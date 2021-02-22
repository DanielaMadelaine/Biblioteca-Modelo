package Modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;


public class Biblioteca {

	private ArrayList<Copia> StockDisponible = new ArrayList<Copia>();
	LocalDate fechaActual = LocalDate.now();

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
    	 
    	 Date fecha = new Date(121,8,24);
    	 
    	 boolean pudo = false;
    	 
 		Copia copiaDisponible = buscarCopiaDisponible(unLibro);
 		
 		if (copiaDisponible == null)
 		{
 			System.out.println("Este libro no esta disponible");
 		}else if (unLector.getMulta() == null )
 		{
 			// le podemos presta 
 			if(unLector.getPrestamo().size() < 3 )
 			{
 			
 				unLector.getPrestamo().add(new Prestamo(copiaDisponible, unLector,fecha) );
 				copiaDisponible.setEstado(EstadoCopia.Prestado);
 				System.out.println("libro prestado :) "+unLibro.getTitulo());
 				return true;
 				
 			}else {
 				
 				System.out.println("El lector tiene mas de 3 libros prestados.. no se puede");
 			}
 			
 		}else {
 			//Si tiene multa
 			System.out.println("No se puede, tiene multa vigente");
 		}
 			
 		return pudo;
    	  
       }
     
     public void listarLibros() {
 		
 		System.out.println("Listado de libros en stock: ");
 		System.out.println("");
 		for (Copia copia : StockDisponible) {
 				System.out.println("Nombre:" + copia.getTitulo() +"\t" +"ID:" + copia.getIdCopia()+"  "+"Estado: "+copia.getEstado());
	
 		}
 	}
	
     

     
     
     public void multarLector(Lector lector)  {
    	 
    	
    	 
    	// lector.setMulta(new Multa(hoy, ffin);
 		

 	}
     
     
     public void DevolverLibro(Copia unLibro,Lector unLector) {
    	 
    	 
    	 Prestamo p= unLector.buscarCopiaEnPrestamo(unLibro);
    	 
    	 if(p !=null)
    	 {
    		 // Si el libro que queremos devolver, lo tiene el lector es true 
    		 //Calcular dias , buscar como calcular dias
    		//long dias = (fechaActual.until(arg0, arg1) - p.getFinicioPrestamo());
    	 }
    	 
     }
	
}
