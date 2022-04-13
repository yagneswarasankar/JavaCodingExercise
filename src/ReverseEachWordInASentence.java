public class ReverseEachWordInASentence {


    public static void main(String[] args) {

        String str  = "Hi all how are you doing ?";
        System.out.println(reverseSentense(str));

    }
    private static String  reverseSentense(String str){
        String resString = "";
        String[] strArray  = str.split("\\s");
        for(int i = strArray.length-1;i>= 0; i--){
            resString += reverseString(strArray[i])+" ";
        }

        return resString;

    }

    private static String reverseString(String str){
        StringBuilder reversedString = new StringBuilder();
        for(int i = str.length()-1; i >=0; i--){
            reversedString.append(str.charAt(i));
        }
        return reversedString.toString();
    }






}
