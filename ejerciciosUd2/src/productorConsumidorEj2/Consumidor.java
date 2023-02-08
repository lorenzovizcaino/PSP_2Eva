package productorConsumidorEj2;

public class Consumidor extends Thread{
    Cola cola;
    int longitudFrase;
    public Consumidor(Cola cola, int longitudFrase) {
        this.cola = cola;
        this.longitudFrase=longitudFrase;
    }

    @Override
    public void run() {
        char caracter;
        for (int i = 0; i <longitudFrase ; i++) {
            caracter= cola.vaciar();
            System.out.println("Consumidor toma el valor "+ caracter);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
