import java.util.Arrays;

public class NoOfUniqueValuesInArray {

    public static void main(String[] args) {
        int nums[] = {20, 20, 30, 40, 50, 50,50, 50,60,70};

        System.out.println(numOfElementAfterRemovingDuplicates(nums));


    }
    private static int numOfElementAfterRemovingDuplicates(int[] nums){
        int count  =0;
        int duplicate = 0;
        for(int i =0; i< nums.length;i++){
            for(int j = i+1; j< nums.length;j++){
                if(nums[i] == nums[j]){
                    duplicate++;

                }

            }
            if(duplicate ==0){
                count++;
            }
            duplicate =0;

        }
        return count;

    }

}
