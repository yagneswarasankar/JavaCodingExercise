import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArrayToArrayList {

    //How to convert Array to ArrayList

    public static void main(String[] args) {
        int[] intArray = {2,3,4,5};
        String[] strArray ={"Girija","Sankar"};
        System.out.println(convertArrayToArrayList(strArray).toString());
    }
    private static ArrayList<String> convertArrayToArrayList(String[] arr){

        return new ArrayList<String>(Arrays.asList(arr));

    }
    //No direct way to convert the integer array to an array list.

  /*  private static ArrayList<Integer> convertArrayToArrayList(int[] arr){

        return new ArrayList<Integer>(Ints.asList(arr));

    }*/

}
