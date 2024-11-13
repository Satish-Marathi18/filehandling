package filehandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadingDemo {
    public static void main(String[] args) throws IOException {
        File f1 = new File("Text.txt");
        // f1.createNewFile();
        FileWriter fw = new FileWriter(f1);
        fw.write("Hello this is satish marathi.");
        fw.flush();
        fw.close();

        FileReader fr = new FileReader(f1);
        int ch = fr.read();
        while(ch!=-1) {
            System.out.print((char)ch);
            ch = fr.read();
        }
        fr.close();

    }
}
