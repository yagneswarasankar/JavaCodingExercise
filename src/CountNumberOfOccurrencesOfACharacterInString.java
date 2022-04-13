import java.util.Scanner;

public class CountNumberOfOccurrencesOfACharacterInString {


    private static Scanner  scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.print("Enter the string : ");
        String str = scanner.nextLine();
        System.out.print("Enter the Character to be searched : ");
        char ch = scanner.next().charAt(0);

        System.out.println(countChar(str,ch));
        System.out.println(countChar(str,ch));

    }

    private static int countChar(String str, char ch){
        return (str.length() - str.replaceAll(String.valueOf(ch),"").length());
    }

    private static int countChar1(String str,char c){
        int count = 0;
        for(int i = 0; i< str.length(); i++){
            if(str.charAt(i) == c){
                count++;
            }
        }
        return count;
    }

}
