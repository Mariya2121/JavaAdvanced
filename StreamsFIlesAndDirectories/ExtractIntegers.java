package StreamsFIlesAndDirectories;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ExtractIntegers {
    public static void main(String[] args) {
        String pathIn = "C:\\Users\\Mariya\\IdeaProjects\\Java Advanced\\src\\StreamsFIlesAndDirectories\\input.txt";
        String pathOut = "C:\\Users\\Mariya\\IdeaProjects\\Java Advanced\\src\\StreamsFIlesAndDirectories\\04.ExtractIntegersOutput.txt";

        try {
            FileInputStream fileInputStream = new FileInputStream(pathIn);
            FileOutputStream fileOutputStream = new FileOutputStream(pathOut);


            Scanner scanner = new Scanner(fileInputStream);
            PrintWriter writer = new PrintWriter(fileOutputStream); // Къде да печата

            while (scanner.hasNext()) {
                if (scanner.hasNextInt()){
                    writer.println(scanner.next());
                }
                else {
                    scanner.next();
                }
            }
            writer.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
