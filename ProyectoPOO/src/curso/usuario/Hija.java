package curso.usuario;

public class Hija extends Padre {

	public String nombre;
	public String dni;
	
	public Hija() {
		super("Lucas", 34);
	}
	
	public Hija(String n, int e, String d) {
		super(n, e);
		dni = d;
	}
	
	public void mostrar() {
		System.out.println("Nombre: " + nombre + " - " + "dni: " + dni);
	}
	
	public void visualizar() {
		System.out.println("Dni: " + dni);
	}
	
	public int dimeEdad() {
		int rdo = super.getEdad();
		return rdo + 2;
	}
	
	
}
