import java.io.*;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {

        String nazevSouboru = "vystupniSoubor.txt";
        FileWriter fw;
        {
            try {
                fw = new FileWriter(nazevSouboru, true);
                BufferedWriter bw = new BufferedWriter(fw);
                String textKZapsani = "Hello there...";
                bw.write(textKZapsani);
                bw.newLine();
                bw.close();
                fw.close();
                System.out.println("Text byl zapsán do souboru.");

            } catch (IOException e) {
                System.out.println("Chyba při zápisu do souboru: " + e.getMessage());
            }
        }
    }
}
