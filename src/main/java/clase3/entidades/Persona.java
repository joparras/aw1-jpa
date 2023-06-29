package clase3.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Persona {
	
	@Id
	String dni; 
	String nombre; 
	String apellido; 
}
