import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // int rows = sc.nextInt();
        // int cols = sc.nextInt();

        // int arr[][] = new int[rows][cols];

        // int sum = 0;
        // int max = 0;
        // int count = 0;

        // for (int i = 0; i < rows; i++) {
        //     for (int j = 0; j < cols; j++) {
        //         arr[i][j] = sc.nextInt();
        //     }
        // }

        // for (int i = 0; i < rows; i++) {
        //     for (int j = 0; j < cols; j++) {

        //         // print
        //         System.out.print(arr[i][j] + " ");

        //         // sum
        //         sum += arr[i][j];

        //         // max
        //         if (arr[i][j] > max) {
        //             max = arr[i][j];
        //         }

        //         // count
        //         if (arr[i][j] > 0) {
        //             count += 1;
        //         }
        //     }
        //     System.out.println();
        // }

        // System.out.println("sum of all the elements = " + sum);
        // System.out.println("maximum element from 2d array = " + max);

        // // count total positive elements
        // System.out.println("count of all elements in 2d array = " + count);

        // sum of two matrix

        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int arr1[][] = new int[rows][cols];
        int arr2[][] = new int[rows][cols];
        int sum[][] = new int[rows][cols];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }
        //sum
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}
