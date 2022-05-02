import java.util.ArrayList;

public class LongestConsecutiveNumbers {

    public static void main(String[] args) {

        int[] intArray = {49, 1, 3, 200, 2, 4, 70, 5};
        System.out.println(findLongestConsecutiveNumbers(intArray).size());


    }

    private static ArrayList<Integer> findLongestConsecutiveNumbers(int[] arr) {

        ArrayList<Integer> resArray = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] + 1 == arr[j] || arr[i] - 1 == arr[j]) {
                    if (!resArray.contains(arr[i])) {
                        resArray.add(arr[i]);
                    }
                }
            }

        }

        return resArray;

    }
}
