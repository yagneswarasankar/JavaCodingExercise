import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
/*        System.out.println("Enter the String1 : ");
        String str1 = scanner.nextLine();
        System.out.println("Enter the String2 : ");
        String str2 = scanner.nextLine();*/

/*        ArrayList<Character> str = new ArrayList<Character>();
        ArrayList<Character> str3 = new ArrayList<Character>();
        System.out.println(str.equals(str3));*/

        ArrayList<Character>  str4 = new ArrayList(Arrays.asList('a','b'));
        ArrayList<Character>  str5 = new ArrayList(Arrays.asList('b','a'));
        System.out.println(str4.containsAll(str5));


       /* str.add('c');
        str.add('c');
        str.add('d');
        System.out.println(str.equals(str3));

        str3.add('c');
        str3.add('c');
        str3.add('d');
        System.out.println(str.equals(str3));*/

        String str1 = "Girijak";
        String str2 = "Gkiarija";


        if (areAnagrams(str1, str2)) {
            System.out.println("The two strings are anagrams");

        } else {
            System.out.println("The two strings are not anagrams");
        }

    }

    private static boolean areAnagrams(String str1, String str2) {
        System.out.println(convertToArrayList(str1));
        System.out.println(convertToArrayList(str2));
        System.out.println(str1.length()+""+ str2.length());
          return (convertToArrayList(str1).containsAll(convertToArrayList(str2)) &&
        convertToArrayList(str2).containsAll(convertToArrayList(str1)));

    }

    private static ArrayList<Character> convertToArrayList(String str) {
        ArrayList<Character> distinctCharacters = new ArrayList<Character>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (!distinctCharacters.contains(c)) {
                distinctCharacters.add(c);
                //str = str.replaceAll(String.valueOf(c), "");
            }
        }
        return distinctCharacters;
    }
}