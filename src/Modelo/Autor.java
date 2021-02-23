package Modelo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table public class Autor {
	
	
	@Column @Id private String Nombre;
	@Column private String Nacionalidad;
	@Column private Date fechaNac;
	
	public Autor() {
		
	}
	
	public Autor(String nombre, String nacionalidad, Date fechaNac) {
		super();
		Nombre = nombre;
		Nacionalidad = nacionalidad;
		this.fechaNac = fechaNac;
	}
	
	
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getNacionalidad() {
		return Nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		Nacionalidad = nacionalidad;
	}
	public Date getFechaNac() {
		return fechaNac;
	}
	public void setFechaNac(Date fechaNac) {
		this.fechaNac = fechaNac;
	}


	@Override
	public String toString() {
		return "Autor: " + Nombre +"  "+ "Nacionalidad: " + Nacionalidad +"  "+ "Fecha Nacimiento: " + fechaNac;
	}
	
	

}
