package productorConsumidorEj1;

public class Main {
    public static void main(String[] args) {
        Cola cola=new Cola();
        new Productor(cola).start();
        new Consumidor(cola).start();
    }
}
