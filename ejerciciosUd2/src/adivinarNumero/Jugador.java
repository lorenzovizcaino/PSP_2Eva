package adivinarNumero;


public class Jugador extends Thread {
    private Arbitro arbitro;
    private int id;
    private String nombre;


    public Jugador(Arbitro arbitro, int id, String nombre) {
        this.arbitro = arbitro;
        this.id = id;
        this.nombre = nombre;
    }

    @Override
    public void run() {
        int numero;
        while (arbitro.isAdivinado() == false) {
            if (arbitro.turno(id)) {
                   if(!arbitro.isAdivinado()){
                        numero = (int) (Math.random() * 10);
                        System.out.println(nombre + " dice: " + numero);
                        if (numero == arbitro.getNum()) {
                            System.out.println(nombre + " gana, adivino el numero!!!");
                            arbitro.setAdivinado(true);

                        } else {
                            if (id == 4) {
                                System.out.println("\tLe toca jugar a Jug" + (id - 3));
                            } else {
                                System.out.println("\tLe toca jugar a Jug" + (id + 1));
                            }
                        }
                        arbitro.next();
                    }
            }

        }
        System.err.println(nombre+" FINALIZADO");
    }
}
