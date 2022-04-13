import java.util.ArrayList;
import java.util.List;

public class DuplicateCharsInString {

    public static void main(String[] args) {

        checkForDuplicateChars("airijabba");

    }

    private static void checkForDuplicateChars(String str){
        int count = 0;
        ArrayList<Character> charList = new ArrayList<>();
        for(int i = 0; i< str.length();i++){
            char c = str.charAt(i);
            for(int j = 0; j < str.length();j++){
                if(str.charAt(j) != c){
                    continue;
                }
                count++;
            }


            if(!charList.contains(c)) {
                if (count > 1 && c != ' ') {

                    System.out.println("The character " + c + " appeared " + count + " times");
                    charList.add(c);
                }
            }
            count = 0;

        }
    }

}
