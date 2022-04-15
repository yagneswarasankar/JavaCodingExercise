import java.util.ArrayList;
import java.util.Arrays;

public class CompareTwoArrayElements {

    public static void main(String[] args) {
        int[] intArray1 = {3,4,2,5,6};
        int[] intArray2 = {2,3,4,5,6};
        System.out.println(containsSameElementts(intArray1,intArray2));

    }

    private static  boolean containsSameElementts(int[] arr1,int[] arr2){

        ArrayList<Integer> intArrayList1 = new ArrayList<>(Arrays.asList(3,4,2,5,6));
        ArrayList<Integer> intArrayList2 = new ArrayList<>(Arrays.asList(2,3,4,5,6));

        return (intArrayList1.containsAll(intArrayList2) && intArrayList2.containsAll(intArrayList1));
    }


}
