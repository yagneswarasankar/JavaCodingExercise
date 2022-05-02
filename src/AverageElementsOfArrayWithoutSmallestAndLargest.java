public class AverageElementsOfArrayWithoutSmallestAndLargest {

    public static void main(String[] args) {

        int[] arr = {2,3,4,5,6,7};

        System.out.println((float)averageElementsOfArrayWithoutSmallestAndLargest(arr));
    }

    private static float averageElementsOfArrayWithoutSmallestAndLargest(int[] arr){

        int min = arr[0];
        int max = arr[0];
        int sum = arr[0];
        for(int i = 1;i< arr.length;i++){
            if( arr[i] < min){
                min = arr[i];
            }
            if(arr[i] > max){
                max = arr[i];
            }
            sum += arr[i];

        }

        return (float) (sum - (min + max)) / (arr.length -2);


    }





}
