import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveGivenCharacterFromString {

    public static void main(String[] args) {

        String str  = "Girija";
        char ch = 'a';

        System.out.println(removeCharacterFromString(str,ch));
        System.out.println(removeCharacterFromString1(str,ch));
    }

    private static String removeCharacterFromString(String str, char ch){

        return str.replaceAll(String.valueOf(ch),"");

    }

    private static String removeCharacterFromString1(String str,char ch){
      char char1 =  '\u0000';
      String res = "";
       for(int  i =0;i<str.length();i++){
           if(str.charAt(i) == ch){
               res = str.replace(str.charAt(i),char1);
           }
       }
       return res;

    }



}
