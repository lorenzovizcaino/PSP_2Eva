package productorConsumidorEj1;
/*
Implementar una aplicacion compuesta por 3 clases:
Una Cola, que sera el Objeto compartido.
Un Productor y un Consumidor.
El productor generara 10 numeros, y los insertara en el objeto Cola,
tras hacer un sleep.
El consumidor los leera, y los mostrara por pantalla.
 */
public class Cola {
    private int contenido;
    private boolean lleno = false;

    public synchronized int vaciar(){
        while(!lleno){
            try {
                wait();
            } catch (InterruptedException e) {
                System.err.println(e.getMessage());
            }

        }
        lleno=false;
        notifyAll();
        return contenido;
    }

    public synchronized void llenar (int numero){
        while(lleno){
            try {
                wait();
            } catch (InterruptedException e) {
                System.err.println(e.getMessage());
            }
        }
        lleno=true;
        contenido=numero;
        notifyAll();
    }
}
