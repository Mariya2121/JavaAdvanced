package StreamsFIlesAndDirectories;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class WriteEveryThirdLine {
    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\Mariya\\IdeaProjects\\Java Advanced\\src\\StreamsFIlesAndDirectories\\input.txt";
        String pathOut = "C:\\Users\\Mariya\\IdeaProjects\\Java Advanced\\src\\StreamsFIlesAndDirectories\\05.WriteEveryThirdLineOutput.txt";

        FileInputStream fileInputStream = new FileInputStream(path);

        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);

        FileWriter fileWriter = new FileWriter(pathOut);

        BufferedReader reader = new BufferedReader(inputStreamReader);

        BufferedWriter writer = new BufferedWriter(fileWriter);


//        String line = reader.readLine();
//        int counter = 0;
//        while (line != null) {
//            counter++;
//            if (counter % 3 == 0) {
//                writer.write(line);
//                writer.newLine();
//            }
//            line = reader.readLine();
//        }


        List<String> allLines = Files.readAllLines(Paths.get(path));

        for (int i = 3; i < allLines.size(); i += 3) {
            writer.write(allLines.get(i));
            writer.newLine();
        }
        reader.close();
        writer.close();
    }
}
