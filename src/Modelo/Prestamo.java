package Modelo;
import java.util.Date;

public class Prestamo {

	private Copia unLibro;
	private Lector unLector;
	private Date finicioPrestamo;
	private Date FfinPrestamo= new Date();
	

	public Prestamo(Copia unLibro, Lector unLector, Date finicioPrestamo) {
		super();
		this.unLibro = unLibro;
		this.unLector = unLector;
		this.finicioPrestamo = finicioPrestamo;
	}
	
	
	public Copia getUnLibro() {
		return unLibro;
	}
	public void setUnLibro(Copia unLibro) {
		this.unLibro = unLibro;
	}
	public Lector getUnLector() {
		return unLector;
	}
	public void setUnLector(Lector unLector) {
		this.unLector = unLector;
	}
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

	
}
