import java.util.Arrays;
import java.util.Random;

public class QuickSort {

    public static void main(String[] args) {

        Random rand = new Random();
        int[] numbers  = new int[10];

        for(int i = 0; i< numbers.length; i++){

            numbers[i]= rand.nextInt(100);
        }

        System.out.println("Before :");
        System.out.println(Arrays.toString(numbers));

        quickSort(numbers);
        System.out.println("After");
        System.out.println(Arrays.toString(numbers));
    }

    private static void quickSort(int[] array){

        quickSort(array,0,array.length - 1);

    }

    private static void quickSort(int[] array, int lowIndex, int highIndex) {
        if (lowIndex >= highIndex) {
            return;
        }

        int pivotIndex  = new Random().nextInt(highIndex - lowIndex)+lowIndex;

        int pivot = array[pivotIndex];
        swap(array,pivotIndex,highIndex);


        int lp = lowIndex;
        int rp = highIndex;
        while (lp < rp) {

            while (array[lp] <= pivot && lp < rp) {
                lp++;
            }
            while (array[rp] >= pivot && lp < rp) {
                rp--;
            }
            swap(array, lp, rp);
        }
        swap(array, lp, highIndex);
        quickSort(array, lowIndex, lp - 1);
        quickSort(array, lp + 1, highIndex);

    }


    private static void swap(int[] array,int index1, int index2){
        int temp =array[index2];
        array[index2] = array[index1];
        array[index1] = temp;
    }



}
