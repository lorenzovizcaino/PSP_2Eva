package ejcontadorhilos;

public class Main {
    public static void main(String[] args) {
        ThreadGroup grupo = new ThreadGroup("Grupo de hilos");

        SubClase h1 = new SubClase("SI");
        SubClase h2 = new SubClase("NO");


        Thread hilo1 = new Thread(grupo, h1, "hilo1");
        Thread hilo2 = new Thread(grupo, h2, "hilo2");

        hilo1.start();
        hilo2.start();



    }
}
