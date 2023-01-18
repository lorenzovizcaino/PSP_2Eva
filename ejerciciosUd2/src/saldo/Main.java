package saldo;

public class Main {
    public static void main(String[] args) {
        Saldo saldo=new Saldo(500);
        Ingresos Maria=new Ingresos(saldo,100,"Maria");
        Ingresos Jose=new Ingresos(saldo,10,"Jose");
        Maria.start();
        Jose.start();
        try {
            Maria.join();
            Jose.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("En la cuenta hay actualmente "+saldo.getSaldo());
    }
}
