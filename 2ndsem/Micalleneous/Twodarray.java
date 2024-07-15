import java.util.*;

public class Twodarray {
    public static void main(String[] args) {
        // int[][]arr={{0,1,2},{3,4,5},{6,7,8}};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows of Matrix 1");
        int row = sc.nextInt();
        System.out.println("Enter the number of columns of Matrix 1");
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        System.out.println("Enter the number of rows of Matrix 2");
        int row1 = sc.nextInt();
        System.out.println("Enter the number of columns of Matrix 2");
        int col1 = sc.nextInt();
        int[][] arr1 = new int[row1][col1];
        int[][] sum = new int[row][col];

        if (row == row1 && col == col1) {
            System.out.println("Emter the number of elements in arr1");
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            System.out.println("Emter the number of elements in arr2");

            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < col1; j++) {
                    arr1[i][j] = sc.nextInt();
                    sum[i][j] = arr[i][j] + arr1[i][j];
                }
            }
            for (int x[] : sum) {
                for (int y : x) {
                    System.out.print(" " +  y);
                }
                System.out.print("\n");
            }
        } else {
            System.out.println("The number of rows and cold must be equal");
        }

    }
}
