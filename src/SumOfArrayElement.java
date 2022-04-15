public class SumOfArrayElement {

    public static void main(String[] args) {

        int[] intArray = {1,2,3,4,5};
        System.out.println(findSumOfElements(intArray));

    }

    private static int findSumOfElements(int[] intArray){
        int sum= 0;
        for(int num: intArray){
            sum += num;
        }
        return sum;
    }




}
