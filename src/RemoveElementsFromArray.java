import java.util.Arrays;

public class RemoveElementsFromArray {

    public static void main(String[] args) {

        int[] intArray = {1,2,3,4,5,6,7,8,9,10};
        int index = 6;
 /*       int[] newIntArray = intArray;
        System.out.println(intArray.hashCode());
        System.out.println(newIntArray.hashCode());
        System.out.println(Arrays.toString(intArray));
        System.out.println(Arrays.toString(newIntArray));
        intArray[5] = 6;
        System.out.println(intArray.hashCode());
        System.out.println(newIntArray.hashCode());
        System.out.println(Arrays.toString(intArray));
        System.out.println(Arrays.toString(newIntArray));

        int[] anotherArray = Arrays.copyOf(intArray,9);
        System.out.println(anotherArray.hashCode());
        System.out.println(Arrays.toString(anotherArray));*/

        System.out.println(Arrays.toString(copyArrayElementsRemovingElement(intArray,index)));

    }

    private static int[] copyArrayElementsRemovingElement(int[] intArray, int index){

        int[] restultArray = new int[intArray.length -1];
        for(int i = 0; i < intArray.length -1;i++){
            if(i >= index){
               // i++;
                restultArray[i] = intArray[i+1];

            }else {
                restultArray[i] = intArray[i];
            }
        }
        return restultArray;
    }


}
