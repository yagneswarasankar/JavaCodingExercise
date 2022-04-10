import java.util.LinkedList;
import java.util.List;

public class LinkedListReverse {

    private static List<Integer> ll = new LinkedList<Integer>();

    public static void main(String[] args) {
        ll.add(34);
        ll.add(45);
        ll.add(54);
        System.out.println(ll);

        for(int i = ll.size()-1; i>= 0; i--){
            System.out.println(ll.get(i));
        }
    }

}
