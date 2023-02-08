package ex2;

import java.util.Scanner;

public class Productor extends Thread {
	private Cola cola;
	private int n;

	public Productor(Cola c, int n) {
		cola = c;
		this.n = n;
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		String cad;

		do {
			System.out.println("Introduzca cadena para convertir: (* para salir) ");
			cad = sc.nextLine();
			if (!cad.equals("*"))
				cola.put(cad);
			try {
				sleep(100);
			} catch (InterruptedException e) {
			}

		} while (!cad.equals("*"));
	}
}
