package ejercicio2;

public class Main {
    public static void main(String[] args) {
        new Thread(new HolaMundo("Antonio")).start();
        new Thread(new HolaMundo("REMI")).start();
        new Thread(new HolaMundo("Oscar")).start();
        new Thread(new HolaMundo("VICKY")).start();
        new Thread(new HolaMundo("ANTIA")).start();



    }
}
