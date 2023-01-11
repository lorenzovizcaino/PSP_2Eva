package sincronizar1;
/*Implementa una clase contador, con un atributo entero y 3 metodos (incrementa. decrementa, y getValor)

Definir 2 tipos de hilo (hiloInc, hiloDec), uno para decrementar y otro para incrementar dicho contador (ejecutaran un bucle de X iteraciones,
en las que se modifique el valor del contador segun corresponda, y a continuacion un Thread.sleep), que cuenten con un
atributo interno de tipo Contador.

En el main, crear 2 hilos, uno de cada clase, que trabajen sobre un mismo objeto Contador.
 */
public class Contador{
    private int entero;

    public Contador(int entero) {
        this.entero = entero;
    }

    synchronized public void Incrementa(){
        entero++;
    }

    synchronized public void Decrementa(){
        entero--;
    }

    synchronized public int getValor(){
        return entero;
    }

}
