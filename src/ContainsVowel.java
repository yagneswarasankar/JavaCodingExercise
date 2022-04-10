import java.util.Arrays;
import java.lang.CharSequence;
public class ContainsVowel {


    public static void main(String[] args) {


        // System.out.println(containsVowel("Girija"));

        String str = "Girija 23San4kar";
        char[] charArray = str.toCharArray();
        for(char c: charArray){
            if(Character.isLetter(c) && c != ' '){
                System.out.println("Charracter is : "+c);
            }
        }
    }
    private static boolean containsVowel(String str){
     return str.toLowerCase().matches(".*[aeiou].*");
    }

    private static boolean containsVovel1(String str) {
        boolean result = false;
        for(int i = 0;i < str.length();i++){
            if(str.charAt(i) == 'a' ||
                    str.charAt(i) == 'e' ||
                    str.charAt(i) == 'i' ||
                    str.charAt(i) == 'o' ||
                    str.charAt(i) == 'u' ) {
                result = true;
                 break;
            }
        }
        return result;

    }







}
