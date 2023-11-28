import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class PrintWriter {
    String nazev = "vystup.txt";



        FileWriter fw;
    {
        try {
            fw = new FileWriter(nazev, true);
            BufferedWriter bw = new BufferedWriter(fw);
            String text = "Hey there";
            bw.write(text);
            bw.newLine();
            bw.close();
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
