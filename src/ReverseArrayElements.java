import java.util.Arrays;

public class ReverseArrayElements {

    public static void main(String[] args) {
        int[] intArray ={1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(reverseArray(intArray)));

    }
    private static int[] reverseArray(int[] intArray){
        int len = intArray.length-1;
        for(int i =0;i< len/2;i++){
            int temp = intArray[i];
            intArray[i] = intArray[len -i];
            intArray[len -i] = temp;
        }
        return intArray;




    }


}
