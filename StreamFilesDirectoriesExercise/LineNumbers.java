package StreamFilesDirectoriesExercise;

import java.io.*;

public class LineNumbers {
    public static void main(String[] args) {
        String path = "C:\\Users\\Mariya\\IdeaProjects\\Java Advanced\\src\\StreamFilesDirectoriesExercise\\inputLineNumbers.txt";
        String pathOut = "C:\\Users\\Mariya\\IdeaProjects\\Java Advanced\\src\\StreamFilesDirectoriesExercise\\output.txt";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            PrintWriter printWriter = new PrintWriter(pathOut);
            String line = bufferedReader.readLine();
            int index = 1;
            while (line != null) {
                printWriter.println(index + ". " + line);
                index++;
                line = bufferedReader.readLine();
            }
            printWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
