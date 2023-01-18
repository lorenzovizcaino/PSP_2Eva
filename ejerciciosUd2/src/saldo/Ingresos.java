package saldo;

public class Ingresos extends Thread{
    Saldo saldo;
    double ingreso;

    public Ingresos(Saldo saldo, double ingreso, String nombre) {
        super(nombre);
        this.saldo = saldo;
        this.ingreso = ingreso;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            saldo.ingreso(ingreso);
        }
    }
}
