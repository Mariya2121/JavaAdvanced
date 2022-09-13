package StreamsFIlesAndDirectories;

import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.stream.Collectors;

public class SortLines {
    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\Mariya\\IdeaProjects\\Java Advanced\\src\\StreamsFIlesAndDirectories\\input.txt";
        String pathOut = "C:\\Users\\Mariya\\IdeaProjects\\Java Advanced\\src\\StreamsFIlesAndDirectories\\06.SortLinesOutput.txt";

        List<String> list = Files.readAllLines(Paths.get(path));

        List<String> sorted = list.stream()
                .sorted()
                .collect(Collectors.toList());

        Path outputPath = Path.of(pathOut);
       // Files.createFile(outputPath);

        Files.write(outputPath, sorted);

    }
}
