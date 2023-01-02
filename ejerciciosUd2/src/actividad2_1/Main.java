package actividad2_1;

public class Main {
    public static void main(String[] args) {
        Hilo1 h1=new Hilo1();
        Hilo2 h2=new Hilo2();
        h1.start();
        h2.start();
    }



}

class Hilo1 extends Thread{

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


class Hilo2 extends Thread{
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