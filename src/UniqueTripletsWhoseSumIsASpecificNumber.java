public class UniqueTripletsWhoseSumIsASpecificNumber {

    public static void main(String[] args) {

        int[] arr = {1, -2, 0, 5, -1, -4};
        int[] sortArray = sortArray(arr);
        //sorted = {-4,-2,-1,0,1,5}
        int sum = 2;

        findTriplets(arr, sum);
    }

    private static void findTriplets(int[] arr, int sum) {
        int combination = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            int min = Math.min(arr[i], arr[i + 1]);
            int max = Math.max(arr[i], arr[i + 1]);
            for (int j = 0; j < arr.length; j++) {
                if ((min + max + arr[j] == sum) &&(arr[j] != min && arr[j] != max)) {
                    System.out.println("Combination " + (combination + 1) + ": [" + min + "," + max + " ," + arr[j] + "]");
                    combination++;
                }
            }
        }

    }


    private static int[] sortArray(int[] a){
        for(int i = 0; i< a.length;i++){
            for(int j =0; j< a.length ; j++){
                if(a[i] < a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }

        }
        return a;



    }
}
