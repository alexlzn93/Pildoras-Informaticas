package master.java;

public class Mates implements IOperacion {

	@Override
	public int cubo(int numero) {
		return (int)Math.pow(numero, 3);
	}

	public int doble(int numero) {
		return numero * 2;
	}
}
