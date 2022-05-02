public class MaximumAndMinimumOfArray {


    public static void main(String[] args) {
        int[] intArray = {23,43,56,467,-245,-90};

        findMinimumMaximumElementsOfArray(intArray);
    }

    private static void findMinimumMaximumElementsOfArray(int[] intArray){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0;i< intArray.length;i++){
            if(intArray[i] < min){
                min = intArray[i];
            }
            if(intArray[i] > max){
                max = intArray[i];
            }
        }
        System.out.println("Minimum Value of Array is : "+min +"\nMaximum Values is : "+ max);




    }
}
