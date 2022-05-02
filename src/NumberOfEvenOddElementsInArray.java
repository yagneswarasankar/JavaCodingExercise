public class NumberOfEvenOddElementsInArray {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9,10,-32};

        findNumberOfEvenOdds(arr);


    }
    private static void findNumberOfEvenOdds(int[] arr){
        int even = 0;
        int odd = 0;
        for(int n: arr){
            if(n%2==0){
                even++;
            }else{
                odd++;
            }
        }
        System.out.println("Number of even Numbers : "+ even +" Number of Odd Number : " + odd );
    }
}
