package productorConsumidorEj1;

public class Consumidor extends Thread{
    Cola cola;

    public Consumidor(Cola cola) {
        this.cola = cola;
    }

    @Override
    public void run() {
        int numero=0;
        for (int i = 0; i < 10; i++) {
            numero= cola.vaciar();
            System.out.println("Consumidor toma el valor: "+numero);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                System.err.println(e.getMessage());
            }
        }
    }
}
