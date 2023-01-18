package cuenta;
/*
Crear una clase Cuenta, con un atributo saldo y 3 metodos:
* Uno que devuelva el importe del saldo
* Otro resta al saldo el importe a retirar de la cuenta (modifica el saldo)
* Otro que realice las comprobaciones para verificar que se puede efectuar la retirada (el importe final debe de
ser 0 o superior), enviando en caso contrario el aviso correspondiente.

Posteriormente, crear otra clase denominada RetiradaDeCajero, que extienda de Thread. Cada hilo que se crea de esta
clase, recibira un nombre concreto al ser creado, y trabajara sobre un objeto cuenta. Dentro de su metodo run(),
 se intentara realizar un numero x de retiradas.

 En el main, crear 2 hilos, uno para cada titular de la cuenta (Pepe, Maria).

 Observaciones: el objeto Cuenta, sera compartido por varios hilos.
 */
public class Cuenta {
    private double saldo;

    public Cuenta(double saldo) {
        this.saldo = saldo;
    }

     synchronized public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

     synchronized public void restarSaldo(double retirada){
        boolean sePuede=comprobarOperacion(retirada);
        if(sePuede){
            saldo-=retirada;
        }else{
            System.out.println("No se puede retirar tanto dinero");
        }
    }

     synchronized private boolean comprobarOperacion(double retirada) {
        if(saldo<retirada){
            return false;
        }else{
            return true;
        }
    }
}
