import java.util.ArrayList;
import java.util.Arrays;

public class ArraysAsList {


    //This program will demonstrate the As List method of Arrays

    public static void main(String[] args) {
        char[] charArray = {'a','e','i','o','u'};
        System.out.println(Arrays.toString(charArray));

        String[] strArray = {"Girija","Mark"};
        System.out.println(Arrays.toString(strArray));

        int[] intArray = {12,13};
        String str = Arrays.toString(intArray);
        System.out.println(Arrays.toString(intArray));





        arrayAsList(charArray);
        ArrayList<Character> chrArrayList = new ArrayList<Character>(Arrays.asList('a','e','i','o','u'));
        System.out.println(chrArrayList);
        ArrayList<String> strArrayList = new ArrayList<>(Arrays.asList("Girija","Sankar","Duvvuri"));


        for(char c: chrArrayList){
            System.out.println("The letter is : "+c);
        }


    }

    private static void arrayAsList(char[] charArray){
        System.out.println(String.valueOf(charArray) + " as list :");
    }




}
