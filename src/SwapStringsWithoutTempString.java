public class SwapStringsWithoutTempString {

    //This program will swap the two string without using the thrid varible.

    public static void main(String[] args) {

        String str1 = "Girija";
        String str2 = "Sankar";

        str1=str1+str2;
        str2 = str1.substring(0,str1.length() - str2.length());
        str1 = str1.substring(str2.length());
        System.out.println("Now str1 ="+ str1 + " str2 ="+ str2);

    }





}
