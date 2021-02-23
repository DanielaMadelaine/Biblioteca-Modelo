package WebService;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import Modelo.Autor;
import Persistencia.AutorDAO;

@WebService
public class AutorService {

	
	@WebMethod(operationName="AgregarAutorWS") public boolean agregarAutor(@WebParam(name="Autor")Autor unAutor)
	{
		AutorDAO dao = new AutorDAO();
		try {
			dao.agregarAutor(unAutor);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return true;
	}
	
	
	@WebMethod(operationName="ConsultarAutorWS") public boolean consultarAutor()
	{
		AutorDAO dao = new AutorDAO();
		try {
			
			dao.ConsultarAutores();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return true;
	}
	
	
}
