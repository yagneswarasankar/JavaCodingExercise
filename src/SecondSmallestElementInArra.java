public class SecondSmallestElementInArra {

    public static void main(String[] args) {
        int[] intArray ={23,12,8,-45,35,-34,65,9};
        System.out.println(secondSmallest(intArray));
    }

    private static int secondSmallest(int[] intArray){

        int min = Math.min(intArray[0],intArray[1]);
        int max = Math.max(intArray[0],intArray[1]);

        for(int i = 2;i<intArray.length;i++){
            if(intArray[i] < min){
                max = min;
                min = intArray[i];

            }
            if(intArray[i] > min && intArray[i] < max){
                max = intArray[i];
            }

            //System.out.println("Min:" + min +" max: "+ max);
        }
        return max;
    }




}
