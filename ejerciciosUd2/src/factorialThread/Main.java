package factorialThread;

public class Main {
    public static void main(String[] args) {
        Factorial hilo1=new Factorial(6);
        Factorial hilo2=new Factorial(7);
        hilo1.setName("F1");
        hilo2.setName("F2");
        hilo1.run();
        hilo2.run();

        try {
            hilo1.join();
            hilo2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("FIN");
    }
}
