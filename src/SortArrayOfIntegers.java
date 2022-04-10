import java.util.Arrays;
import java.util.Scanner;

public class SortArrayOfIntegers {

    private static Scanner scanner = new Scanner(System.in);
    private static int[] intArray;

    public static void main(String[] args) {
        System.out.println("Enter the number elements");
        int num = scanner.nextInt();
        scanner.nextLine();
        intArray = new int[num];
        System.out.println("Enter the numbers");
        for (int i = 0; i < num; i++) {
            intArray[i] = scanner.nextInt();
        }

        System.out.println(Arrays.toString(sortArray(intArray)));
    }

    private static int[] sortArray(int[] intArray){
        int temp;
        for(int i = 0;i < intArray.length;i++){
            for(int j = i; j< intArray.length; j++){
                if(intArray[i] > intArray[j]){
                 temp = intArray[j];
                 intArray[j] = intArray[i];
                 intArray[i] = temp;
                }
                System.out.println("After "+(i+1)+"-" + (j+1)+ "Iteration :"+ Arrays.toString(intArray));

            }

        }

        return intArray;
    }
}
