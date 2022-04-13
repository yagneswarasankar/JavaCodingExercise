import java.util.StringTokenizer;

public class CountNumberOfStringsInSentence {

    public static void main(String[] args) {

        String sentence = "Hi how are you are you a good programmer";


        System.out.println("Number of words using StringTokenizer: ");
        System.out.println(numberOfWords(sentence));
        System.out.println(numberOfWordsUsingSplit(sentence));

    }
    private static int numberOfWords(String sentence){
        StringTokenizer stringTokenizer = new StringTokenizer(sentence);
        return stringTokenizer.countTokens();
    }

    private static int numberOfWordsUsingSplit(String sentence){
        String[] strArray = sentence.split("\\s");
        return strArray.length;
    }




}
