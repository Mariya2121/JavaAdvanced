package StreamsFIlesAndDirectories;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class demo {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        //Read by bite

        String path = "C:\\Users\\Mariya\\IdeaProjects\\Java Advanced\\src\\StreamsFilesAndDirectories\\input.txt.txt";
        FileInputStream fileInputStream = new FileInputStream(path);
        int oneByte = fileInputStream.read(); // read one byte

//        while (oneByte != -1){
//            System.out.println(oneByte);
//          //  System.out.print((char)(oneByte)); // принтира самия текст по чарове
//            oneByte = fileInputStream.read();
//        }

        // Try Catch

        try{ // тук се намират операциите, при които може да възникне грешка
            FileInputStream fileInputStream2 = new FileInputStream(path);
            System.out.println("File was found");

        }
        catch (FileNotFoundException e){ // олавя грешката, която очакваме. Програмата не се е счупила
            System.out.println("File not found" + e.getMessage());
        }
        finally { //можем да извършим операция, която се изпълнява винаги, не зависимо дали при try блока е възникнала грешка или не

        }

    }
}
