public class AverageOfArrayElements {

    public static void main(String[] args) {
        int[] intArray = {2,54,63,25,46};

        System.out.println(averageOfArrayElements(intArray));



    }

    private static double averageOfArrayElements(int[] intArray){
        int sum = 0;
        for(int num: intArray){
            sum += num;
        }

        return (double)sum/intArray.length;
    }
}
