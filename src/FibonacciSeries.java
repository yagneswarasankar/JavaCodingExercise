import java.util.ArrayList;
import java.util.Scanner;


//This program will demonstrate the possible ways of printint the fibonacci series
//and nth elements of febonacci series;
public class FibonacciSeries {



    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the number of numbers: ");
        int choice = scanner.nextInt();
        fibonacciSeries(choice);
        System.out.println();
        System.out.println(fibonacciWithResursion(choice));
        fibonacci(choice);

    }

    private static void fibonacciSeries(int num) {

        int a = 0;
        int b = 1;
        int c = 1;
        for (int i = 1; i <= num; i++) {
            if (i == num) {
                System.out.print(a);
            } else {
                System.out.print(a + ",");
                a = b;
                b = c;
                c = a + b;
            }
        }
    }

    private static int fibonacciWithResursion(int num) {
        if (num <= 1)
            return num;
        return (fibonacciWithResursion(num - 1) + fibonacciWithResursion(num - 2));

    }

    private static void fibonacci(int num) {
        int a = 0;
        int b = 1;
        int c = 1;
        int count = 1;
        while (count < num) {
            a = b;
            b = c;
            c = a + b;
            count++;
        }
        System.out.println(a);
    }
}



