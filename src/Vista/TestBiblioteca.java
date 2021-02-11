package Vista;

import java.sql.Date;
import java.util.ArrayList;
import Modelo.Autor;
import Modelo.Biblioteca;
import Modelo.Copia;
import Modelo.EstadoCopia;
import Modelo.TipoLibro;

public class TestBiblioteca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// cargamos los tipo de libro
		
		TipoLibro tipo1= new TipoLibro(1, "Novela");
		TipoLibro tipo2= new TipoLibro(2, "Teatro");
		TipoLibro tipo3= new TipoLibro(3, "Poesia");
		TipoLibro tipo4= new TipoLibro(4, "Ensayo");
		
		System.out.println(tipo1);
		
		//cargamos los autores
		
		Date nac = new Date(121,8,24);
		Date nac2 = new Date(121,8,26);
		Date nac3 = new Date(121,7,31);
		Date nac4 = new Date(121,10,16);
		Date nac5 = new Date(121,8,24);
		
		Autor autor1= new Autor("Jorge Borges","Argentina",nac);
		Autor autor2= new Autor("Julio Cortaza","Argentina", nac2);
		Autor autor3= new Autor("J.K Rowling","Britanica", nac3);
		Autor autor4= new Autor("Oscar Wilde","Irlandes", nac4);
		
		
		System.out.println(autor1);
		System.out.println(autor2);
		System.out.println(autor3);
		System.out.println(autor4);
		
		//Estados
		
		
		EstadoCopia estado = new EstadoCopia(1, "Prestado");
		EstadoCopia estado2 = new EstadoCopia(2, "Biblioteca");
		EstadoCopia estado3 = new EstadoCopia(3, "Retraso");
		EstadoCopia estado4 = new EstadoCopia(4, "Reparacion");
	
		
		
		// cargamos los libros
		
		Copia libro1 = new Copia("Harry Poter Saga", tipo1,"Salamandra",1997, autor3);
		Copia libro2 = new Copia("Harry Poter Saga", tipo2,"Salamandra",1997, autor4);
		
		System.out.println(libro1);
		
		ArrayList<Copia> libros = new ArrayList<Copia>();
		libros.add(libro1);
		libros.add(libro2);
		
		// BIBLIOTECA
		
		Biblioteca obj = new Biblioteca ();
		
		obj.setCopias(libros);
		
		System.out.println(obj.getCopias());
		

	}

}
