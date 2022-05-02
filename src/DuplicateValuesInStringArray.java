import java.util.ArrayList;

public class DuplicateValuesInStringArray {

    public static void main(String[] args) {

        String[] strArray = {"Girija", "Hari", "Girija", "hari", "Srini", "Srini","Krishna"};
        System.out.println(findDuplicateStrings(strArray));

    }

    private static ArrayList<String> findDuplicateStrings(String[] strArray) {

        ArrayList<String> uniqueStringElements = new ArrayList<>();
        ArrayList<String> duplicateElements = new ArrayList<>();
        for (String str : strArray) {
            if (!uniqueStringElements.contains(str.toLowerCase())) {
                uniqueStringElements.add(str.toLowerCase());
            } else if (!duplicateElements.contains(str.toLowerCase())) {
                duplicateElements.add(str.toLowerCase());
            }
        }
        return duplicateElements;
    }


}
