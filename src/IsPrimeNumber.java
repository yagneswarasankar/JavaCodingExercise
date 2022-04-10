import java.util.Scanner;

public class IsPrimeNumber {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.print("Enter the number to be checked: ");
        int num = scanner.nextInt();
        scanner.nextLine();
        if(isPrime(num)){
            System.out.println("The number is prime");
        }else{
            System.out.println("The given number is not a primeNumber ");
        }
    }

    private static boolean isPrime(int num){
        boolean result = true;
        if(num < 1){
            result = false;
        }

        for(int i = 2; i<= (int)Math.sqrt(num);i++){
            if(num % i == 0) {
                result = false;
                break;
            }

        }
      return result;
    }


}
