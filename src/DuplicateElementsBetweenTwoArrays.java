import java.util.ArrayList;
import java.util.Arrays;

public class DuplicateElementsBetweenTwoArrays {


    public static void main(String[] args) {
        String[] strArray1 = {"Krishna","girija","Kumar","john"};
        String[] strArray2 = {"krishna","Kumar","Hari"};
        System.out.println("Duplicate Elements : "+ findDuplicateElement(strArray1,strArray2).toString());
    }

    private static ArrayList<String> findDuplicateElement(String[] strArray1, String[] strArray2){
        ArrayList<String> duplicateStrings = new ArrayList<>();
        for(String str1: strArray1){
            for(String str2: strArray2){
                if(str1.equalsIgnoreCase(str2)){
                    duplicateStrings.add(str1);
                }
            }
        }
        return duplicateStrings;




    }
}
