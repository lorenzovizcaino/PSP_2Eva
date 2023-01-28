package factorial2;
/**
 * Hacer un programa que calcule los factoriales del 5 al 14 modificando la clase Factorial del ejercicio anterior,
 * para que se visualicen los mensajes:
 * empieza el proceso … cálculo del factorial de: XX
 * acabó el proceso ….. el factorial de: XX es XXXX
 * en el método main declarar un vector o array de 10 hilos y lanzarlos a ejecución.
 * */
public class Factorial extends Thread{
    int numero;

    public Factorial(int numero) {
        this.numero = numero;
    }


    @Override
    synchronized public void run() {
        int copiaNumero=numero;
        int resultado=numero;
        System.out.println("Empieza el proceso . . . calculo del factorial de: "+numero);
        while(copiaNumero>1){
            copiaNumero--;
            resultado=resultado*copiaNumero;
        }

        System.out.println("Acabo el proceso . . . el factorial de: "+numero+" es: "+resultado);
    }
}
