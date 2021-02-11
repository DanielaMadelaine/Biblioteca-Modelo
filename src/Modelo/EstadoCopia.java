package Modelo;

public class EstadoCopia {

	private int idEstado;
	private String Desc;
	
	
	public EstadoCopia(int idEstado, String desc) {
		super();
		this.idEstado = idEstado;
		Desc = desc;
	}
	
	
	public int getIdEstado() {
		return idEstado;
	}
	public void setIdEstado(int idEstado) {
		this.idEstado = idEstado;
	}
	public String getDesc() {
		return Desc;
	}
	public void setDesc(String desc) {
		Desc = desc;
	}


	@Override
	public String toString() {
		return "EstadoCopia [idEstado=" + idEstado + ", Desc=" + Desc + "]";
	}
	
	
	
	
	
}
