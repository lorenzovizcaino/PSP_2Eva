package ex2;

public class Consumidor extends Thread {
	private Cola cola;
	private int n;

	public Consumidor(Cola c, int n) {
		cola = c;
		this.n = n;
	}

	public void run() {
		char[] caracteres;
		String texto;
		do {
			texto = cola.consumir();
			if (!texto.equals("*")) {
				caracteres = texto.toUpperCase().toCharArray();

				for (char car : caracteres) {
					System.out.println(car);
				}
			}
		} while (!texto.equals("*"));
	}
}
