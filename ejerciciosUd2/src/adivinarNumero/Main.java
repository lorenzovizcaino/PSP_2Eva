package adivinarNumero;

public class Main {
    public static void main(String[] args) {
        Arbitro arbitro=new Arbitro("Arbitro");
        Jugador jugador1=new Jugador(arbitro,1,"Jugador 1");
        Jugador jugador2=new Jugador(arbitro,2,"Jugador 2");
        Jugador jugador3=new Jugador(arbitro,3,"Jugador 3");
        Jugador jugador4=new Jugador(arbitro,4,"Jugador 4");
        System.out.println("NUMERO A ADIVINAR: "+arbitro.getNum());
        jugador1.start();
        jugador2.start();
        jugador3.start();
        jugador4.start();

    }
}
