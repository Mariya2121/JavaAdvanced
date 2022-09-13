package StacksAndQueues;

import javax.swing.*;
import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Scanner;

public class PrinterQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String file = scanner.nextLine();

        ArrayDeque<String> printerQueue = new ArrayDeque<>();

        while (!file.equals("print")) {
            if (file.equals("cancel")) {
                if (printerQueue.isEmpty()) {
                    System.out.println("Printer is on standby");
                } else {
                    System.out.println("Canceled " + printerQueue.poll());
                }
            }else {
                printerQueue.offer(file);
            }
            file = scanner.nextLine();
        }
        for (String files: printerQueue) {
            System.out.println(files);


        }
    }
}

