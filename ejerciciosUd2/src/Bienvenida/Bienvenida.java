package Bienvenida;
/*
Se trata de simular el comienzo de una clase.
Los alumnos llegarán y esperarán hasta que llegue el profesor y salude para que comience la clase.
Los alumnos y el profesor compartirán un objeto de la clase Bienvenida, con dos métodos sincronizados:
* Uno donde los alumnos llegan y saludan al profesor (se quedan esperando mientras el profesor no llegue)
* Otro donde el profesor llega e indica que la clase puede comenzar, notificándoselo a los alumnos.
 */
public class Bienvenida {

    private boolean bandera;
    public Bienvenida() {
        bandera=false;

    }

    public boolean isBandera() {
        return bandera;
    }

    public void setBandera(boolean bandera) {
        this.bandera = bandera;
    }

    synchronized public void SaludoAlumnos(){
        while(!bandera){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("Buenos dias profesor");
    }

    synchronized public void LlegadaProfesor(String nombre){
        System.out.println("Buenos dias, sou el profesor "+nombre+" Vamos a empezar la clase");
        bandera=true;

    }

}
