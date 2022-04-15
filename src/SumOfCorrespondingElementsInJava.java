public class SumOfCorrespondingElementsInJava {

    public static void main(String[] args) {
        int[] intArray1 = {1,2,3,4,5};
        int[] intArray2 = {5,6,-3,8,10};

        System.out.println(sumOfCurrespondingArrayElements(intArray1,intArray2));
    }

    private static String sumOfCurrespondingArrayElements(int[] arr1,int[] arr2){

        String str = "";
        if( (arr1.length != arr2.length) ||arr2.length == 0){
            str += "The size of either of the arrays is zero or they have different number of elements";
           return str;
        }

        for(int i= 0;i< arr1.length;i++){
            if(i == arr1.length -1){
                str += (arr1[i] + arr2[i]);
            }else{
                str += (arr1[i] +arr2[i])+",";
            }
        }
        return str;
    }





}
