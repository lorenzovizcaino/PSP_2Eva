package productorConsumidorApuntes;

public class Recipiente {
    private int contenido;
    private boolean lleno = false;

    public synchronized int vaciar() {
        while (lleno == false) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Interrupcion del hilo ... ");
            }
        }
        lleno = false;
        notifyAll();
        return contenido;
    }

    public synchronized void llenar (int valor) {
        while (lleno == true) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Interrupcion del hilo ... ");
            }
        }
        contenido = valor;
        lleno = true;
        notifyAll();
    }

}
