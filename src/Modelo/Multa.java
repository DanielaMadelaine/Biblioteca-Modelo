package Modelo;

import java.util.Date;

public class Multa {

	private Lector unlector;
	private Date Finicio;
	private Date Ffin;
	
        public Lector getunlector(){
        return unlector;
         }
         
         public void setunlector(Lector l){
         unlector= l;
         }
       
	
	public Date getFinicio() {
		return Finicio;
	}
	public void setFinicio(Date finicio) {
		Finicio = finicio;
	}
	public Date getFfin() {
		return Ffin;
	}
	public void setFfin(Date ffin) {
		Ffin = ffin;
	}

	//agregar constructor y métodos 
	
	
}
