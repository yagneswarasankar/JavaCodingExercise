public class IsArraySorted {


    public static void main(String[] args) {

        int[] intArray = new int[]{1,2,3,3,4,5};
        System.out.println(isArraySorted(intArray));
    }

    private static boolean isArraySorted(int[] intArray){

        for(int i = 0; i< intArray.length-1;i++){
            if(intArray[i] > intArray[i+1]){
                return false;
            }

        }
        return true;

    }
}
