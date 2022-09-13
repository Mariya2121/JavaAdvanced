package StreamFilesDirectoriesExercise;

import java.io.*;

public class CountCharacterTypes {
    public static void main(String[] args) {
        int vowels = 0;
        int constants = 0;
        int punctuation = 0;

        String path = "C:\\Users\\Mariya\\IdeaProjects\\Java Advanced\\src\\StreamFilesDirectoriesExercise\\input.txt";
        String pathOut = "C:\\Users\\Mariya\\IdeaProjects\\Java Advanced\\src\\StreamFilesDirectoriesExercise\\output.txt";

        try (FileReader fileReader = new FileReader(path)) {
            PrintWriter printWriter = new PrintWriter(pathOut);

            int oneSymbol = fileReader.read();

            while (oneSymbol != -1) {
                char symbolAsChar = (char) oneSymbol;
                if (isVowel(symbolAsChar)) {
                    vowels++;
                } else if (isPunctuation(symbolAsChar)) {
                    punctuation++;
                } else if (!Character.isWhitespace(symbolAsChar) && !Character.isDigit(symbolAsChar)){
                    constants++;
                }

                oneSymbol = fileReader.read();
            }

            printWriter.println("Vowels: " + vowels);
            printWriter.println("Constants: " + constants);
            printWriter.println("Punctuation: " + punctuation);
            printWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static boolean isVowel(char character) {
        return character == 'a' || character == 'o' || character == 'u' || character == 'e' || character == 'i';
    }

    public static boolean isPunctuation(char character) {
        return character == '!' || character == ',' || character == '.' || character == '?';
    }
}
