package StackAndQueuesExcercise;

public class Recursion {
    public static void main(String[] args) {
        a(5);
    }

    public static void a(int number) {
        if (number == 0) { // дъно на рекурсията
            return;
        }
        System.out.println(number);
        number--;
        a(number);
    }
}
