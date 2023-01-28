package factorial2;
/**
 * Hacer un programa que calcule los factoriales del 5 al 14 modificando la clase Factorial del ejercicio anterior,
 * para que se visualicen los mensajes:
 * empieza el proceso … cálculo del factorial de: XX
 * acabó el proceso ….. el factorial de: XX es XXXX
 * en el método main declarar un vector o array de 10 hilos y lanzarlos a ejecución.
 * */
public class Main {
    public static void main(String[] args) {
        int[] array={5,6,7,8,9,10,11,12,13,14};
        String cadena ="FactorialDe";
        String nombre;
        for (int numeros:array) {
            nombre=cadena+numeros;
            Factorial x=new Factorial(numeros);
            x.setName(nombre);
            x.start();

        }
    }
}
