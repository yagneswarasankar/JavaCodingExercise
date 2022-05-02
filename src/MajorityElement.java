import java.util.ArrayList;
import java.util.Arrays;

public class MajorityElement {


    public static void main(String[] args) {

        int[] arr = {2, 3, 4, 2, 3, 4, 2, 2, 4, 2, 2,4,4,4,4,4,4,4,4};
        findMajorityElement(arr);


    }

    private static void findMajorityElement(int[] arr) {

        ArrayList<Integer> uniqueElementArray = new ArrayList<>();
        ArrayList<Integer> uniqueElementCount = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }

            }
            if (!uniqueElementArray.contains(arr[i])) {
                uniqueElementArray.add(arr[i]);
                uniqueElementCount.add(count);
                count = 0;
            }
        }
        System.out.println(Arrays.toString(uniqueElementArray.stream().mapToInt(i -> i).toArray()));
        System.out.println(Arrays.toString(uniqueElementCount.stream().mapToInt(i -> i).toArray()));

        int[] uElements = uniqueElementCount.stream().mapToInt(i -> i).toArray();
        int[] uElementIndices = uniqueElementArray.stream().mapToInt(i -> i).toArray();

        System.out.println(returnIndex(uElements));

        if (uElements[returnIndex(uElements)] <= arr.length/2) {
            System.out.println("No Majority element");

        } else {
            System.out.println("Majority element exists and that is " + uElementIndices[returnIndex(uElements)]);
        }
    }



    private static int returnIndex(int[] arr){
        int maxElement = findMax(arr);
        int index = -1;
        for(int i = 0; i< arr.length;i++){
            if(arr[i] == maxElement){
               index = i ;
            }
        }
        return index;
    }


    private static int findMax(int arr[]){
        int max = 0;
        for(int i = 0; i< arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
