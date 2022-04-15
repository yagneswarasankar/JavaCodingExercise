public class SecondHighestInArray {


    //This program will give second hightest element in Array.
    public static void main(String[] args) {

        int[] intArray = {113,2,3,94,5,12,65};

        System.out.println(findSecondHighestElement(intArray));
    }

    private static int findSecondHighestElement(int[] arr){
        int firstElement;
        int secondElement;
        if(arr.length == 1){
            secondElement = arr[0];
            return secondElement;
        }else if(arr.length ==2){
            secondElement = Math.min(arr[0],arr[1]);
            return secondElement;
        }else{
            firstElement = Math.max(arr[0],arr[1]);
            secondElement = Math.min(arr[0],arr[1]);
            for(int i = 2; i< arr.length; i++){
                if(arr[i] > firstElement){
                    firstElement = arr[i];
                }else if(arr[i] < firstElement && arr[i]>= secondElement){
                    secondElement = arr[i];
                }

            }
        }
        return secondElement;


    }


}
