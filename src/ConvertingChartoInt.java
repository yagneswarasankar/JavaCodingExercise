public class ConvertingChartoInt {

    public static void main(String[] args) {

        int a = 'A';
        System.out.println(a);
        char b = 'A';
        System.out.println(Integer.valueOf(b));
        System.out.println(Integer.valueOf('G'));
        System.out.println(Character.valueOf('A'));
        System.out.println('\u20B9'+String.valueOf(79));

    }
}


