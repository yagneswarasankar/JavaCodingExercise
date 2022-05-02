public class ArrayContainsTwoSpecificElements {

    //How to check if two elements contains in an Array For example 65 and 77
    public static void main(String[] args) {
        int[] arr = {74, 77, 65, 77};
        if(containsTwoElements(arr,65,77)){
            System.out.println("Contains two specified numbers");

        }else{
            System.out.println("Does not contains the elements");
        }
    }



    private static boolean containsTwoElements(int[] arr,int num1,int num2){
       // boolean result = false;
        for(int n: arr){

          boolean  result = ((n != num1) && (n != num2));
          if(result){
              return false;
          }
        }
     return true;
    }

}
