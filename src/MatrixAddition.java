import java.util.Scanner;
public class MatrixAddition {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] matrix1 = new int[2][2];
        int[][] matrix2 = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }
        for (int k = 0; k < 2; k++) {
            for (int l = 0; l < 2; l++) {
                matrix2[k][l] = sc.nextInt();
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                IO.print(matrix1[i][j] + " ");
            }
            IO.println();
            for (int k = 0; k < 2; k++) {
                for (int l = 0; l < 2; l++) {
                    IO.print(matrix2[k][l] + " ");
                }
                IO.println();
            }
        }
    }
}