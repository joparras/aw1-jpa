package clase3.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity 
public class Producto {
	@Id
	String codigo; 
	String descripcion; 
	Integer stock; 
	double precio; 
	String categoria; 
	
}
