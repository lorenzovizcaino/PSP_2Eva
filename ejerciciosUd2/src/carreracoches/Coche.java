package carreracoches;

public class Coche implements Runnable{

    @Override
    public void run() {
        String camino ="";

        for (int i = 0; i < 50; i++) {
            try {
                Thread.sleep((long) (Math.random()*1000));
                camino+="|";
                System.out.println(Thread.currentThread().getName()+": "+camino);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(Thread.currentThread().getName()+" Ha llegado");
    }
}
