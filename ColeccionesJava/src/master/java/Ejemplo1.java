package master.java;

import java.util.ArrayList;
import java.util.List;
import cice.master.java.ficheros.Fichero;

public class Ejemplo1 {

	public static void procesarListas() {
		ArrayList lista = new ArrayList();
		lista.add(5); //integer
		lista.add("lucas");  //String
		lista.add(123.78);  //double
		lista.add((byte)7);  //byte
		for (Object elemento : lista) {  //Todos los tipos vienen de Object (clase madre)
			if (elemento instanceof Integer) {
				Integer n = (Integer)elemento;  //cast(Integer)
				System.out.println(n + " Es un Integer");
			}
			if (elemento instanceof String) {
				String n = (String)elemento;  //cast (String)
				System.out.println(n + " Es un String");
			}
			if (elemento instanceof Double) {
				Double n = (Double)elemento;  //cast(Double)
				System.out.println(n + " Es un Double");
			}
			if (elemento instanceof Byte) {
				Byte n = (Byte)elemento;  //cast(Byte).
				System.out.println(n + " Es un Byte");
			}
		}
	}
	
	public static void procesarListasConTipo() {
		ArrayList<Float> enteros = new ArrayList<Float>(); ////la coleccion solo admiten Objetos ej:Integer,Float,Double,String...
		enteros.add(8.9F);
		enteros.add(18.9F);
		enteros.add(28.9F);
		enteros.add(438.9F);
		enteros.add(58.9F);
		for (int indice = 0; indice < enteros.size(); indice++) {
			System.out.println(enteros.get(indice));
		}
		for (Float elemento : enteros) {  //bucle for-each
			System.out.println(elemento);
		}
		enteros.forEach(x -> System.out.println(x));
		//enteros.add("lucas");
		//enteros.add(123.8);	
	}
	
	public static void procesarArchivoTexto() {
		String nombreArchivo = "F:\\proyectos\\datasets\\usuarios.txt";
		List<String> textoArchivo = Fichero.leerTextoArchivoLista(nombreArchivo);
		for (String linea : textoArchivo) {
			System.out.println(linea);
		}
	}
	
	public static void procesarTexto() {
		String nombreArchivo = "C:\\Users\\Alex\\Downloads\\Montecristo"; //"F:\\proyectos\\datasets\\montecristo.txt"
		String texto = Fichero.leerTextoArchivo(nombreArchivo);
		//numero de palabras del texto Montecrsito
		
		ArrayList<String> palabras = new ArrayList<String>();
		for (String palabra : texto.split(" ,;:-\\.")) palabras.add(palabra); //en el split meto todos los caracteres para separar las cadenas de caracteres de montecristo.txt
		//numero de caracteres del texto Montecristo
		
		ArrayList<Integer> caracteres = new ArrayList<Integer>();
		for (String palabra : palabras) caracteres.add(palabra.length());
		//mostrar el numero de palabras iguales del texto montecristo
		
		ArrayList<String> palabrasiguales = new ArrayList<String>();
		for (String palabra : texto.compareToIgnoreCase(palabras)) palabrasiguales.add(palabra);
		if (palabras==palabras) {
			System.out.println(palabrasiguales + "Palabras iguales");
		}
		
	}
	
}
