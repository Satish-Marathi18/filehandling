package filehandling;

import java.io.*;
import java.util.Scanner;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;;

public class ImangeReadAndWrite {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the source path");
        String src = sc.nextLine();
        

        FileInputStream fileInputStream = new FileInputStream(src);
        
        BufferedImage image = ImageIO.read(fileInputStream);

        if(image != null) {
            System.out.println(image);
            System.out.println("Image loaded successfully");
        }
        else {
            System.out.println("Can't load image");
        }

        sc.close();
        fileInputStream.close();
    }
}
