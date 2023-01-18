package cuenta;

public class Main {
    public static void main(String[] args) {
        Cuenta cuenta=new Cuenta(5000);

        RetiradaDeCajero Maria=new RetiradaDeCajero(cuenta, "Maria",400);
        RetiradaDeCajero Pepe=new RetiradaDeCajero(cuenta, "Pepe",918);
        Maria.start();
        Pepe.start();
        try {
            Maria.join();
            Pepe.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Estado de la cuenta= "+ cuenta.getSaldo());
    }
}
