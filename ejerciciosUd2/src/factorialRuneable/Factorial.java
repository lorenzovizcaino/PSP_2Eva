package factorialRuneable;
/*
Hacer un programa que calcule el factorial. Cada uno de los calculos tiene que ser realizado por un hilo independiente.
Implementar los procesos de 2 maneras diferentes:
    a)Heredando de la clase Thread.
    b)Implementando la interfaz Runnable
 */
public class Factorial implements Runnable{
    int numero;

    public Factorial(int numero) {
        this.numero = numero;
    }


    @Override
    synchronized public void run() {
        int resultado=numero;
        while(numero>1){
            numero--;
            resultado=resultado*numero;
        }
        System.out.println(Thread.currentThread().getName()+"="+resultado);
    }
}
