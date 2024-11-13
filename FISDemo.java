package filehandling;

import java.io.*;
public class FISDemo {
    public static void main(String[] args) throws IOException {
        File file1 = new File("Sample.txt");
        if(!file1.exists()) {
            file1.createNewFile();
        }

        FileOutputStream fileOutputStream = new FileOutputStream(file1);
        String text = "My name is Satish Marathi.";
        fileOutputStream.write(text.getBytes());
        fileOutputStream.flush();
        fileOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream(file1);
        int character = fileInputStream.read();
        while(character!=-1){
        System.out.print((char)character);
        character = fileInputStream.read();
        }
        fileInputStream.close();
    }
}
// 