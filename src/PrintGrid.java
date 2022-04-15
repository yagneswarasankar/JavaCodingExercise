public class PrintGrid {

    public static void main(String[] args) {
        int num = 10;
        printGrid(num);
    }

    private static void printGrid(int num){
        for(int i = 0; i< num; i++){
            for(int j = 0; j < num; j++){
                System.out.print("- ");
            }
            System.out.println();

        }

    }


}
