public class LeaderOfTheArray {

    //This proram will pring the leader of the Array
    //Leader is the element whose right elements are all smaller to the element.
    public static void main(String[] args) {

        int[] intArray = {2,1,3,2,9,4,5,4,6,15,3,2,1}; //
        System.out.println("Leader Element of Array is :"+leaderEelement(intArray));
    }

    private static int leaderEelement(int[] arr){
        int maxSoFar = Integer.MIN_VALUE;
        for(int i = 0;i< arr.length;i++){
            for(int j = i+1; j< arr.length;j++){
                if(arr[j] > arr[i]){
                    break;
                }

                //System.out.println("i"+ arr[i]+ " j"+ arr[j]);

            }
            if(maxSoFar < arr[i]){
                maxSoFar = arr[i];
            }
        }
      return  maxSoFar;

    }



}
