package Bienvenida;
/*
/*
Se trata de simular el comienzo de una clase.
Los alumnos llegarán y esperarán hasta que llegue el profesor y salude para que comience la clase.
Los alumnos y el profesor compartirán un objeto de la clase Bienvenida, con dos métodos sincronizados:
* Uno donde los alumnos llegan y saludan al profesor (se quedan esperando mientras el profesor no llegue)
* Otro donde el profesor llega e indica que la clase puede comenzar, notificándoselo a los alumnos.
 */

public class Profesor extends Thread{
    Bienvenida bienvenida;
    String quien;

    public Profesor(Bienvenida bienvenida, String quien) {
        super(quien);
        this.quien=quien;
        this.bienvenida = bienvenida;
    }


    @Override
    public void run() {
        bienvenida.ComienzoClase();
        bienvenida.setBandera(true);

    }
}
