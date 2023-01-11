package sincronizar1;

public class HiloDec extends Thread{
    Contador contador;

    public HiloDec(Contador contador, String nombre) {
        super(nombre);
        this.contador = contador;
    }


    public void run() {
        for (int i = 0; i <10 ; i++) {
            contador.Decrementa();
            try {
                sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
        System.out.println(getName()+": "+contador.getValor());

    }
}
