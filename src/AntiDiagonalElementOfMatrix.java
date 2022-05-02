import java.util.ArrayList;

public class AntiDiagonalElementOfMatrix {

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        //System.out.println(printAntiDiognalElements(matrix).toString());
        printAntiDiognalElements(matrix);
        diagonal(matrix);
    }

    private static void printAntiDiognalElements(int[][] matrix) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

        int N = matrix.length;
        for (int col = 0; col < matrix[0].length; col++) {
            int startCol = col, startRow = 0;

            while (startCol >= 0 && startRow < N) {
                System.out.print(matrix[startRow][startCol] + " ");
                startRow++;
                startCol--;
            }
            System.out.println();
        }
        for (int row = 1; row < matrix.length; row++) {
            int startRow = row, startCol = N - 1;
            while (startRow < N && startCol >= 0) {
                System.out.print(matrix[startRow][startCol] + " ");
                startCol--;
                startRow++;
            }
            System.out.println();
        }


    }

    private static ArrayList<ArrayList<Integer>> printAntiDiognalElements1(int[][] matrix) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                ArrayList<Integer> innerList = new ArrayList<>();
                while (i < j) {
                    innerList.add(matrix[i][j]);
                    innerList.add(matrix[j][i]);
                    i++;
                }
                //if()
                mainList.add(innerList);
            }

        }
        return mainList;
    }

    static void diagonal(int[][] A)
    {
        int n = A.length;
        int N = 2 * n - 1;

        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        for(int i = 0; i < N; i++)
            result.add(new ArrayList<>());

        System.out.println(result.toString());

        // Push each element in the result vector
       /* for(int i = 0; i < n; i++)
            for(int j = 0; j < n; j++)
                result.get(i + j).add(A[i][j]);

        // Print the diagonals
        for(int i = 0; i < result.size(); i++)
        {
            System.out.println();
            for(int j = 0; j < result.get(i).size(); j++)
                System.out.print(result.get(i).get(j) + " ");
        }*/
    }


}
