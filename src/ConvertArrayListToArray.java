import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArrayListToArray {
    //private static Object Integer;


    //How to convert ArrayList to Array

    public static void main(String[] args) {

        ArrayList<String> strArrayList = new ArrayList<String>();
        strArrayList.add("Girija");
        strArrayList.add("Sankar");

        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        intArrayList.add(4);
        intArrayList.add(5);
        intArrayList.add(6);

        int[] array = new int[intArrayList.size()];
        String[] strArray = new String[strArrayList.size()];
        System.out.println(Arrays.toString(strArrayList.toArray(strArray)));
    }
}
