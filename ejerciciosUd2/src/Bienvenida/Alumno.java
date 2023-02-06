package Bienvenida;
/*
Se trata de simular el comienzo de una clase.
Los alumnos llegarán y esperarán hasta que llegue el profesor y salude para que comience la clase.
Los alumnos y el profesor compartirán un objeto de la clase Bienvenida, con dos métodos sincronizados:
* Uno donde los alumnos llegan y saludan al profesor (se quedan esperando mientras el profesor no llegue)
* Otro donde el profesor llega e indica que la clase puede comenzar, notificándoselo a los alumnos.
 */
public class Alumno extends Thread{
    Bienvenida bienvenida;
    String nombre;

    public Alumno(Bienvenida bienvenida, String nombre) {
        super(nombre);
        this.bienvenida = bienvenida;
        this.nombre=nombre;
    }

    @Override
    public void run() {
        System.out.println("El Alumno "+getName()+" llego");
        try {
            Thread.sleep(1000);
            bienvenida.SaludoAlumnos(nombre);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
