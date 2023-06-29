package clase3.entidades;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class ProductoDAOImpl implements ProductoDAO{

	@Override
	public List<Producto> listar() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("farmacia_db"); 
		EntityManager entityManager = entityManagerFactory.createEntityManager(); 
		
		TypedQuery<Producto> query = entityManager.createQuery("select p from Producto p", Producto.class); 
		List<Producto> productos = query.getResultList(); 
		return productos; 
	}

	@Override
	public Producto obtenerPorId(String codigo) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("farmacia_db"); 
		EntityManager entityManager = entityManagerFactory.createEntityManager(); 
		Producto producto = entityManager.find(Producto.class, "JLK-123"); 
		return producto; 
	}

	@Override
	public Producto registrar(Producto producto) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("farmacia_db"); 
		EntityManager entityManager = entityManagerFactory.createEntityManager(); 
		
		entityManager.getTransaction().begin();
		entityManager.persist(producto);
		entityManager.getTransaction().commit();
		
		return producto; 
	}

	@Override
	public Producto editar(Producto producto) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("farmacia_db"); 
		EntityManager entityManager = entityManagerFactory.createEntityManager(); 
		
		entityManager.getTransaction().begin();
		Producto productoMerge = entityManager.merge(producto);
		entityManager.getTransaction().commit();
		return productoMerge; 
	}

	@Override
	public void eliminaporId(String id) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("farmacia_db"); 
		EntityManager entityManager = entityManagerFactory.createEntityManager(); 
		
		entityManager.getTransaction().begin();
		Producto producto = entityManager.find(Producto.class, id);
		entityManager.remove(producto);
		entityManager.getTransaction().commit();
	}

	
}
