//This program will let you calculate how many elements are there in the array

public class LengthOfArray {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};

        System.out.println(findLengthOfArrayUsingLength(arr));
        System.out.println(findLengthOfArrayWithoutLength(arr));
    }

    private static int findLengthOfArrayUsingLength(int[] intArray){

        return intArray.length;
    }

    private static int findLengthOfArrayWithoutLength(int[] intArray){
        int count = 0;
        for(int i : intArray){
            count++;
        }
        return count;
    }







}
