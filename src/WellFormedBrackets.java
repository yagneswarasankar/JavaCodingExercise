import java.util.ArrayList;

public class WellFormedBrackets {

    public static void main(String[] args) {

        String brackets = "((()()))";

        if(isValid(brackets)){
            System.out.println("The string is valid");
        }else{
            System.out.println("This is not valid");
        }
    }

    private static boolean isValid(String str){
        ArrayList<Character> res = new ArrayList<Character>();
        ArrayList<Character> temp = new ArrayList<>();


        char[] charArray = str.toCharArray();
        for (char ch : charArray) {
            if(ch == '('){
                temp.add('(');
            }
            if(temp.isEmpty()){
                return false;
            }
            if(ch == ')'){
                if(temp.isEmpty()){
                    continue;
                }else{
                    temp.remove(temp.lastIndexOf('('));
                }
            }

        }
       return temp.isEmpty();
    }
}


