package StreamsFIlesAndDirectories;

import java.io.*;

public class CopyBytes {
    public static void main(String[] args) {

        String pathIn = "C:\\Users\\Mariya\\IdeaProjects\\Java Advanced\\src\\StreamsFIlesAndDirectories\\input.txt";
        String pathOut = "C:\\Users\\Mariya\\IdeaProjects\\Java Advanced\\src\\StreamsFIlesAndDirectories\\03.CopyBytesOutput.txt";

        try {
            FileInputStream fileInputStream = new FileInputStream(pathIn);
            FileOutputStream fileOutputStream = new FileOutputStream(pathOut);

            int read = fileInputStream.read();
            PrintWriter writer = new PrintWriter(fileOutputStream); // Къде да печата

            while (read != -1) {

                if (read == 32) {
                    writer.print((char) read); // space
                }
                else if (read == 10) {
                    writer.println();
                } else {
                    writer.print(read);
                }
                read = fileInputStream.read();
            }
            writer.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
