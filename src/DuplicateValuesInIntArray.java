import java.util.ArrayList;
import java.util.Arrays;

public class DuplicateValuesInIntArray {

    public static void main(String[] args) {
        int[] intArray = {1,2,2,3,4,4,5,6,4,6,7,8,9}; //2,4,6
        System.out.println("Duplicate elements of Array: "+ findDuplicate(intArray).toString());

    }

    private static ArrayList<Integer> findDuplicate(int[] arr){

        ArrayList<Integer> uniqueElements =new ArrayList<Integer>();
        ArrayList<Integer> duplicateElements =new ArrayList<Integer>();
        for(int i =0;i< arr.length-1 ;i++){
            if(!uniqueElements.contains(arr[i])){
                uniqueElements.add(arr[i]);
                //i++;
            }else if(!duplicateElements.contains(arr[i])){
                duplicateElements.add(arr[i]);
                //i++;
            }


        }
       return duplicateElements;

    }



}
