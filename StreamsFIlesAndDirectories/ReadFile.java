package StreamsFIlesAndDirectories;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {

        String path = "C:\\Users\\Mariya\\IdeaProjects\\Java Advanced\\src\\StreamsFIlesAndDirectories\\input.txt";

        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            int oneByte = fileInputStream.read();
            while (oneByte != -1){
                System.out.print(Integer.toBinaryString(oneByte) + " ");
                oneByte = fileInputStream.read();
            }
        }
        catch (IOException e){
           e.printStackTrace();
        }
    }
}
