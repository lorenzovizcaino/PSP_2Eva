package productorConsumidorEj1;

public class Productor extends  Thread{
    private Cola cola;


    public Productor(Cola cola) {
        this.cola = cola;

    }

    @Override
    public void run() {
        int numero;
        for (int i = 0; i <10 ; i++) {
            numero=(int)(Math.random()*100);
            cola.llenar(numero);
            System.out.println("Productor pone el numero: "+numero);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                System.err.println(e.getMessage());
            }
        }
    }
}
