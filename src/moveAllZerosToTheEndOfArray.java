import java.util.Arrays;

public class moveAllZerosToTheEndOfArray {


    public static void main(String[] args) {
        int[] arr ={1,2,0,4,0,5,3,0,6};
        int[] arr1 = {0,0,1,0,3,0,5,0,6};

        System.out.println(Arrays.toString(moveZerosToEndOfDifferentArray(arr)));
        System.out.println(Arrays.toString(moveZerosToEndOfSameArray(arr1)));
    }

    private static int[] moveZerosToEndOfDifferentArray(int[] arr){
        int[] resultArray = new int[arr.length];
        int k = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] !=0){
                resultArray[k] = arr[i];
                k++;
            }
        }
        return resultArray;
    }

    private static int[] moveZerosToEndOfSameArray(int[] arr){

        int i = 0;
        for(int j=0, l = arr.length;j < l;){
            if(arr[j] == 0){
                j++;
            }
            else {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                j++;
                i++;
            }
        }
        return arr;



    }

}
