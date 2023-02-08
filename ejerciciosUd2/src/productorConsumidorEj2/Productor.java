package productorConsumidorEj2;

import java.io.File;

public class Productor extends Thread{
    private Cola cola;
    private String frase;

    public Productor(String frase, Cola cola) {
        this.frase=frase;
        this.cola = cola;
    }

    @Override
    public void run() {
        for (int i = 0; i <frase.length() ; i++) {
            cola.llenar(frase.charAt(i));
            System.out.println("El productor pone el caracter "+frase.charAt(i));
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
