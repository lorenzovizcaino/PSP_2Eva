package ejercicio1;

public class HolaMundo extends Thread{


    @Override
    public void run() {

        System.out.println("Hola mundo: " +getName());
    }
}
