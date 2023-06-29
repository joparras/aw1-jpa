package clase3.entidades;

import java.util.List;

public interface ProductoDAO {
	List<Producto> listar(); 
	Producto obtenerPorId(String codigo);
	void eliminaporId(String id); 
	Producto registrar(Producto producto); 
	Producto editar(Producto producto); 
	
}
