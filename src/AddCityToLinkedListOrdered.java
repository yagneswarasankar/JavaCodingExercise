import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class AddCityToLinkedListOrdered {

    private static List<String> cities = new LinkedList<String>();
    public static void main(String[] args) {

        System.out.println(addCity(cities,"Delhi"));
        System.out.println(addCity(cities,"Hyderabad"));
        System.out.println(addCity(cities,"Vizag"));
        System.out.println(addCity(cities,"Delhi"));

        System.out.println(addCity(cities,"Kozhikod"));
        System.out.println(cities);




    }

    private static boolean addCity(List<String> cities,String newCity){
        ListIterator<String> stringListIterator = cities.listIterator();
            while(stringListIterator.hasNext()){
                int comparedTo = stringListIterator.next().compareTo(newCity);
                if(comparedTo ==0){
                    System.out.println("Entered list already exists");
                    return false;
                }else if(comparedTo >0){
                    stringListIterator.previous();
                    stringListIterator.add(newCity);
                    return true;
                }
            }


        stringListIterator.add(newCity);
        return true;




    }


}
