package ej4;

public class Numeros extends Thread{
    int inicio;
    int fin;
    String nombreHilo;

    public Numeros(int inicio, int fin, String nombreHilo) {
        this.inicio = inicio;
        this.fin = fin;
        this.nombreHilo = nombreHilo;
    }

    @Override
    public void run() {
        System.out.println(nombreHilo+ " Empieza");
        while(fin>=inicio){
            System.out.println(nombreHilo+" dice "+inicio);
            inicio++;
        }
        System.out.println(nombreHilo+" Acaba");
    }
}
