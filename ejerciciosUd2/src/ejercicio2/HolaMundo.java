package ejercicio2;

public class HolaMundo implements Runnable{
    String nombre;

    public HolaMundo(String nombre) {
       this.nombre=nombre;

    }

    @Override
    public void run() {
        try {
            Thread.sleep(Thread.currentThread().getId());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("hola Mundo "+nombre+" "+Thread.currentThread().getId());
    }
}
