package StreamsFIlesAndDirectories;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListFiles {
    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\Mariya\\IdeaProjects\\Java Advanced\\src\\StreamsFIlesAndDirectories\\input.txt";

        File root = new File("C:\\Users\\Mariya\\IdeaProjects\\Java Advanced\\src\\StreamsFIlesAndDirectories" +
                "\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\Files-and-Streams");

        File[] files = root.listFiles(); // всички файлове в папката

        Arrays.stream(files).filter(File::isFile).forEach(f -> System.out.println(f.getName() + ": [" + f.length() + "]"));


        //Зад 8

        System.out.println(Files.walk(root.toPath())
                .map(Path::toFile).map(File::getName)
                .collect(Collectors.joining(System.lineSeparator())));
    }

}
