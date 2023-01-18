package saldo;
/*
Crea una clase Saldo, con un atributo que indique el saldo, y el constructor en el que se dará un valor inicial al saldo.
Contendrá también varios métodos:
* Uno para obtener el saldo (incluir sleep)
* Otro para modificarlo (incluir sleep)
* Otro que realice un ingreso. Recibe una cantidad y se la añade, informando por pantalla de quién ha realizado ese ingreso y la cantidad
resultante después del ingreso.

Crear otra clase Thread, que realice ingresos de saldo desde el run.

En el main, crear un objeto compartido Saldo por todos los hilos. Crear 3 hilos, cada uno con un nombre.
Esperar a la finalización de todos los hilos para mostrar el valor final del saldo.



 */
public class Saldo {
    private double saldo;

    public Saldo(double saldo) {
        this.saldo = saldo;
    }

    synchronized public void ingreso(double cantidad){
        saldo+=cantidad;
        System.out.println("SE HA REALIZADO UN INGRESO DE "+cantidad+" por parte de "+Thread.currentThread()+ " actualmente en la cuenta hay "+saldo);
    }

    synchronized public double getSaldo() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return saldo;
    }

    synchronized public void setSaldo(double saldo) {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        this.saldo = saldo;
    }
}
