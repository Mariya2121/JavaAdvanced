package StreamFilesDirectoriesExercise;

import javax.sound.sampled.Line;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Locale;

public class AllCapitals {
    public static void main(String[] args) throws IOException {
        String pathIN = "C:\\Users\\Mariya\\IdeaProjects\\Java Advanced\\src\\StreamFilesDirectoriesExercise\\input.txt";
        String pathOut = "C:\\Users\\Mariya\\IdeaProjects\\Java Advanced\\src\\StreamFilesDirectoriesExercise\\output.txt";

        List<String> list = Files.readAllLines(Paths.get(pathIN));
        FileWriter fileWriter = new FileWriter(pathOut);

        PrintWriter printWriter = new PrintWriter(fileWriter);

        for (String line : list) {
            String upperCaseLine = line.toUpperCase();
            printWriter.println(upperCaseLine);
        }
        fileWriter.close();
    }
}
