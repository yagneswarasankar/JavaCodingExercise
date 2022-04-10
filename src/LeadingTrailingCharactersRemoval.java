import java.util.Scanner;

public class LeadingTrailingCharactersRemoval {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.print("Enter the string : ");
        String str = scanner.nextLine();
        System.out.println(removeLeadingTrailingWhiteSpaces(str));

    }

    private static String removeLeadingTrailingWhiteSpaces(String str){

        System.out.println(str.trim().length());
        return str.trim();
       /* StringBuilder resString = new StringBuilder();
        resString = new StringBuilder(str.trim());
        System.out.println(resString.toString().length());
        return resString.toString();*/
    }




}
