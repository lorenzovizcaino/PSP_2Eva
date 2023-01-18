package cuenta;

public class RetiradaDeCajero extends Thread{
    Cuenta cuenta;
    double retirada;


    public RetiradaDeCajero(Cuenta cuenta, String nombre, double retirada) {
        super(nombre);
        this.cuenta = cuenta;
        this.retirada=retirada;

    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            if(cuenta.getSaldo()<retirada){
                System.out.println(getName()+", No hay suficiente saldo");
                break;
            }else{
                cuenta.restarSaldo(retirada);
                System.out.println(getName()+" ha retirado " + retirada);
            }

        }

    }
}
