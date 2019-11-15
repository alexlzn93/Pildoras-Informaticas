package curso.usuario;

public class Persona {

	public String nombre;
	public int edad;
	
	public Persona() {
		this("Sin nombre");
	}
	
	public Persona(String nombre) {
		this(nombre, 90);
	}
	
	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
}
