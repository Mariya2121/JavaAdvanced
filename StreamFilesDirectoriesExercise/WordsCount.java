package StreamFilesDirectoriesExercise;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class WordsCount {
    public static void main(String[] args) {
        try(Scanner scan = new Scanner(new FileReader("C:\\Users\\Mariya\\IdeaProjects\\Java Advanced" +
                "\\src\\StreamFilesDirectoriesExercise\\words.txt"));

            Scanner textScanner = new Scanner(new FileReader("C:\\Users\\Mariya\\IdeaProjects\\Java Advanced" +
                    "\\src\\StreamFilesDirectoriesExercise\\text.txt"));
            PrintWriter printWriter = new PrintWriter("C:\\Users\\Mariya\\IdeaProjects\\Java Advanced\\src" +
                    "\\StreamFilesDirectoriesExercise\\output.txt")){

            LinkedHashMap<String, Integer> wordMap = new LinkedHashMap<>();
            Arrays.stream(scan.nextLine().split(" ")).forEach(word -> wordMap.put(word, 0));
            while(textScanner.hasNext()){
                String textInput = textScanner.next();
                if(wordMap.containsKey(textInput)){
                    int occurrences = wordMap.get(textInput);
                    occurrences++;
                    wordMap.put(textInput, occurrences);
                }
            }
            printWriter.close();
            wordMap.forEach((key, value) -> printWriter.printf("%s - %d%n", key, value));


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
