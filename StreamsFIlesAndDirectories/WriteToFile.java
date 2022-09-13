package StreamsFIlesAndDirectories;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Set;

public class WriteToFile {
    public static void main(String[] args) {

        String pathIn = "C:\\Users\\Mariya\\IdeaProjects\\Java Advanced\\src\\StreamsFIlesAndDirectories\\input.txt";

        String pathOut = "C:\\Users\\Mariya\\IdeaProjects\\Java Advanced\\src\\StreamsFIlesAndDirectories\\02.WriteToFileOutput.txt";


        try {
            FileInputStream fileInputStream = new FileInputStream(pathIn);
            FileOutputStream fileOutputStream = new FileOutputStream(pathOut);
            int oneByte = fileInputStream.read();

            Set<Character> punctuations = Set.of(',', '.','!', '?');

            while (oneByte != -1) {
                char symbol = (char) oneByte;
                if (!punctuations.contains(symbol)){
                    fileOutputStream.write(oneByte);
                }
                oneByte = fileInputStream.read();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
