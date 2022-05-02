import java.util.Arrays;
import java.util.Scanner;

public class InsertElementInArray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] intArray  = new int[10];
        System.out.println(intArray.hashCode());
        for(int i =0;i<10;i++){
            intArray[i] = i;
        }
        System.out.println(intArray.hashCode());
        System.out.println("The original Array :"+ Arrays.toString(intArray));
        System.out.print("Enter the index: ");
        int index = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter the element : ");
        int element = scanner.nextInt();
        scanner.nextLine();
        if(index < 0 || index >= intArray.length){
            System.out.println("Index not in range");
        }else{
            intArray[index] = element;
        }
        System.out.println("Resultant Array: "+Arrays.toString(intArray));

    }
}
