import java.util.Arrays;

public class SortStringNumericArray {

    public static void main(String[] args) {
        int[] intArray ={33,65,53,56,76,-32,12};
        String[] strArray ={"Cat","Apple","Ball","Krishna","Hari"};

        System.out.println(Arrays.toString(sortIntArray(intArray)));
        System.out.println(Arrays.toString(sortStringArray(strArray)));

        }

        public static int[] sortIntArray(int[] arr) {

            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = i; j < arr.length ; j++) {
                    if (arr[j] < arr[i]) {
                        int temp = arr[j];
                        arr[j] = arr[i];
                        arr[i] = temp;
                    }
                }

            }
            return arr;


        }

        public static String[] sortStringArray(String[] arr){
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = i; j < arr.length ; j++) {
                    if (arr[j].compareTo(arr[i]) <0) {
                        String temp = arr[j];
                        arr[j] = arr[i];
                        arr[i] = temp;
                    }
                }

            }
            return arr;



        }

}
