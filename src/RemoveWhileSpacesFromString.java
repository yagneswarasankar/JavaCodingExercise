import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


//This program removes the emptry characters in the string

public class RemoveWhileSpacesFromString {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the string: ");
        String str = scanner.nextLine();
        replaceWhiteSpaceInString(str);
        traverseAndReplace(str);
        System.out.println(replaceAllMethod(str));
    }

    private static void replaceWhiteSpaceInString(String str) {
        String result = str.replace(" ", "");
        System.out.println("After removing the charracter: " + result);
    }

    private static void traverseAndReplace(String str) {
        StringBuilder reslut = new StringBuilder();
        char[] chrArray = str.toCharArray();
        for (char c : chrArray) {
            if (!Character.isWhitespace(c)) {
                reslut.append(c);
            }
        }
        System.out.println(reslut.toString());
    }
    private static String replaceAllMethod(String str){
       return str.replaceAll("\\s", "");
    }
}
