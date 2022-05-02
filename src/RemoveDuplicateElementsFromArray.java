import java.util.Arrays;

public class RemoveDuplicateElementsFromArray {

    public static void main(String[] args) {

        int[] intArray = {2, 3, 4, 3, 4, 12, -45};

     removeDuplicate(intArray);

    }

    private static boolean contains(int[] arr, int val) {
        boolean isContained = false;
        for (int j : arr) {
            if (j == val) {
                isContained = true;
                break;
            }
        }
        return isContained;
    }

    private static void removeDuplicate(int[] intArray) {

        int[] resArray = new int[intArray.length];
        int k = 0;

        for (int j : intArray) {
            if (!contains(resArray, j)) {
                resArray[k] = j;
                k++;
            }
        }
        int i =0;
        while(resArray[i] != 0){
            System.out.print(resArray[i]+", ");
            i++;
        }
    }

}
