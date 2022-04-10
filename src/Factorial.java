import java.util.Scanner;

public class Factorial {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Enter the number");
        int num = scanner.nextInt();
        scanner.nextLine();
        System.out.println(factorial(num));
        System.out.println(recFactorial(num));

    }

    private static int factorial(int num){
        int res = 1;
        if(num == 1 ||  num ==0){
            return 1;
        }
        else{
            for(int i = 1; i<= num; i++){
                res *= i;
            }
        }

        return res;

    }
    private static int recFactorial(int num){
       if( num == 0 || num == 1){
           return 1;
       }else{
           return num * factorial(num -1);
       }




    }
}
