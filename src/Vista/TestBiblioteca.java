package Vista;

import java.sql.Date;
import java.util.ArrayList;

import Excepciones.BibliotecaException;
import Modelo.Autor;
import Modelo.Biblioteca;
import Modelo.Copia;
import Modelo.EstadoCopia;
import Modelo.Lector;
import Modelo.Multa;
import Modelo.TipoLibro;
import Persistencia.AutorDAO;

public class TestBiblioteca {

	public static void main(String[] args) throws BibliotecaException  {
		// TODO Auto-generated method stub
		
		
		// Cargamos los tipos de libro
		
		TipoLibro tipo1= new TipoLibro(1, "Novela");
		TipoLibro tipo2= new TipoLibro(2, "Teatro");
		TipoLibro tipo3= new TipoLibro(3, "Poesia");
		
		
		System.out.println(tipo1);
		
		//Cargamos los autores
		// Cargue fechas placebo solo para hacer pruebas cambiar luego
		
		Date nac = new Date(121,8,24);
		Date nac2 = new Date(121,8,26);
		Date nac3 = new Date(121,7,31);
		Date nac4 = new Date(121,10,16);
	
		
		Autor autor1= new Autor("William Shakespeare","Ingles",nac);
		Autor autor2= new Autor("Victor Hugo","Frances", nac2);
		Autor autor3= new Autor("J.K Rowling","Britanica", nac3);
		Autor autor4= new Autor("Stephen King","Estadounidense", nac4);
		Autor autor5= new Autor("Jose Hernández","Argentino", nac4);
		Autor autor6= new Autor("Lope de Vega","Español", nac4);
		
		
		System.out.println(autor1);
		System.out.println(autor2);
		System.out.println(autor3);
		System.out.println(autor4);
		
		
		// Cargamos Lectores
		Lector LectorA = new Lector (121236,"Axel Haro","1163985212","Zapiola 5555");
		Lector LectorB = new Lector (121239,"Chloe Samson","1158214590","Ibera 5896");
		
		System.out.println(LectorA);
		// Cargamos los libros
		
		Copia libro1 = new Copia("Harry Poter Saga", tipo1,"Salamandra",1997, autor3, EstadoCopia.Retraso,12);
		Copia libro2 = new Copia("Animales fantasticos", tipo1,"Salamandra",2001, autor3, EstadoCopia.Biblioteca,13);
		Copia libro3 = new Copia("Carrie", tipo1,"Doubleday",1974, autor4, EstadoCopia.Biblioteca,14);
		Copia libro4 = new Copia("El resplandor", tipo1,"Doubleday",1977, autor4, EstadoCopia.Reparacion,15);
		Copia libro5 = new Copia("Los miserables", tipo2,"A. Lacroix, Verboeckhoven & Ce",1862, autor2, EstadoCopia.Prestado,22);
		Copia libro6 = new Copia("Romeo y Julieta", tipo3,"Planeta",1597, autor1, EstadoCopia.Biblioteca,16);
		Copia libro7 = new Copia("Martin Fierro", tipo3,"Ciudad Gotica",1872, autor5, EstadoCopia.Reparacion,30);
		Copia libro8 = new Copia("Fuenteovejuna", tipo2,"AGeBe",1619, autor6, EstadoCopia.Prestado,31);
		Copia libro9 = new Copia("Hamlet", tipo1,"Colihue",1603, autor1, EstadoCopia.Biblioteca,20);
		Copia libro10 = new Copia("El gato negro", tipo1,"Austral",1843, autor2, EstadoCopia.Prestado,24);
		//Agregar 2 copias mas de harry potter para probrar ..
		System.out.println(libro10.getEstado());
		
		ArrayList<Copia> libros = new ArrayList<Copia>();
		libros.add(libro1);
		libros.add(libro2);
		libros.add(libro3);
		libros.add(libro4);
		libros.add(libro5);
		libros.add(libro6);
		libros.add(libro7);
		libros.add(libro8);
		libros.add(libro9);
		libros.add(libro10);
		
		
		// BIBLIOTECA
		
		Biblioteca biblioteca = new Biblioteca ();
		
		biblioteca.setCopias(libros);
		
		//biblioteca.listarLibros();
		
		
		
		
		//biblioteca.PrestarLibro(libro2, LectorA);
		
		//biblioteca.PrestarLibro(libro5, LectorA);
		//LectorA.setMulta(new Multa(LectorA));
		///biblioteca.PrestarLibro(libro6, LectorA);
		//biblioteca.PrestarLibro(libro9, LectorA);
		
		//biblioteca.listarLibros();
		
		//biblioteca.DevolverLibro(libro4, LectorA);
		//biblioteca.DevolverLibro(libro2, LectorA);
		
		//LectorA.listarPrestamos();
		
		// Persistencia
		
	AutorDAO dao = new AutorDAO();
		try {
			dao.agregarAutor(autor6);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
