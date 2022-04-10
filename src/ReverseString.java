import java.util.Scanner;

public class ReverseString {

    //This program will reverse the string input

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string to be reversed");
        String str = scanner.nextLine();
        System.out.println("Enter string : "+ str);
        System.out.println("Reversed String: "+reverseString(str));
        System.out.println("Reversed String: "+reverseString1(str));


    }

    //Method Take the string in character array.
    //Append the string to the reverse to the resultant
    static String reverseString(String str){
        char[] chrArray = str.toCharArray();
        String res ="";
        for(int i = chrArray.length -1; i>= 0;i--){
            res += chrArray[i];
        }
        return res;
    }

    //charAt will return the character at a certain index.
    //Traverse the string reverse and assign it to the resultant string
    static String reverseString1(String str){
        String resString = "";
        for(int i = str.length() -1;i >= 0;i-- ){
            resString += str.charAt(i);
        }
        return resString;
    }





}
