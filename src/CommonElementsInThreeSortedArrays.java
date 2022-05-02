import java.util.ArrayList;
import java.util.Arrays;

public class CommonElementsInThreeSortedArrays {
///How to find the common elements in 3 arrays.
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6,7,8,9,10,11,12};
        int[] arr2 = {2,4,6,8,10,12};
        int[] arr3 = {3,6,9,12};

        System.out.println(findCommonElements(arr1,arr2,arr3).toString());
    }

    private static ArrayList<Integer> findCommonElements(int[] arr1,int[]arr2, int[] arr3) {
        int x = 0, y = 0, z = 0;
        ArrayList<Integer> resArray = new ArrayList<Integer>();
        while (x < arr1.length && y < arr2.length && z < arr3.length) {
            if(arr1[x]  == arr2[y] && arr2[y] == arr3[z]){
                resArray.add(arr1[x]);
                x++;
                y++;
                z++;
            }
            else if(arr1[x] < arr2[y]){
                x++;
            }else if(arr2[y] < arr3[z]){
                y++;
            }else z++;
        }
      return resArray;

    }
}
