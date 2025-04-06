import java.util.Scanner;

public class MatrixOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix1 = new int[2][2];
        int[][] matrix2 = new int[2][2];
        int[][] result = new int[2][2];
        int i, j, k, choice;

        System.out.println("Enter elements of the first 2x2 matrix:");
        for (i = 0; i < 2; i++) 
            for (j = 0; j < 2; j++) 
                matrix1[i][j] = sc.nextInt();

        System.out.println("Enter elements of the second 2x2 matrix:");
        for (i = 0; i < 2; i++) 
            for (j = 0; j < 2; j++) 
                matrix2[i][j] = sc.nextInt();

        System.out.println("Choose an operation: 1) Addition 2) Multiplication 3) Transpose");
        choice = sc.nextInt();

        switch (choice) {
            case 1: // Addition
                for (i = 0; i < 2; i++)
                    for (j = 0; j < 2; j++)
                        result[i][j] = matrix1[i][j] + matrix2[i][j];
                break;
            case 2: // Multiplication
                for (i = 0; i < 2; i++)
                    for (j = 0; j < 2; j++)
                        for (k = 0; k < 2; k++)
                            result[i][j] += matrix1[i][k] * matrix2[k][j];
                break;
            case 3: // Transpose
                for (i = 0; i < 2; i++)
                    for (j = 0; j < 2; j++)
                        result[i][j] = matrix1[j][i];
                break;
            default:
                System.out.println("Invalid choice.");
                return;
        }

        System.out.println("Result:");
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
