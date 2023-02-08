package ex2;

public class Consumidor extends Thread {
	private Cola cola;
	private int n;

	public Consumidor(Cola c, int n) {
		cola = c;
		this.n = n;
	}

	public void run() {
		String[] caracteres;
		String texto;
		do {
			texto = cola.get();
			if (!texto.equals("*")) {
				caracteres = texto.toUpperCase().split("");
				for (String car : caracteres) {
					System.out.println(car);
				}
			}
		} while (!texto.equals("*"));
	}
}
