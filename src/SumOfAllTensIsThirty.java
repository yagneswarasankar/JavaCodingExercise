public class SumOfAllTensIsThirty {

    public static void main(String[] args) {
        int[] arr = {10, 77, 10, 54, -11};

        if(isSumOfTensThirty(arr)){
            System.out.println("The sum of 10s is thirty");
        }else{
            System.out.println("The sum of 10s is not thirty");
        }
    }

    private static boolean isSumOfTensThirty(int[] arr){
        int sum = 0;
        for(int n : arr){
            if(n == 10){
               sum += n;
            }
        }
        return (sum == 30);
    }
}
