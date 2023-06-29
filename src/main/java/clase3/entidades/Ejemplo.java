package clase3.entidades;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Ejemplo {

	public static void main(String[] args) {
		//Producto producto = new Producto(); 
		//producto.codigo="JKL-123"; 
		//producto.categoria="Laxante, Antiacido"; 
		//producto.descripcion="Sal de andrews"; 
		//producto.precio=0.7; 
		//producto.stock=100; 
		
		Persona persona = new Persona(); 
		persona.dni = "7558552"; 
		persona.nombre="Arthur";
		persona.apellido="Mauricio"; 
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("farmacia_db"); 
		EntityManager entityManager = entityManagerFactory.createEntityManager(); 
		
		entityManager.getTransaction().begin();
		entityManager.persist(persona);
		entityManager.getTransaction().commit();
	}
}
