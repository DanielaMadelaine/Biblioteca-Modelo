package Persistencia;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import Modelo.Autor;

public class AutorDAO {

	private static EntityManagerFactory managerFactory = Persistence
			.createEntityManagerFactory("biblioHibernate");

	public void agregarAutor(Autor a) throws Exception {
		EntityManager em = managerFactory.createEntityManager();
		EntityTransaction tran = em.getTransaction();
		tran.begin();
		em.persist(a);
		tran.commit();
		em.close();

	}
	
	
	public void ConsultarAutores() {
	}
}
