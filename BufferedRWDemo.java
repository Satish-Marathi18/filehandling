package filehandling;

import java.io.* ;

public class BufferedRWDemo {
    public static void main(String[] args) throws IOException {
        File file1 = new File("Example.txt");
        if(!file1.exists()) {
            file1.createNewFile();
        }

        BufferedWriter writer = new BufferedWriter(new FileWriter(file1));
        String text1 = "This is buffered writer and reader example.";
        String text2 = "This is new line";
        writer.write(text1);
        writer.newLine();
        writer.write(text2);
        writer.flush();
        writer.close();

        BufferedReader reader = new BufferedReader(new FileReader(file1));
        String line = reader.readLine();
        int cnt =0;
        while(line != null) {
            cnt++;
            System.out.println(line);
            line = reader.readLine();
        }
        System.out.println(cnt);
        reader.close();

    }
}
