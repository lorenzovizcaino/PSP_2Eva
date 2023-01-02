package ejcontadorhilos;


public class SubClase extends Thread{
    static int contador=0;
    String cadena;

    public SubClase(String name) {
        super();
        cadena=name;

    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.print(++contador+":"+cadena+" ");
        }
    }
}
