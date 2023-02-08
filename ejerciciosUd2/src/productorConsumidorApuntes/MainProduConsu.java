package productorConsumidorApuntes;

public class MainProduConsu {
    public static void main(String args[]) {
        Recipiente reci = new Recipiente();

        Productor produ1 = new Productor(reci,1);
        Consumidor consu1 = new Consumidor(reci,1);

        produ1.start();
        consu1.start();
    }
}
