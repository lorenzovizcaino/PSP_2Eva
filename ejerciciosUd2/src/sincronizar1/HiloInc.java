package sincronizar1;

public class HiloInc extends Thread{

    Contador contador;

    public HiloInc(Contador contador, String nombre) {
        super(nombre);
        this.contador = contador;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            contador.Incrementa();
            try {
                sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
        System.out.println(getName()+": "+contador.getValor());

    }
}
