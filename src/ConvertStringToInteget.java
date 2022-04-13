import java.util.Scanner;

public class ConvertStringToInteget {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the string: ");
        String str  = scanner.nextLine();
        String str1 = "1235";
        System.out.println(convertStringtoIntegegr(str));
        System.out.println(convertStringtoIntegegr(str1));
    }

    private static int convertStringtoIntegegr(String str){
        return Integer.parseInt(str);
    }
}
