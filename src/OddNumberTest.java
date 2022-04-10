import java.util.Scanner;

public class OddNumberTest {

    private static int[] intArray;
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Enter the elements number of Elements");
        int num = scanner.nextInt();
        scanner.nextLine();
        intArray = new int[num];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < num; i++) {
            intArray[i] = scanner.nextInt();
            scanner.nextLine();

        }
    if(checkForOddNumbers(intArray)){
        System.out.println("There are no odd numbers in the given inputs");
    }

    }

    private static boolean checkForOddNumbers(int[] intArray){
        boolean result = true;
        for(int i = 0;i< intArray.length;i++){
            if(intArray[i] % 2 != 0) {
                System.out.println("There add odd element(s) in the list. first Odd elements is "+intArray[i]);
                result = false;
                break;
            }

        }
        return result;


    }

}

