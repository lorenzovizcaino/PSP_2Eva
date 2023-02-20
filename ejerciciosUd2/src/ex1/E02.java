package ex1;

class Caja {
	double importe = 0;
	String nombre;

	public Caja(String n) {
		nombre = n;
	}

	public synchronized void sumarImporte(double importe) {
		this.importe += importe;
	}

	public double mostrarImporte() {
		return importe;
	}
}

class Terminal extends Thread {
	String nombre;
	Caja obj;
	double pagos = 0;

	public Terminal(String nombre, Caja c) {
		this.nombre = nombre;
		obj = c;
	}

	public void run() {
		double imp = 0;
		for (int i = 0; i < 200; i++) {
			imp = Math.random() * 100;
			obj.sumarImporte(imp);
			pagos+=imp;
		}
		System.out.println("Terminal: " + this.nombre + " factur� " + pagos);
	}

}

public class E02 {
	public static void main(String[] args) {
		double total;
		Caja compartido = new Caja("Caja central");

		Terminal t1 = new Terminal("terminal1", compartido);
		Terminal t2 = new Terminal("terminal2", compartido);
		Terminal t3 = new Terminal("terminal3", compartido);

		t1.start();
		t2.start();
		t3.start();

		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException ex) {
			System.out.println("Interrupci�n");
		}

		total = compartido.mostrarImporte();

		System.out.println("En total se factur� " + total + " euros.");
	}
}
