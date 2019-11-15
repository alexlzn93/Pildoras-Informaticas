package master.java;

public class Nueva implements IOperacion {

	@Override
	public int cubo(int numero) {
		return (int)Math.pow(numero, 3) + 10;
	}

}
