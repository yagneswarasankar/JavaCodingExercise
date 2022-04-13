//this program will check for the equality of two strings
public class StringEqual {

    public static void main(String[] args) {

        System.out.println(compareStrings("Girija","Girija"));
        System.out.println(compareStrings("Girija","girija"));
        System.out.println(compareStrings("Girija","girIja"));
        System.out.println(compareStrings("Girija","kgirija"));
        System.out.println(compareStrings("Girija","girbja"));
    }

    private static boolean compareStrings(String str1, String str2){
        return str1.equalsIgnoreCase(str2);
    }

    private static boolean compareStrings1(String str1, String str2) {
        return str1.toLowerCase().equals(str2.toLowerCase());
    }




}
