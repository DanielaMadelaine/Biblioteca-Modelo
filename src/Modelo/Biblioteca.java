package Modelo;


import java.util.ArrayList;
import java.util.Date;

import Excepciones.BibliotecaException;


public class Biblioteca {

	private ArrayList<Copia> StockDisponible = new ArrayList<Copia>();
	Date fechaActual = new Date();
	
	

	public ArrayList<Copia> getCopias() {
		
		return StockDisponible;
	}

	public void setCopias(ArrayList<Copia> libros) {
		this.StockDisponible = libros;
	}
	
	
	
	//Metodos
	
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
     
     public void PrestarLibro(Copia unLibro,Lector unLector) throws BibliotecaException {
    	 

 		Copia copiaDisponible = buscarCopiaDisponible(unLibro);
 		
 		if (copiaDisponible == null)
 		{
 			throw new BibliotecaException("Copia no disponible en la biblioteca");
 			
 		}else if (unLector.getMulta() == null )
 		{
 			// le podemos prestar
 			if(unLector.getPrestamo().size() < 3 )
 			{// si tiene menos de 3 prestamos
 				//generamos un nuevo prestamo
 				unLector.getPrestamo().add(new Prestamo(copiaDisponible, unLector,fechaActual) );
 				copiaDisponible.setEstado(EstadoCopia.Prestado);
 				System.out.println("¡Copia prestada correctamente! "+"Titulo Copia: " +unLibro.getTitulo());
 				
 				
 			}else {
 				throw new BibliotecaException("El lector alcanzo el maximo de prestamos..");
 			}
 			
 		}else {
 			//Si tiene multa
 			throw new BibliotecaException("El lector tiene multa vigente..");
 			
 		}
 			
    	  
       }
     
     public void listarLibros() {
 		
 		System.out.println("Listado de Copias en stock: ");
 		System.out.println("");
 		for (Copia copia : StockDisponible) {
 				System.out.println("Nombre:" + copia.getTitulo() +"\t" +"ID:" + copia.getIdCopia()+"  "+"Estado: "+copia.getEstado());
	
 		}
 	}
	

     public void DevolverLibro(Copia unLibro,Lector unLector) throws BibliotecaException {
    	 
    	 //Buscamos si el libro lo tiene el lector en sus prestamos
    	 Prestamo p= unLector.buscarCopiaEnPrestamo(unLibro);
    	 
    	 if(p != null)
    	 {
    		 // Si el libro que queremos devolver, lo tiene el lector vamos a calcular los dias 
    		 //Calcular diferencia de dias entre las fechas de inicio y fin
    		
    	    long startTime = p.getFinicioPrestamo().getTime();
    	    long endTime = p.getFfinPrestamo().getTime();
            long diffTime = endTime - startTime;
    	    int diffDays = (int) Math.floor(diffTime / (1000 * 60 * 60 * 24));
    	     System.out.println(diffDays);
    	    // diffday son los dias en total que el lector se paso 
    	     
    	     if (diffDays >30)
    	     {
    	    	 //Hay que multar
    	    	// se paso cantdiasMulta eso hay que sumar 
    	    	long cantdiasMulta = (diffDays - 30) * 2;
    	    	//Pasamos dias a milisegundos para obtener fecha de fin de la multa
    	    	cantdiasMulta = cantdiasMulta *1000 *60 *60 *24;
    	    	// long finMulta = endTime + cantdiasMulta;
    	    	 Date multadays = new Date();
    	    	 multadays.setTime(cantdiasMulta);
    	    	 // Multamos
    	    	 unLector.setMulta(new Multa(fechaActual,multadays));
    	    	 
    	    	 
    	     }else {
    	    	 // Se tiene que sacar de los prestamos el libro.
    	    	 unLector.getPrestamo().remove(p);
    	    	 unLibro.setEstado(EstadoCopia.Biblioteca);
    	    	 System.out.println("¡Copia devuelta correctamente!");
    	    	
    	    	 
    	     }

    				
    	 }else {
    		 
    		 throw new BibliotecaException("El lector no posee la copia..");
 
    	 }
    	 
     }
	
}
