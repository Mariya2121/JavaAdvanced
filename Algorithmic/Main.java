package Algorithmic;

public class Main {
    public static void main(String[] args) {


        int x = 2;
        int n = 2;

        System.out.println(Math.pow(x, n));

        int result = x;
        for (int i = 0; i < n; i++) {
            result = result * x;
        }

        System.out.println(power(x, n));
    }

    public static int power(int number, int power){
        if (power == 1){ //дъно // ако нямаме дъно -> безкрайна рекурсия -> StackOverflowError -> проблем
            return number;
        }
        return number * power(number, power - 1);
    }
}
