package master.java;

import cice.master.java.cadenas.Cadenas;

public class Aplicacion {

	public static void main(String[] args) {
		
		IOperacion opera = new Mates();
		IOperacion nueva = new Nueva();
		
		System.out.println(opera.cubo(8));
		System.out.println(nueva.cubo(8));
		
		//Ejemplo1.procesarArchivoTexto();
		Ejemplo1.procesarTexto();
	}

}
