package poo;

public class Coche { // caracteristicas comunes

	private int ruedas; // al poner private lo que hago es encapsular los datos para que no se puedan
						// modificar en otra clase
	private int largo;
	private int ancho;
	private int motor;
	private int peso_plataforma;
	String color;
	int peso_total;
	boolean asientos_cuero, climatizador; // devuelve un true o false

	public Coche() { // Metodo constructor Sintaxis: public\private\protected Clase() {}
		ruedas = 4;
		largo = 2000;
		ancho = 300;
		motor = 1600;
		peso_plataforma = 500;
        color= "azul"; //da igual lo que ponga aqui porque el metodo setter modifica siempre su valor
		
	}

	public String dime_largo() { // METODO GETTER:PARA ACCEDER A LAS PROPIEDADES ENCAPSULADAS
		return "El largo del coche es " + largo;
	}

	public String dime_ancho() { // METODO GETTER
		return "El ancho del coche es " + ancho;
	}

	public void establece_color() { // METODO SETTER COLOR
		color = "verde"; // modifica el valor de lo que haya en la variable color
	}

	public String dime_color() { // GETTER
		return "El color del coche es " + color;
	}
}
