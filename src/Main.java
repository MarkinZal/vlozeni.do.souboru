import java.io.*;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {


        String nazevSouboru = "vystupniSoubor.txt";

        try {
            FileWriter fileWriter = new FileWriter(nazevSouboru, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            String textKZapsani = "Hello there...";
            bufferedWriter.write(textKZapsani);
            bufferedWriter.newLine();
            bufferedWriter.close();
            fileWriter.close();
            System.out.println("Text byl zapsán do souboru.");

        } catch (IOException e) {
            System.out.println("Chyba při zápisu do souboru: " + e.getMessage());
        }
    }
}