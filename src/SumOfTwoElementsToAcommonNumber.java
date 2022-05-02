import java.util.ArrayList;
import java.util.Arrays;

public class SumOfTwoElementsToAcommonNumber {

    public static void main(String[] args) {

        int[] intArray = {4,3,5,6,1,2,7};
        int[][] res ;
        ArrayList<ArrayList<Integer>> resArrayList = new ArrayList<>();
        for(int i=0; i < intArray.length; i++) {
            resArrayList.add(new ArrayList<Integer>());
        }
        int num  = 9;

        for(int i = 0; i< intArray.length;i++){
            for(int j = i+1; j< intArray.length ;j++){
                if(intArray[i] + intArray[j] == num){
                    if(!resArrayList.contains(Arrays.asList(Math.min(intArray[i],intArray[j]),Math.max(intArray[i],intArray[j])))) {
                        resArrayList.add(new ArrayList<Integer>(Arrays.asList(intArray[i], intArray[j])));
                    }
                    System.out.println("["+intArray[i]+","+intArray[j]+"]");
                }

            }
        }
        for(ArrayList<Integer> i: resArrayList) {
            if(!i.isEmpty())
            System.out.println(i.toString());
        }

    }




}
