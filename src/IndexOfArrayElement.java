public class IndexOfArrayElement {

    public static void main(String[] args) {

        String[] strArray = {"Apple", "Krishna", "Srinivas"};
        String str = "kri";

        if (findIndexOfString(strArray, str) == -1) {
            System.out.println("Value not found");
        } else {
            System.out.println("Value found at " + findIndexOfString(strArray, str));
        }
    }
    private static int findIndexOfString(String[] strArray, String str){
        int index = -1;
        for(int i=0; i< strArray.length;i++ ){
            if(strArray[i].equalsIgnoreCase(str)){
                index = i;
                break;
            }
        }
        return index;

    }
}
