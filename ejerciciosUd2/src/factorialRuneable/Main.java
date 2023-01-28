package factorialRuneable;

public class Main {
    public static void main(String[] args) {
        Factorial factorial1=new Factorial(6);
        Factorial factorial2=new Factorial(7);
        Factorial factorial3=new Factorial(8);
        Thread h1=new Thread(factorial1);
        Thread h2=new Thread(factorial2);
        Thread h3=new Thread(factorial3);
        h1.setName("HILO1");
        h2.setName("HILO2");
        h3.setName("HILO3");
        h1.start();
        h2.start();
        h3.start();
        try {
            h1.join();
            h2.join();
            h3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("FIN");

    }
}
