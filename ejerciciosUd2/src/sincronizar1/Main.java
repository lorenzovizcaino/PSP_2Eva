package sincronizar1;

public class Main {
    public static void main(String[] args) {
        Contador obj=new Contador(10);
        HiloInc hI=new HiloInc(obj,"hilo1");
        HiloDec hD=new HiloDec(obj,"hilo2");
        hI.start();
        hD.start();
        try {
            hI.join();
            hD.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(obj.getValor());
    }





}
