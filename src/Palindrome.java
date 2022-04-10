
import java.util.Scanner;
public class Palindrome {

    static private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter the String :");
        String str = scanner.nextLine();
        if(str.equals(reverseString(str))){
            System.out.println("Palindrom");
        }else{
            System.out.println("Not a palindrom");
        }

        if(isPalindrom(str)){
            System.out.println("Palindrom");
        }else{
            System.out.println("Not a palindrom");
        }




    }

    private static String reverseString(String str){
      String reverseString = "";
      for(int i = str.length()-1;i>=0;i--){
          reverseString += str.charAt(i);
      }
      return reverseString;
    }



    private static boolean isPalindrom(String str){
        boolean result = true;
        for(int i = 0; i< str.length()/2;i++){
            if(str.charAt(i) != str.charAt(str.length()-1 -i)){
                return false;
            }


        }

        return result;
    }
}
