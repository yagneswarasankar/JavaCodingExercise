import java.util.Arrays;

public class ResizeArray {

    private static int[] originalArray = {1,2,3,4,5,6,7,8,9,10};

    public static void main(String[] args) {

        //printArray(originalArray);
        System.out.println(Arrays.toString(originalArray));
        int[] afterResize = resize();
        afterResize[10] =56;
        afterResize[11] =48;

        System.out.println(Arrays.toString(afterResize));

        System.out.println(originalArray.hashCode());
        System.out.println(afterResize.hashCode());

    }

    private static void printArray(int[] arr){
        for(int i = 0; i< arr.length;i++){
            System.out.print(arr[i]+", ");
        }
    }

    private static int[] resize(){
        int[] secondArray = originalArray;

        originalArray = new int[12];
        for(int i = 0;i< secondArray.length;i++){
            originalArray[i] = secondArray[i];
        }
        return originalArray;

    }
}
