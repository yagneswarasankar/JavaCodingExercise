public class CheckIfStringContainsInteger {

    public static void main(String[] args) {
        String strNumber = "Girija235";

        String str = getContainedNumber(strNumber);
        System.out.println(str);
        int num = Integer.parseInt(str) + 45;
        System.out.println(num);
      }

    private static String getContainedNumber(String str){
        char[] chrArray = str.toCharArray();
        StringBuilder resString = new StringBuilder();
        for(char ch: chrArray){
            if(Character.isDigit(ch)){
                resString.append(ch);
            }
        }
        return resString.toString();
    }
}
