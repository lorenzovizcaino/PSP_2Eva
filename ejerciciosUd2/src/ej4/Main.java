package ej4;

public class Main {
    public static void main(String[] args) {
        Numeros n1=new Numeros(1,10,"ThreadA");
        Numeros n2=new Numeros(20,30,"ThreadB");

        Thread hilo1=new Thread(n1);
        Thread hilo2=new Thread(n2);
        System.out.println("Vamos a iniciar los dos threads");
        hilo1.start();
        hilo2.start();
        System.out.println("Hilos inicializados");
        System.out.println("Programa principal terminado");

    }
}
