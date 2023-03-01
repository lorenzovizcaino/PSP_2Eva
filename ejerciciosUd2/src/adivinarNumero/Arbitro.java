package adivinarNumero;
public class Arbitro {
    private int num;
    private int turnos;
    private String nombre;
    private boolean adivinado;
    public Arbitro(String nombre) {
        this.nombre = nombre;
        num=(int)(Math.random()*10);
        turnos =1;
        adivinado=false;
    }
    public synchronized int getNum() {
        return num;
    }
    public synchronized boolean turno(int id){
            if(turnos >4){
                turnos =1;
            }
            while (turnos !=id && adivinado==false){
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        return true;
    }
    public synchronized void next() {
        turnos++;
        notifyAll();
    }

    public synchronized boolean isAdivinado() {
        return adivinado;
    }

    public synchronized void setAdivinado(boolean adivinado) {
        this.adivinado = adivinado;
    }
}
