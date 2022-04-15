public class ContainsAValue {

    public static void main(String[] args) {
        String[] strArray ={"Girija","Sankar","Duvvuri"};
        String val = "Girija1";

        System.out.println(arrayContainsElement(strArray,val));
    }

    private static boolean arrayContainsElement(String[] strArray,String str){

        boolean contains = false;
        for(String str1 : strArray ){
            if(str.equals(str1)){
                contains = true;
                break;
            }
        }
        return contains;

    }





}
