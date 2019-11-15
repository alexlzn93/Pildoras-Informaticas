package curso.usuario;

public class Padre {

	public String nombre;
    public int edad;
		
	public Padre() {
		nombre = "jose";
		edad = 29;
	}
			
	public Padre(String nombre) {
		this.nombre = nombre;
		edad = 0;
	}
	
	public Padre(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public void mostrar() {
		System.out.println("Nombre: " + nombre);
	}
	
	public int getEdad() {
		return edad;
	}
	
}
