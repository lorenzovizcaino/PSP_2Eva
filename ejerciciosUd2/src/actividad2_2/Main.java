package actividad2_2;

import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) {
        new Thread(new Hilo1()).start();
        new Thread(new Hilo2()).start();
    }



}

class Hilo1 implements Runnable{

    @Override
    public void run() {
        while(true){
            System.out.print(" TIC ");
            try {
                sleep(30);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}


class Hilo2 implements Runnable{
    @Override
    public void run() {
        while(true){
            System.out.print(" TAC ");
            try {
                sleep(40);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}