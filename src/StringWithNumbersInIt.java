import java.util.Arrays;

public class StringWithNumbersInIt {

    public static void main(String[] args) {
        String str = "this is4 reference words52 try2 solve";
        String[] strArray = str.split(" ");
        int sum = 0;
        System.out.println(Arrays.toString(strArray));
        for(String string : strArray){
            sum += getNumberFromString(string);

        }


        System.out.println("The sum of integersin the given string is : "+ sum);


    }
    private static int getNumberFromString(String str1){

        StringBuilder strb = new StringBuilder();
        char[] chrArray = str1.toCharArray();
        for(char ch: chrArray){
            if(Character.isDigit(ch)){
                strb.append(ch);
            }else{
                strb.append('0');
            }
        }
        System.out.println(strb);
        //return 0;
        return Integer.parseInt(strb.toString());
    }
}
