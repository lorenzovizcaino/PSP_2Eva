package productorConsumidorEj2;
/*
Usando el modelo productor-consumidor, crea un productor que lea caracteres de
un fichero de texto cuyo nombre recibira a traves de su constructor.
El consumidor obtendra los datos que produzca el productor y los mostrara
por pantalla.
Muestra al final del proceso del productor y del consumidor un mensaje indicando que el proceso ha finalizado
 */
public class Cola {
    private char contenido;
    private boolean lleno =false;

    public synchronized char vaciar(){
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

    public synchronized void llenar (char numero){
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
