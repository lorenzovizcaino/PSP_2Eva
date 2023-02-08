package productorConsumidorEj2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Cola cola=new Cola();
        File file=new File("ficheros/fichero.txt");
        int caracter;
        String frase="";
        try {
            FileReader fileReader=new FileReader(file);
            while ((caracter=fileReader.read())!=-1){
                frase+=(char)caracter;
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(frase);

        new Productor(frase, cola).start();
        new Consumidor(cola, frase.length()).start();
    }
}
