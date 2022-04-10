import java.util.Scanner;

public class SwapNumbersWithoutTemp {

    //This program will swap the numbers without using the third number or temp number.
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter the first number: ");
        int firstNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter the second number: ");
        int secondNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Given inputs FirstNumber: "+ firstNumber + " Second Number: "+ secondNumber);
        firstNumber = firstNumber + secondNumber;
        secondNumber = firstNumber - secondNumber;
        firstNumber  = firstNumber - secondNumber;
        System.out.println("After swap FirstNumber: "+ firstNumber + " Second Number: "+ secondNumber);
        }
}
