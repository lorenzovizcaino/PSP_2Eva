package ejercicio1;

public class Main {

    public static void main(String[] args) {
        HolaMundo h1=new HolaMundo();
        HolaMundo h2=new HolaMundo();
        HolaMundo h3=new HolaMundo();
        HolaMundo h4=new HolaMundo();
        HolaMundo h5=new HolaMundo();
        h1.setName("hilo1");
        h2.setName("hilo2");
        h3.setName("hilo3");
        h4.setName("hilo4");
        h5.setName("hilo5");
        h1.start();
        h2.start();
        h3.start();
        h4.start();
        h5.start();


    }
}
